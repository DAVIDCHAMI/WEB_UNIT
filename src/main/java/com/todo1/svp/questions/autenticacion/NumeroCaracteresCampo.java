package com.todo1.svp.questions.autenticacion;

import static com.todo1.svp.userinterfaces.autenticacion.UsuarioPage.CAMPO;

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
    return CAMPO.of(campo).resolveFor(actor).getValue().length() == numeroCaracteres;
  }
}
