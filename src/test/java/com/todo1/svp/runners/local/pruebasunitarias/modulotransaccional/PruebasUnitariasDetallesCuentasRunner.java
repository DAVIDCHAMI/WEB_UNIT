package com.todo1.svp.runners.local.pruebasunitarias.modulotransaccional;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features =
        "src/test/resources/features/local/pruebasunitarias/modulotransaccional/pruebas_unitarias_detalles_movimientos.feature",
    glue = "com.todo1.svp.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class PruebasUnitariasDetallesCuentasRunner {}
