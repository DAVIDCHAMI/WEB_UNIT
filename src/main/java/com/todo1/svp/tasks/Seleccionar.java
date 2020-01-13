package com.todo1.svp.tasks;

import static com.todo1.svp.userinterfaces.GenerarClavePage.OPCION_TYPE_LIST;
import static com.todo1.svp.userinterfaces.GenerarClavePage.SELECT_TYPE_LIST;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Seleccionar implements Task {

  private static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

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
    try {
      Thread.sleep(2000);
      actor.attemptsTo(
          Click.on(SELECT_TYPE_LIST.of(nombreCampo)),
          Click.on(OPCION_TYPE_LIST.of(opcionSeleccionar)));
    } catch (InterruptedException e) {
      LOGGER.info("Se interrumpio el tiempo necesario", e);
    }
  }
}
