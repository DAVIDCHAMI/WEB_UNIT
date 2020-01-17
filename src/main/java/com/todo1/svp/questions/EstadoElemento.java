package com.todo1.svp.questions;

import static com.todo1.svp.userinterfaces.ClavePage.IMAGEN_SEGURIDAD;
import static com.todo1.svp.userinterfaces.UsuarioPage.*;

import com.todo1.svp.utils.enums.EnumEstadoElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class EstadoElemento implements Question<Boolean> {

  private Boolean estadoElemento;
  private String nombreElemento;
  private String tipoElemento = "";

  public EstadoElemento(String tipoElemento, String nombreElemento, String estadoElemento) {
    this.estadoElemento = EnumEstadoElemento.valueOf(estadoElemento).getValor();
    this.nombreElemento = nombreElemento;
    this.tipoElemento = tipoElemento;
  }

  public EstadoElemento(String estadoElemento) {
    this.estadoElemento = EnumEstadoElemento.valueOf(estadoElemento).getValor();
  }

  public static EstadoElemento esHabilitado(
      String tipoElemento, String nombreElemento, String estadoElemento) {
    return new EstadoElemento(tipoElemento, nombreElemento, estadoElemento.toUpperCase());
  }

  public static EstadoElemento esHabilitado(String estadoElemento) {
    return new EstadoElemento(estadoElemento.toUpperCase());
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean resultado;
    switch (tipoElemento) {
      case "boton":
        resultado =
            BOTON_PRINCIPAL.of(nombreElemento).resolveFor(actor).isEnabled() == estadoElemento;
        break;
      case "campo":
        resultado = CAMPO.of(nombreElemento).resolveFor(actor).isEnabled() == estadoElemento;
        break;
      default:
        resultado = IMAGEN_SEGURIDAD.resolveFor(actor).isVisible() == estadoElemento;
    }
    return resultado;
  }
}
