package com.todo1.svp.runners.verificartextos.modulotransaccional;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features =
        "src/test/resources/features/verificartextos/modulotransaccional/verificar_textos_detalles_productos.feature",
    glue = "com.todo1.svp.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class VerificarTextosPantallaDetallesProductosRunner {}
