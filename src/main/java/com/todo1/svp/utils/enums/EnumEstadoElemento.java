package com.todo1.svp.utils.enums;

public enum EnumEstadoElemento {
  HABILITADO(true),
  DESABILITADO(false);

  private Boolean valor;

  private EnumEstadoElemento(Boolean valor) {
    this.valor = valor;
  }

  public Boolean getValor() {
    return valor;
  }
}
