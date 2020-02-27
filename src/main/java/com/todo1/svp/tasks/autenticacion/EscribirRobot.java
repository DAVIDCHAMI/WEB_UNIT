package com.todo1.svp.tasks.autenticacion;

import static com.todo1.svp.interactions.EscribirTeclado.escribir;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class EscribirRobot implements Task {

  private List<Map<String, String>> campo;

  public EscribirRobot(List<Map<String, String>> campo) {
    this.campo = campo;
  }

  public static EscribirRobot enElCampo(List<Map<String, String>> campo) {
    return instrumented(EscribirRobot.class, campo);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    for (Map<String, String> datatable : campo) {
      String campoEscribir = datatable.get("Campo a escribir");
      String palabraEscribir = datatable.get("palabra a escribir");
      if (!palabraEscribir.isEmpty()) {
        actor.attemptsTo(escribir(palabraEscribir, campoEscribir));
      }
    }
  }
}
