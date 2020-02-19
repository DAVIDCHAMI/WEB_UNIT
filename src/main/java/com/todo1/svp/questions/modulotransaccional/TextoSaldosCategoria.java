package com.todo1.svp.questions.modulotransaccional;

import static com.todo1.svp.interactions.Esperar.esperar;
import static com.todo1.svp.userinterfaces.modulotransaccional.SaldosCategoriaPage.CATEGORIA;
import static com.todo1.svp.utils.Utilidades.eliminarTildesCadena;
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
  private String descripcion;
  private static final String DESCRIPCION = "Descripcion";
  private static final String NOMBRE_PERZONALIZADO = "Nombre personalizado";
  private static final String NUMERO_PRODUCTO = "Numero producto";

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
    if ("false"
        .equalsIgnoreCase(
            CATEGORIA.of(categoria).resolveFor(actor).getAttribute("data-expanded"))) {
      actor.attemptsTo(Click.on(CATEGORIA.of(categoria)));
    }
    esperar(2000);
    for (Map<String, String> texto : textos) {
      descripcion = texto.get(DESCRIPCION);
      if ("Crediagil".equals(eliminarTildesCadena(categoria))) {
        resultado =
            verificarTextoSaldos(actor, texto.get(DESCRIPCION))
                & verificarFormatoValor(actor, texto.get(DESCRIPCION));
      } else {
        resultado =
            verificarTextoSaldos(actor, texto.get(NOMBRE_PERZONALIZADO))
                & verificarTextoSaldos(actor, texto.get(DESCRIPCION))
                & verificarTextoSaldos(actor, texto.get(NUMERO_PRODUCTO))
                & verificarFormatoValor(actor, texto.get(NUMERO_PRODUCTO));
      }
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
                    ".//div[@class='account-row-content']//span[contains(.,'"
                        + numeroProducto
                        + "')]"));
    switch (eliminarTildesCadena(categoria)) {
      case "Cuentas":
      case "Creditos":
        resultado = obtenerResultadoValor();
        break;
      case "Crediagil":
        resultado = obtenerResultadoValorCrediagil();
        break;
      case "Tarjetas de cr?dito":
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
    boolean resultado;
    if (!"Inversion virtual".equals(eliminarTildesCadena(descripcion))) {
      String saldoDisponible =
          categoriaProducto
              .findElement(By.xpath("./../../../..//div[contains(.,'Saldo disponible')]/span[1]"))
              .getText();
      String saldoTotal =
          categoriaProducto
              .findElement(By.xpath("./../../../..//div[contains(.,'Saldo total')]/span[2]"))
              .getText();
      resultado = verificarFormatoMoneda(saldoDisponible) & verificarFormatoMoneda(saldoTotal);
    } else {
      String saldoCapital =
          categoriaProducto
              .findElement(By.xpath("./../../../..//div[contains(.,'Capital')]/span"))
              .getText();
      resultado = verificarFormatoMoneda(saldoCapital);
    }
    return resultado;
  }

  private boolean verificarTextoSaldos(Actor actor, String texto) {
    actor.attemptsTo(esperar(3000));
    return CATEGORIA
        .of(categoria)
        .resolveFor(actor)
        .findBy(By.xpath(".//span[contains(.,'" + texto + "')]"))
        .isVisible();
  }

  private boolean obtenerResultadoValor() {
    String valoresCredito =
        categoriaProducto
            .findElement(
                By.xpath(
                    "./../../../..//div/span["
                        + "contains(.,'Saldo disponible') or contains(.,'Deuda a la fecha')]/../../..//div/span[contains(.,'$')]"))
            .getText();
    return verificarFormatoMoneda(valoresCredito);
  }

  private boolean obtenerResultadoValorCrediagil() {
    String valoresCredito =
        categoriaProducto
            .findElement(
                By.xpath(
                    "./../../../..//div["
                        + "contains(.,'Cupo disponible')]/../../..//div/span[contains(.,'$')]"))
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
