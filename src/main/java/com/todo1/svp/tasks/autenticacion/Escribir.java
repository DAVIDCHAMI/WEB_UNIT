package com.todo1.svp.tasks.autenticacion;

import static com.todo1.svp.interactions.EscribirTeclado.escribir;
import static com.todo1.svp.userinterfaces.autenticacion.UsuarioPage.CAMPO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class Escribir implements Task {

  private List<Map<String, String>> campo;

  public Escribir(List<Map<String, String>> campo) {
    this.campo = campo;
  }

  public static Escribir enElCampo(List<Map<String, String>> campo) {
    return instrumented(Escribir.class, campo);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    for (Map<String, String> datatable : campo) {
      String campoEscribir = datatable.get("Campo a escribir");
      String palabraEscribir = datatable.get("palabra a escribir");
      if (!palabraEscribir.isEmpty()) {
        if (System.getProperty("ejecucion").equals("local")) {
          actor.attemptsTo(escribir(palabraEscribir, campoEscribir));
        } else {
          actor.attemptsTo(Enter.theValue(palabraEscribir).into(CAMPO.of(campoEscribir)));
        }
      }
    }
  }
}
