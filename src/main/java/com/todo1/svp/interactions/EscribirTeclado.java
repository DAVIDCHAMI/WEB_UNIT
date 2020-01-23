package com.todo1.svp.interactions;

import static com.todo1.svp.userinterfaces.UsuarioPage.CAMPO;
import static com.todo1.svp.userinterfaces.UsuarioPage.LOGO_BANCOLOMBIA;
import static com.todo1.svp.utils.MapeoTeclado.escribirCaracter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EscribirTeclado implements Interaction {

  private static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

  private String palabra;
  private String campoEscribir;

  public EscribirTeclado(String palabra, String campoEscribir) {
    this.palabra = palabra;
    this.campoEscribir = campoEscribir;
  }

  public static EscribirTeclado escribir(String palabra, String campoEscribir) {
    return instrumented(EscribirTeclado.class, palabra, campoEscribir);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    if (BrowseTheWeb.as(actor).getDriver().toString().contains("chrome")
        | BrowseTheWeb.as(actor).getDriver().toString().contains("edge")) {
      escribirTeclado(actor);
    } else {
      if ("clave".equals(campoEscribir)) {
        escribirTeclado(actor);
      } else {
        while (!CAMPO.of(campoEscribir).resolveFor(actor).getValue().isEmpty()) {
          CAMPO.of(campoEscribir).resolveFor(actor).clear();
        }
        actor.attemptsTo(SendKeys.of(palabra).into(CAMPO.of(campoEscribir)));
      }
    }
    actor.attemptsTo(Click.on(LOGO_BANCOLOMBIA));
  }

  private void escribirTeclado(Actor actor) {
    char[] caracter = palabra.toLowerCase().toCharArray();
    CAMPO.of(campoEscribir).resolveFor(actor).clear();
    actor.attemptsTo(
        WaitUntil.the(CAMPO.of(campoEscribir), isClickable()), Click.on(CAMPO.of(campoEscribir)));
    for (char caracteres : caracter) {
      try {
        escribirCaracter(caracteres);
      } catch (Exception e) {
        LOGGER.error("No se escribio el caracter esperado", e);
      }
    }
  }
}
