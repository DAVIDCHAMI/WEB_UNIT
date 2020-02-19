package com.todo1.svp.utils;

public class Utilidades {

  private Utilidades() {}

  public static String eliminarTildesCadena(String cadena) {
    cadena = cadena.replaceAll("\\u00e1", "a");
    cadena = cadena.replaceAll("\\u00c1", "A");
    cadena = cadena.replaceAll("\\u00e9", "e");
    cadena = cadena.replaceAll("\\u00c9", "E");
    cadena = cadena.replaceAll("\\u00ed", "i");
    cadena = cadena.replaceAll("\\u00cd", "I");
    cadena = cadena.replaceAll("\\u00f3", "o");
    cadena = cadena.replaceAll("\\u00d3", "O");
    cadena = cadena.replaceAll("\\u00fa", "u");
    cadena = cadena.replaceAll("\\u00da", "U");
    return cadena;
  }
}
