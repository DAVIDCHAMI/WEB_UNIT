package com.todo1.svp.stepdefinitions.pruebasunitarias;

import static com.todo1.svp.exceptions.CaracteresIncorrectoException.ULTIMO_CARACTER_INCORRECTO;
import static com.todo1.svp.exceptions.EstadoElementoIncorrectoException.ESTADO_ELEMENTO_INCORRECTO;
import static com.todo1.svp.userinterfaces.UsuarioPage.BOTON_PRINCIPAL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.todo1.svp.exceptions.CaracteresIncorrectoException;
import com.todo1.svp.exceptions.EstadoElementoIncorrectoException;
import com.todo1.svp.questions.EstadoElemento;
import com.todo1.svp.questions.UltimoCaracter;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;

public class PruebasUnitariasCamposClaveStepDefinition {

  @Entonces("el observa que el ultimo caracter del campo (.*) es (.*)")
  public void verificarUltimoCaracter(String nombreCampo, String ultimoCaracter) {
    theActorInTheSpotlight()
        .should(
            seeThat(UltimoCaracter.esCorrecto(nombreCampo, ultimoCaracter))
                .orComplainWith(CaracteresIncorrectoException.class, ULTIMO_CARACTER_INCORRECTO));
  }

  @Entonces("el ingresa a la pantalla clave")
  public void ingresaPantallaClave() throws InterruptedException {
    theActorInTheSpotlight().attemptsTo(Click.on(BOTON_PRINCIPAL.of("CONTINUAR")));
    Thread.sleep(2000);
  }

  @Entonces("el observa que la imagen de seguridad esta (.*) para el usuario")
  public void verificarImagenSeguridad(String estadoElemento) {
    theActorInTheSpotlight()
        .should(
            seeThat(EstadoElemento.esHabilitado(estadoElemento))
                .orComplainWith(
                    EstadoElementoIncorrectoException.class, ESTADO_ELEMENTO_INCORRECTO));
  }
}
