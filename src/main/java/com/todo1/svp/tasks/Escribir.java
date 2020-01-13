package com.todo1.svp.tasks;

import static com.todo1.svp.userinterfaces.UsuarioPage.*;
import static com.todo1.svp.utils.EscrituraTeclado.escribirCaracter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Escribir implements Task {

  private static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

  private List<Map<String, String>> campo;

  public Escribir(List<Map<String, String>> campo) {
    this.campo = campo;
  }

  public static Escribir enElCampo(List<Map<String, String>> campo) {
    return instrumented(Escribir.class, campo);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String campoEscribir;
    String palabraEscribir;
    for (Map<String, String> stringStringMap : campo) {
      campoEscribir = stringStringMap.get("Campo a escribir");
      palabraEscribir = stringStringMap.get("palabra a escribir");
      char[] caracter = palabraEscribir.toLowerCase().toCharArray();
      if (!palabraEscribir.isEmpty()) {
        escribirCampo(actor, campoEscribir, caracter);
      }
    }
    actor.attemptsTo(Click.on(LOGO_BANCOLOMBIA));
  }

  private void escribirCampo(Actor actor, String campo, char[] caracteres) {
    actor.attemptsTo(WaitUntil.the(CAMPO.of(campo), isClickable()), Click.on(CAMPO.of(campo)));
    CAMPO.of(campo).resolveFor(actor).clear();
    for (char caractere : caracteres) {
      try {
        escribirCaracter(caractere);
      } catch (Exception e) {
        LOGGER.error("No se escribio el caracter esperado", e);
      }
    }
  }
}
