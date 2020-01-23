package com.todo1.svp.runners.pruebasunitarias.autenticacion;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features =
        "src/test/resources/features/pruebasunitarias/autenticacion/pruebas_unitarias_campos_clave.feature",
    glue = "com.todo1.svp.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class PruebasUnitariasCampoClaveRunner {}
