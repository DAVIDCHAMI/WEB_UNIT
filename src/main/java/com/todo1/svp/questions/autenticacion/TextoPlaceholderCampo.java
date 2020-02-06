package com.todo1.svp.questions.autenticacion;

import static com.todo1.svp.userinterfaces.autenticacion.GenerarClavePage.PLACEHOLDER_TYPE_LIST;
import static com.todo1.svp.userinterfaces.autenticacion.UsuarioPage.CAMPO;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TextoPlaceholderCampo implements Question<Boolean> {

  private List<String> texto;

  public TextoPlaceholderCampo(List<String> texto) {
    this.texto = texto;
  }

  public static TextoPlaceholderCampo esCorrecto(List<String> texto) {
    return new TextoPlaceholderCampo(texto);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean resultado = false;
    for (String textoPlaceholder : texto) {
      if (CAMPO.of(textoPlaceholder).resolveFor(actor).isVisible()) {
        resultado = true;
      } else {
        resultado = PLACEHOLDER_TYPE_LIST.of(textoPlaceholder).resolveFor(actor).isVisible();
      }
      if (!resultado) {
        break;
      }
    }
    return resultado;
  }
}
