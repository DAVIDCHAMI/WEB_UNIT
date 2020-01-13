package com.todo1.svp.tasks;

import static com.todo1.svp.userinterfaces.GenerarClavePage.OPCION_TYPE_LIST;
import static com.todo1.svp.userinterfaces.GenerarClavePage.SELECT_TYPE_LIST;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Seleccionar implements Task {

  private String nombreCampo;
  private String opcionSeleccionar;

  public Seleccionar(String nombreCampo, String opcionSeleccionar) {
    this.nombreCampo = nombreCampo;
    this.opcionSeleccionar = opcionSeleccionar;
  }

  public static Seleccionar opcionLista(String nombreCampo, String opcionSeleccionar) {
    return instrumented(Seleccionar.class, nombreCampo, opcionSeleccionar);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(SELECT_TYPE_LIST.of(nombreCampo), isClickable()),
        Click.on(SELECT_TYPE_LIST.of(nombreCampo)),
        Click.on(OPCION_TYPE_LIST.of(opcionSeleccionar)));
  }
}
