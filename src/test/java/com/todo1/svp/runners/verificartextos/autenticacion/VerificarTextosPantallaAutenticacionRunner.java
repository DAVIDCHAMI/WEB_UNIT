package com.todo1.svp.runners.verificartextos.autenticacion;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features =
        "src/test/resources/features/verificartextos/autenticacion/verificar_textos_autenticacion.feature",
    glue = "com.todo1.svp.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class VerificarTextosPantallaAutenticacionRunner {}
