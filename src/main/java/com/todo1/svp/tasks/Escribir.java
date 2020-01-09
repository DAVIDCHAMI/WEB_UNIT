package com.todo1.svp.tasks;

import static com.todo1.svp.userinterfaces.UsuarioPage.*;
import static com.todo1.svp.utils.EscrituraTeclado.escribirCaracter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
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
        if ("clave".equalsIgnoreCase(campoEscribir)) {
          escribirCampo(actor, campoEscribir, caracter, CAMPO_CLAVE);
        } else {
          escribirCampo(actor, campoEscribir, caracter, CAMPO);
        }
      }
    }
    actor.attemptsTo(Click.on(LOGO_BANCOLOMBIA));
  }

  private void escribirCampo(Actor actor, String campo, char[] caracteres, Target elemento) {
    actor.attemptsTo(Click.on(elemento.of(campo)));
    elemento.of(campo).resolveFor(actor).clear();
    for (char caractere : caracteres) {
      try {
        escribirCaracter(caractere);
      } catch (Exception e) {
        LOGGER.error("No se escribio el caracter esperado", e);
      }
    }
  }
}
