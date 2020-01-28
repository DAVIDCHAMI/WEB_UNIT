package com.todo1.svp.questions;

import static com.todo1.svp.interactions.Esperar.esperar;
import static com.todo1.svp.userinterfaces.SaldosCategoriaPage.CATEGORIA;
import static com.todo1.svp.utils.enums.EnumFormatoMoneda.DOLARES;
import static com.todo1.svp.utils.enums.EnumFormatoMoneda.PESOS;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextoSaldosCategoria implements Question<Boolean> {

  private List<Map<String, String>> textos;
  private String categoria;
  private WebElement categoriaProducto;

  public TextoSaldosCategoria(String tipoCategoria, List<Map<String, String>> textos) {
    this.textos = textos;
    this.categoria = tipoCategoria;
  }

  public static TextoSaldosCategoria esCorrecto(
      String tipoCategoria, List<Map<String, String>> textos) {
    return new TextoSaldosCategoria(tipoCategoria, textos);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean resultado = false;
    actor.attemptsTo(Click.on(CATEGORIA.of(categoria)));
    for (Map<String, String> texto : textos) {
      resultado =
          verificarTextoSaldos(actor, texto.get("Nombre personalizado"))
              & verificarTextoSaldos(actor, texto.get("Descripcion"))
              & verificarTextoSaldos(actor, texto.get("Numero producto"))
              & verificarFormatoValor(actor, texto.get("Numero producto"));
    }
    return resultado;
  }

  private boolean verificarFormatoValor(Actor actor, String numeroProducto) {
    boolean resultado;
    categoriaProducto =
        CATEGORIA
            .of(categoria)
            .resolveFor(actor)
            .findElement(
                By.xpath(
                    "//div[@class='account-row-content']//span[contains(.,'"
                        + numeroProducto
                        + "')]"));
    switch (categoria) {
      case "Cuentas":
      case "Créditos":
        resultado = obtenerResultadoValorCreditos();
        break;
      case "Tarjetas de crédito":
        resultado = obtenerResultadoValoresTarjetasCredito();
        break;
      case "Inversiones":
        resultado = obtenerResultadoValoresInversiones();
        break;
      default:
        resultado = false;
    }
    return resultado;
  }

  private boolean obtenerResultadoValoresInversiones() {
    String saldoDisponible =
        categoriaProducto
            .findElement(By.xpath("./../../../..//div[contains(.,'Saldo disponible')]/span[1]"))
            .getText();
    String saldoTotal =
        categoriaProducto
            .findElement(By.xpath("./../../../..//div[contains(.,'Saldo total')]/span[2]"))
            .getText();
    return verificarFormatoMoneda(saldoDisponible) & verificarFormatoMoneda(saldoTotal);
  }

  private boolean verificarTextoSaldos(Actor actor, String texto) {
    actor.attemptsTo(esperar(3000));
    return CATEGORIA
        .of(categoria)
        .resolveFor(actor)
        .findBy(By.xpath(".//span[contains(.,'" + texto + "')]"))
        .isVisible();
  }

  private boolean obtenerResultadoValorCreditos() {
    String valoresCredito =
        categoriaProducto
            .findElement(
                By.xpath(
                    "./../../../..//div/span["
                        + "contains(.,'Saldo disponible') or contains(.,'Deuda a la fecha')]/../../..//div/span[contains(.,'$')]"))
            .getText();
    return verificarFormatoMoneda(valoresCredito);
  }

  private boolean obtenerResultadoValoresTarjetasCredito() {
    boolean resultado = false;
    List<WebElement> valores =
        categoriaProducto.findElements(
            By.xpath(
                "./../../../..//div/span[contains(.,'Deuda a la fecha')]/../..//div[contains(.,'$')]"));
    for (WebElement valorTarjetaCredito : valores) {
      resultado = verificarFormatoMoneda(valorTarjetaCredito.getText());
      if (!resultado) {
        break;
      }
    }
    return resultado;
  }

  private boolean verificarFormatoMoneda(String valor) {
    boolean resultadoFormado;
    if (valor.contains("USD")) {
      resultadoFormado = Pattern.matches(DOLARES.getValor(), valor);
    } else {
      resultadoFormado = Pattern.matches(PESOS.getValor(), valor);
    }
    return resultadoFormado;
  }
}
