package com.todo1.svp.runners.pipeline.verificartextos.autenticacion;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features =
        "src/test/resources/features/pipeline/verificartextos/autenticacion/verificar_textos_autenticacion.feature",
    glue = "com.todo1.svp.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class VerificarTextosPantallaAutenticacionRunner {}
