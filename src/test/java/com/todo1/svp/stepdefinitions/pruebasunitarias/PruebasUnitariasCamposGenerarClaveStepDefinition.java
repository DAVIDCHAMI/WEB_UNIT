package com.todo1.svp.stepdefinitions.pruebasunitarias;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.todo1.svp.tasks.Seleccionar;
import cucumber.api.java.es.Cuando;

public class PruebasUnitariasCamposGenerarClaveStepDefinition {

  @Cuando("el selecciona un (.*): (.*)")
  public void seleccionarDocumento(String nombreCampo, String opcionSeleccionar) {
    theActorInTheSpotlight().attemptsTo(Seleccionar.opcionLista(nombreCampo, opcionSeleccionar));
  }
}
