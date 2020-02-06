package com.todo1.svp.questions.autenticacion;

import static com.todo1.svp.userinterfaces.autenticacion.ClavePage.ENMASCARAMIENTO_DATOS;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Enmascaramiento implements Question<Boolean> {

  public static Enmascaramiento datosClave() {
    return new Enmascaramiento();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean resultado = true;
    List<WebElementFacade> datosClave = ENMASCARAMIENTO_DATOS.resolveAllFor(actor);
    for (WebElementFacade datoEnmascarado : datosClave) {
      if (!datoEnmascarado.isVisible()) {
        resultado = false;
      } else if (!resultado) {
        break;
      }
    }
    return resultado;
  }
}
