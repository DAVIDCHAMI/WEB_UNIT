package com.todo1.svp.exceptions;

public class TextoNoVisibleException extends AssertionError {
  public static final String TEXTO_VALIDACION_NO_SE_ENCUENTRA =
      "No se encuentra el mensaje de validación";
  public static final String TEXTO_PLACE_HOLDER_NO_SE_ENCUENTRA =
      "No se encuentra el placeholder del campo";
  public static final String TEXTO_MENSAJE_NO_SE_ENCUENTRA = "No se ecuentra el texto";

  public TextoNoVisibleException(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
