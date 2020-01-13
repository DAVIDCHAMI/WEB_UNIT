package com.todo1.svp.exceptions;

public class CaracteresIncorrectoException extends AssertionError {
  public static final String CARACTERES_CAMPO_INCORRECTO =
      "Los caracteres alojados en el campo de texto son incorrectos.";
  public static final String ULTIMO_CARACTER_INCORRECTO =
      "El ultimo caracter del campo es incorrecto.";

  public CaracteresIncorrectoException(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
