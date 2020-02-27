package com.todo1.svp.runners.local.verificartextos.modulotransaccional;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features =
        "src/test/resources/features/local/verificartextos/modulotransaccional/verificar_textos_consulta_pagos.feature",
    glue = "com.todo1.svp.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class VerificarTextosPantallaConsultaPagosRunner {}
