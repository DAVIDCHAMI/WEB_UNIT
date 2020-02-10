package com.todo1.svp.questions.autenticacion;

import static com.todo1.svp.userinterfaces.autenticacion.GenerarClavePage.TOOLTIP;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MensajeAyuda implements Question<Boolean> {

  private static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

  private List<String> mensajeAyuda;

  public MensajeAyuda(List<String> mensajeAyuda) {
    this.mensajeAyuda = mensajeAyuda;
  }

  public static MensajeAyuda enTooltip(List<String> mensajeAyuda) {
    return new MensajeAyuda(mensajeAyuda);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean resultado = false;
    List<WebElementFacade> listaTooltip = TOOLTIP.resolveAllFor(actor);
    for (int i = 0; i < listaTooltip.size(); i++) {
      actor.attemptsTo(MoveMouse.to(listaTooltip.get(i)));
      try {
        resultado =
            listaTooltip
                .get(i)
                .findBy(By.xpath(".//span"))
                .getText()
                .replace("\n", " ")
                .equals(mensajeAyuda.get(i));
      } catch (NoSuchElementException e) {
        LOGGER.info("El elemento no se encuentra en el DOM: ", e);
        resultado =
            listaTooltip
                .get(i)
                .findBy(By.xpath(".//div[text()='" + mensajeAyuda.get(i) + "']"))
                .isVisible();
      }
      if (!resultado) {
        break;
      }
    }
    return resultado;
  }
}
