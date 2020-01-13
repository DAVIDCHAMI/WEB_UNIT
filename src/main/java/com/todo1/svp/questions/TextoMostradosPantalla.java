package com.todo1.svp.questions;

import static com.todo1.svp.userinterfaces.TextoPantallaPage.*;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.ElementNotVisibleException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextoMostradosPantalla implements Question<Boolean> {

  private static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

  private List<String> mensajes;

  public TextoMostradosPantalla(List<String> mensajes) {
    this.mensajes = mensajes;
  }

  public static TextoMostradosPantalla esCorrecto(List<String> mensajes) {
    return new TextoMostradosPantalla(mensajes);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean mensajeCorrecto = true;
    for (String mensaje : mensajes) {
      try {
        if (!SPAN_MENSAJE.of(mensaje).resolveFor(actor).isVisible()) {
          throw new ElementNotVisibleException("");
        }
      } catch (ElementNotVisibleException e) {
        LOGGER.info("El elemento no se encuentra", e);
        if (!DIV_MENSAJE.of(mensaje).resolveFor(actor).isVisible()) {
          mensajeCorrecto = false;
        }
      }
      if (!mensajeCorrecto) {
        break;
      }
    }
    return mensajeCorrecto;
  }
}
