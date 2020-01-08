package com.todo1.svp.questions;

import static com.todo1.svp.userinterfaces.UsuarioPage.CAMPO_CLAVE;

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
    return CAMPO_CLAVE.of(nombreCampo).resolveFor(actor).getValue().equals(ultimoCaracter);
  }
}
