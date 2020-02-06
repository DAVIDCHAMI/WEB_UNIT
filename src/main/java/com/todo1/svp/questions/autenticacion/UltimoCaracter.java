package com.todo1.svp.questions.autenticacion;

import static com.todo1.svp.userinterfaces.autenticacion.UsuarioPage.CAMPO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class UltimoCaracter implements Question<Boolean> {

  private String ultimoCaracter;
  private String nombreCampo;

  public UltimoCaracter(String nombreCampo, String ultimoCaracter) {
    this.ultimoCaracter = ultimoCaracter;
    this.nombreCampo = nombreCampo;
  }

  public static UltimoCaracter esCorrecto(String nombreCampo, String ultimoCaracter) {
    return new UltimoCaracter(nombreCampo, ultimoCaracter);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean resultado;
    if ("clave".equalsIgnoreCase(nombreCampo)) {
      resultado = CAMPO.of("").resolveFor(actor).getValue().equals(ultimoCaracter);
    } else {
      resultado = CAMPO.of(nombreCampo).resolveFor(actor).getValue().equals(ultimoCaracter);
    }
    return resultado;
  }
}
