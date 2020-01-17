#language: es

Característica: Verificar texto y botones en la funcionalidad de saldos por producto

  Yo como Tester
  Quiero verificar los textos y botones mostrados en pantalla
  Para brindar un buen servicio

  @categoria_cuentas
  Escenario: Verificar texto en la categoria de cuentas
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP
      | Usuario   | Contrasena |
      | chipote95 | 1234       |
    Entonces el observa los textos correctamente
      | Hola Pedro |
    Y el observa los textos correctamente en la categoria Cuentas
      | Nombre personalizado | Descripcion | Numero producto |
      | Cuenta de Ahorro     | Ahorros     | 406-757950-06   |
    Y el observa que el boton: crear bolsillos esta Habilitado