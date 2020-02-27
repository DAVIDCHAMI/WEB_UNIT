package com.todo1.svp.stepdefinitions.pruebasunitarias.autenticacion;

import static com.todo1.svp.exceptions.CaracteresIncorrectoException.CARACTERES_CAMPO_INCORRECTO;
import static com.todo1.svp.exceptions.CaracteresIncorrectoException.ULTIMO_CARACTER_INCORRECTO;
import static com.todo1.svp.exceptions.EstadoElementoIncorrectoException.ESTADO_ELEMENTO_INCORRECTO;
import static com.todo1.svp.exceptions.TextoNoVisibleException.*;
import static com.todo1.svp.userinterfaces.autenticacion.UsuarioPage.BOTON_PRINCIPAL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.todo1.svp.exceptions.CaracteresIncorrectoException;
import com.todo1.svp.exceptions.EstadoElementoIncorrectoException;
import com.todo1.svp.exceptions.TextoNoVisibleException;
import com.todo1.svp.interactions.AbrirNavegador;
import com.todo1.svp.questions.autenticacion.*;
import com.todo1.svp.tasks.autenticacion.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.actions.Click;

public class PruebasUnitariasAutenticacionStepDefinition {

  @Cuando("el inicia sesion en la SVP")
  public void iniciarSesion(List<Map<String, String>> credenciales) {
    theActorInTheSpotlight().attemptsTo(IniciarSesion.svp(credenciales));
  }

  @Cuando("el inicia sesion en la SVP con el robot")
  public void iniciarSesionRobot(List<Map<String, String>> credenciales) {
    theActorInTheSpotlight().attemptsTo(IniciarSesionRobot.svp(credenciales));
  }

  @Dado("que (.*) quiere ingresar a la pagina de (.*)")
  @Cuando("(.*) ingresa a la pagina de (.*)")
  public void ingresarPagina(String nombreActor, String url) {
    theActorCalled(nombreActor).wasAbleTo(AbrirNavegador.en(url));
  }

  @Cuando("^el selecciona (?:un|una) (.*): (.*)?")
  public void seleccionarDocumento(String nombreCampo, String opcionSeleccionar) {
    theActorInTheSpotlight().attemptsTo(Seleccionar.opcionLista(nombreCampo, opcionSeleccionar));
  }

  @Cuando("^el escribe en (?:el campo|los campos)$")
  public void ingresarTexto(List<Map<String, String>> campos) {
    theActorInTheSpotlight().attemptsTo(Escribir.enElCampo(campos));
  }

  @Cuando("^el escribe con el robot en (?:el campo|los campos)$")
  public void ingresarTextoRobot(List<Map<String, String>> campos) {
    theActorInTheSpotlight().attemptsTo(EscribirRobot.enElCampo(campos));
  }

  @Cuando("el ingresa a la pantalla clave")
  public void ingresaPantallaClave() throws InterruptedException {
    theActorInTheSpotlight().attemptsTo(Click.on(BOTON_PRINCIPAL.of("continuar")));
    Thread.sleep(2000);
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

  @Entonces("el observa que el ultimo caracter del campo (.*) es (.*)")
  public void verificarUltimoCaracter(String nombreCampo, String ultimoCaracter) {
    theActorInTheSpotlight()
        .should(
            seeThat(UltimoCaracter.esCorrecto(nombreCampo, ultimoCaracter))
                .orComplainWith(CaracteresIncorrectoException.class, ULTIMO_CARACTER_INCORRECTO));
  }

  @Entonces("el observa que la imagen de seguridad esta (.*) para el usuario")
  public void verificarImagenSeguridad(String estadoElemento) {
    theActorInTheSpotlight()
        .should(
            seeThat(EstadoElemento.esHabilitado(estadoElemento))
                .orComplainWith(
                    EstadoElementoIncorrectoException.class, ESTADO_ELEMENTO_INCORRECTO));
  }

  @Entonces("el observa que su clave es enmascarada")
  public void verificarEnmascaramientoClave() {
    theActorInTheSpotlight()
        .should(
            seeThat(Enmascaramiento.datosClave())
                .orComplainWith(TextoNoVisibleException.class, ENMASCARAMIENTO_NO_VISIBLE));
  }
}
