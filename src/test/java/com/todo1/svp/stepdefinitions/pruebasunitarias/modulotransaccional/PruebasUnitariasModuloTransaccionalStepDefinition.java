package com.todo1.svp.stepdefinitions.pruebasunitarias.modulotransaccional;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.todo1.svp.tasks.modulotransaccional.IngresarCategoriaDetalles;
import cucumber.api.java.es.Cuando;

public class PruebasUnitariasModuloTransaccionalStepDefinition {

  @Cuando("el ingresa a los detalles de (.*) con numero (.*)")
  public void ingresarDetalles(String categoria, String numeroProducto) {
    theActorInTheSpotlight()
        .attemptsTo(IngresarCategoriaDetalles.movimientos(categoria, numeroProducto));
  }
}
