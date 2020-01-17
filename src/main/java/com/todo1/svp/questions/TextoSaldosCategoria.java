package com.todo1.svp.questions;

import static com.todo1.svp.userinterfaces.SaldosCategoriaPage.CATEGORIA;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

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
          verificarFormatoValor(actor)
              & verificarTextoSaldos(actor, texto.get("Nombre personalizado"))
              & verificarTextoSaldos(actor, texto.get("Descripcion"))
              & verificarTextoSaldos(actor, texto.get("Numero producto"));
      if (!resultado) {
        break;
      }
    }
    return resultado;
  }

  private boolean verificarFormatoValor(Actor actor) {
    String valor =
        CATEGORIA
            .of(categoria)
            .resolveFor(actor)
            .findBy(By.xpath(".//span[contains(.,'$')]"))
            .getText();
    return Pattern.matches("^\\$ -?(\\d{1,3}\\s*?([.,]|$|\\s)\\s?)+\\d{2}$", valor);
  }

  private boolean verificarTextoSaldos(Actor actor, String texto) {
    return CATEGORIA
        .of(categoria)
        .resolveFor(actor)
        .findBy(By.xpath(".//span[contains(.,'" + texto + "')]"))
        .isVisible();
  }
}
