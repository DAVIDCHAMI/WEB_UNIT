package com.todo1.svp.exceptions;

public class EstadoElementoIncorrectoException extends AssertionError {
  public static final String ESTADO_ELEMENTO_INCORRECTO =
      "El estado esperado del elemento no es incorrecto";

  public EstadoElementoIncorrectoException(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
