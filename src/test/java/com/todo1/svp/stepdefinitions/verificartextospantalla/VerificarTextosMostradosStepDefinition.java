package com.todo1.svp.stepdefinitions.verificartextospantalla;

import static com.todo1.svp.exceptions.TextoNoVisibleException.TEXTO_MENSAJE_NO_SE_ENCUENTRA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.todo1.svp.exceptions.TextoNoVisibleException;
import com.todo1.svp.questions.autenticacion.MensajeAyuda;
import com.todo1.svp.questions.autenticacion.TextoMostradosPantalla;
import com.todo1.svp.questions.modulotransaccional.TextoConsultaPagos;
import com.todo1.svp.questions.modulotransaccional.TextoSaldosCategoria;
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
  public void verificarMensajeAyudaTooltip(List<String> mensajeAyuda) {
    theActorInTheSpotlight()
        .should(
            seeThat(MensajeAyuda.enTooltip(mensajeAyuda))
                .orComplainWith(TextoNoVisibleException.class, TEXTO_MENSAJE_NO_SE_ENCUENTRA));
  }

  @Entonces("el observa los textos correctamente en la categoria (.*)")
  public void verificarTexroSaldoCategoria(String tipoCategoria, List<Map<String, String>> texto) {
    theActorInTheSpotlight()
        .should(
            seeThat(TextoSaldosCategoria.esCorrecto(tipoCategoria, texto))
                .orComplainWith(TextoNoVisibleException.class, TEXTO_MENSAJE_NO_SE_ENCUENTRA));
  }

  @Entonces(
      "el observa los textos correctamente en la seccion de consulta de pagos en la categoria (.*)")
  public void verificarTextosConsultaPagos(String tipoCategoria, List<String> texto) {
    theActorInTheSpotlight()
        .should(
            seeThat(TextoConsultaPagos.esCorrecto(tipoCategoria, texto))
                .orComplainWith(TextoNoVisibleException.class, TEXTO_MENSAJE_NO_SE_ENCUENTRA));
  }
}
