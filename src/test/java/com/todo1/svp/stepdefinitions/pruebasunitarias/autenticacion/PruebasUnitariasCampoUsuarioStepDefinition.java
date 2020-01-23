package com.todo1.svp.stepdefinitions.pruebasunitarias.autenticacion;

import static com.todo1.svp.exceptions.CaracteresIncorrectoException.CARACTERES_CAMPO_INCORRECTO;
import static com.todo1.svp.exceptions.EstadoElementoIncorrectoException.ESTADO_ELEMENTO_INCORRECTO;
import static com.todo1.svp.exceptions.TextoNoVisibleException.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.todo1.svp.exceptions.CaracteresIncorrectoException;
import com.todo1.svp.exceptions.EstadoElementoIncorrectoException;
import com.todo1.svp.exceptions.TextoNoVisibleException;
import com.todo1.svp.interactions.AbrirNavegador;
import com.todo1.svp.questions.EstadoElemento;
import com.todo1.svp.questions.MensajeValidacionCampo;
import com.todo1.svp.questions.NumeroCaracteresCampo;
import com.todo1.svp.questions.TextoPlaceholderCampo;
import com.todo1.svp.tasks.Escribir;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.List;
import java.util.Map;

public class PruebasUnitariasCampoUsuarioStepDefinition {

  @Dado("que (.*) quiere ingresar a la pagina de (.*)")
  @Cuando("(.*) ingresa a la pagina de (.*)")
  public void ingresarPagina(String nombreActor, String url) {
    theActorCalled(nombreActor).wasAbleTo(AbrirNavegador.en(url));
  }

  @Cuando("^el escribe en (?:el campo|los campos)$")
  public void ingresarUsuario(List<Map<String, String>> campos) {
    theActorInTheSpotlight().attemptsTo(Escribir.enElCampo(campos));
  }

  @Entonces("el observa que en el campo (.*) hay (.*) caracteres")
  public void verificarNumeroCaracteres(String campo, int numeroCaracteres) {
    theActorInTheSpotlight()
        .should(
            seeThat(NumeroCaracteresCampo.esCorrecto(campo, numeroCaracteres))
                .orComplainWith(CaracteresIncorrectoException.class, CARACTERES_CAMPO_INCORRECTO));
  }

  @Entonces("el observa que el (.*): (.*) esta (.*)")
  public void verificarEstadoElemento(
      String elemento, String nombreElemento, String estadoElemento) {
    theActorInTheSpotlight()
        .should(
            seeThat(EstadoElemento.esHabilitado(elemento, nombreElemento, estadoElemento))
                .orComplainWith(
                    EstadoElementoIncorrectoException.class, ESTADO_ELEMENTO_INCORRECTO));
  }

  @Entonces("el observa en pantalla el siguiente mensaje de error: (.*)")
  public void verificarMensajeValidacion(String mensaje) {
    theActorInTheSpotlight()
        .should(
            seeThat(MensajeValidacionCampo.esVisible(mensaje))
                .orComplainWith(TextoNoVisibleException.class, TEXTO_VALIDACION_NO_SE_ENCUENTRA));
  }

  @Entonces("el observa que el placeholder del campo esta correcto")
  public void verificarPlaceholder(List<String> placeholder) {
    theActorInTheSpotlight()
        .should(
            seeThat(TextoPlaceholderCampo.esCorrecto(placeholder))
                .orComplainWith(TextoNoVisibleException.class, TEXTO_PLACE_HOLDER_NO_SE_ENCUENTRA));
  }
}
