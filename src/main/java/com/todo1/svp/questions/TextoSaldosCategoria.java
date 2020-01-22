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
              & verificarFormatoValor(
                  actor, texto.get("Numero producto"), texto.get("Descripcion"));
    }
    return resultado;
  }

  private boolean verificarFormatoValor(Actor actor, String numeroProducto, String productos) {
    boolean resultado;
    String valorDolares = "";
    WebElement producto =
        CATEGORIA
            .of(categoria)
            .resolveFor(actor)
            .findElement(
                By.xpath(
                    "//div[@class='account-row-content']//span[contains(.,'"
                        + numeroProducto
                        + "')]"));
    String valorPeso =
        producto
            .findElement(
                By.xpath(
                    "./../../../..//div/span["
                        + "contains(.,'Saldo disponible') or contains(.,'Deuda a la fecha')]/../../..//div/span[contains(.,'$')]"))
            .getText();
    if ("Tarjetas de cr�dito".equals(categoria)) {
      if (!"Personal Visa".equals(productos)) {
        valorDolares =
            producto
                .findElement(
                    By.xpath(
                        "./../../../..//div/span[contains(.,'Saldo disponible') or contains("
                            + ".,'Deuda a la fecha')]/../..//div[contains(.,'USD')]"))
                .getText();
      }
      if (valorDolares.isEmpty()) {
        resultado = verificarFormato(PESOS.getValor(), valorPeso);
      } else {
        resultado =
            verificarFormato(DOLARES.getValor(), valorDolares)
                & verificarFormato(PESOS.getValor(), valorPeso);
      }
    } else {
      resultado = verificarFormato(PESOS.getValor(), valorPeso);
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

  private boolean verificarFormato(String formato, String valor) {
    return Pattern.matches(formato, valor);
  }
}
