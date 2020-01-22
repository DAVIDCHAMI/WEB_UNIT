package com.todo1.svp.stepdefinitions.verificartextospantalla;

import static com.todo1.svp.exceptions.TextoNoVisibleException.TEXTO_MENSAJE_NO_SE_ENCUENTRA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.todo1.svp.exceptions.TextoNoVisibleException;
import com.todo1.svp.questions.MensajeAyuda;
import com.todo1.svp.questions.TextoMostradosPantalla;
import com.todo1.svp.questions.TextoSaldosCategoria;
import com.todo1.svp.tasks.IniciarSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import java.util.List;
import java.util.Map;

public class VerificarTextosMostradosStepDefinition {

  @Entonces("el observa los textos correctamente")
  public void tetxtosMostradosPantallaCorrectos(List<String> mensajes) {
    theActorInTheSpotlight()
        .should(
            seeThat(TextoMostradosPantalla.esCorrecto(mensajes))
                .orComplainWith(TextoNoVisibleException.class, TEXTO_MENSAJE_NO_SE_ENCUENTRA));
  }

  @Entonces("el observa un tooltip con un mensaje de ayuda")
  public void verificarMensajeAyudaTooltip(String mensajeAyuda) {
    theActorInTheSpotlight().should(seeThat(MensajeAyuda.enTooltip(mensajeAyuda)));
  }

  @Cuando("el inicia sesion en la SVP")
  public void iniciarSesion(List<Map<String, String>> credenciales) {
    theActorInTheSpotlight().attemptsTo(IniciarSesion.svp(credenciales));
  }

  @Entonces("el observa los textos correctamente en la categoria (.*)")
  public void verificarTexroSaldoCategoria(String tipoCategoria, List<Map<String, String>> texto) {
    theActorInTheSpotlight()
        .should(
            seeThat(TextoSaldosCategoria.esCorrecto(tipoCategoria, texto))
                .orComplainWith(TextoNoVisibleException.class, TEXTO_MENSAJE_NO_SE_ENCUENTRA));
  }
}
