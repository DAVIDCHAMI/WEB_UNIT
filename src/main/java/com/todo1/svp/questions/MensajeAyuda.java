package com.todo1.svp.questions;

import static com.todo1.svp.userinterfaces.GenerarClavePage.TOOLTIP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.By;

public class MensajeAyuda implements Question<Boolean> {

  private String mensajeAyuda;

  public MensajeAyuda(String mensajeAyuda) {
    this.mensajeAyuda = mensajeAyuda;
  }

  public static MensajeAyuda enTooltip(String mensajeAyuda) {
    return new MensajeAyuda(mensajeAyuda);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    actor.attemptsTo(MoveMouse.to(TOOLTIP));
    return TOOLTIP
        .resolveFor(actor)
        .findBy(By.xpath(".//span"))
        .getText()
        .replace("\n", " ")
        .equals(mensajeAyuda);
  }
}
