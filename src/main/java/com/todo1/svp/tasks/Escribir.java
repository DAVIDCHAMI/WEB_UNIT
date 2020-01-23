package com.todo1.svp.tasks;

import static com.todo1.svp.interactions.EscribirTeclado.escribir;
import static com.todo1.svp.userinterfaces.UsuarioPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

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
    String campoEscribir;
    String palabraEscribir;
    for (Map<String, String> stringStringMap : campo) {
      campoEscribir = stringStringMap.get("Campo a escribir");
      palabraEscribir = stringStringMap.get("palabra a escribir");
      if (!palabraEscribir.isEmpty()) {
        actor.attemptsTo(escribir(palabraEscribir, campoEscribir));
      }
    }
  }
}
