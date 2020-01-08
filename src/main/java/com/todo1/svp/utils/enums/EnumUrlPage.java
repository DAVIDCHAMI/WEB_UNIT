package com.todo1.svp.utils.enums;

public enum EnumUrlPage {
  URL_USUARIO_PAGE("https://kymabank-qa-ui.todo-1.com/BC_SVP_User/", "Hola"),
  URL_RECORDAR_USUARIO_PAGE(
      "https://kymabank-qa-ui.todo-1.com/BC_SVP_User/ForgotUser", "Recordar usuario"),
  URL_GENERAR_CLAVE_PAGE(
      "https://kymabank-qa-ui.todo-1.com/BC_SVP_User/GeneratePassword", "Generar clave"),
  URL_REGISTRAR_USUARIO_PAGE(
      "https://kymabank-qa-ui.todo-1.com/BC_SVP_User/User", "Registrar usuario");

  private String valor;
  private String tituloPantalla;

  private EnumUrlPage(String valor, String tituloPantalla) {
    this.valor = valor;
    this.tituloPantalla = tituloPantalla;
  }

  public String getUrl() {
    return valor;
  }

  public String getTituloPantalla() {
    return tituloPantalla;
  }

  public String getValor() {
    return valor;
  }
}
