package com.todo1.svp.utils.enums;

public enum EnumUrlPage {
  URL_USUARIO_PAGE("https://kymabank-dev-ui.todo-1.com/BC_SVP_User/", "Hola"),
  URL_RECORDAR_USUARIO_PAGE(
      "https://kymabank-dev-ui.todo-1.com/BC_SVP_User/ForgotUser", "Recordar usuario"),
  URL_GENERAR_CLAVE_PAGE(
      "https://kymabank-dev-ui.todo-1.com/BC_SVP_User/GeneratePassword", "Generar clave"),
  URL_REGISTRAR_USUARIO_PAGE(
      "https://kymabank-dev-ui.todo-1.com/BC_SVP_User/User", Constantes.REGISTRAR_USUARIO),
  URL_REGISTRAR_FRASE_DE_SEGURIDAD_DEL_USUARIO_PAGE(
      "https://kymabank-dev-ui.todo-1.com/BC_SVP_User/Phrase", Constantes.REGISTRAR_USUARIO),
  URL_REGISTRAR_IMAGEN_DE_SEGURIDAD_DEL_USUARIO_PAGE(
      "https://kymabank-dev-ui.todo-1.com/BC_SVP_User/Image", Constantes.REGISTRAR_USUARIO),
  URL_VERIFICAR_REGISTRO_PAGE(
      "https://kymabank-dev-ui.todo-1.com/BC_SVP_User/Verification", Constantes.REGISTRAR_USUARIO),
  URL_CONFIRMAR_REGISTRO_PAGE(
      "https://kymabank-dev-ui.todo-1.com/BC_SVP_User/Confirmation", Constantes.REGISTRAR_USUARIO);

  private String valor;
  private String tituloPantalla;

  EnumUrlPage(String valor, String tituloPantalla) {
    this.valor = valor;
    this.tituloPantalla = tituloPantalla;
  }

  public String getUrl() {
    return valor;
  }

  public String getTituloPantalla() {
    return tituloPantalla;
  }

  private static class Constantes {
    public static final String REGISTRAR_USUARIO = "Registrar usuario";
  }
}
