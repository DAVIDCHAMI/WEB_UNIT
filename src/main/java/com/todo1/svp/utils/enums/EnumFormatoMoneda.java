package com.todo1.svp.utils.enums;

public enum EnumFormatoMoneda {
  PESOS("^\\$ -?(\\d{1,3}\\s*?([.,]|$|\\s)\\s?)+\\d{2}$"),
  DOLARES("^USD \\$ -?(\\d{1,3}\\s*?([.,]|$|\\s)\\s?)+\\d{2}$");

  private String valor;

  EnumFormatoMoneda(String valor) {
    this.valor = valor;
  }

  public String getValor() {
    return valor;
  }
}
