package com.todo1.svp.questions;

import static com.todo1.svp.userinterfaces.TextoPantallaPage.*;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TextoMostradosPantalla implements Question<Boolean> {

  private List<String> mensajes;

  public TextoMostradosPantalla(List<String> mensajes) {
    this.mensajes = mensajes;
  }

  public static TextoMostradosPantalla esCorrecto(List<String> mensajes) {
    return new TextoMostradosPantalla(mensajes);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean mensajeCorrecto = false;
    for (String mensaje : mensajes) {
      mensajeCorrecto = ELEMENTO_MENSAJE.of(mensaje).resolveFor(actor).isVisible();
      if (!mensajeCorrecto) {
        break;
      }
    }
    return mensajeCorrecto;
  }
}
