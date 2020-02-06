package com.todo1.svp.questions.autenticacion;

import static com.todo1.svp.userinterfaces.autenticacion.UsuarioPage.MENSAJE_VALIDACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeValidacionCampo implements Question<Boolean> {

  private String mensajeValidacion;

  public MensajeValidacionCampo(String mensajeValidacion) {
    this.mensajeValidacion = mensajeValidacion;
  }

  public static MensajeValidacionCampo esVisible(String mensajeValidacion) {
    return new MensajeValidacionCampo(mensajeValidacion);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    if (mensajeValidacion.isEmpty()) {
      return true;
    }
    return MENSAJE_VALIDACION.of(mensajeValidacion).resolveFor(actor).isVisible();
  }
}
