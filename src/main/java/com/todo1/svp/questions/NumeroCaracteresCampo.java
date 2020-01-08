package com.todo1.svp.questions;

import static com.todo1.svp.userinterfaces.UsuarioPage.CAMPO;
import static com.todo1.svp.userinterfaces.UsuarioPage.CAMPO_CLAVE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NumeroCaracteresCampo implements Question<Boolean> {

  private int numeroCaracteres;
  private String campo;

  public NumeroCaracteresCampo(String campo, int numeroCaracteres) {
    this.numeroCaracteres = numeroCaracteres;
    this.campo = campo;
  }

  public static NumeroCaracteresCampo esCorrecto(String campo, int numeroCaracteres) {
    return new NumeroCaracteresCampo(campo, numeroCaracteres);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean resultado = false;
    if ("clave".equals(campo)) {
      resultado = CAMPO_CLAVE.of(campo).resolveFor(actor).getValue().length() == numeroCaracteres;
    } else {
      resultado = CAMPO.of(campo).resolveFor(actor).getValue().length() == numeroCaracteres;
    }
    return resultado;
  }
}
