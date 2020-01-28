#language: es

Característica: Verificar texto y botones en la funcionalidad de saldos por producto

  Yo como Tester
  Quiero verificar los textos y botones mostrados en pantalla
  Para brindar un buen servicio

  Esquema del escenario: Verificar texto en la categoria de inversiones
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP
      | Usuario   | Contrasena   |
      | <Usuario> | <Contrasena> |
    Entonces el observa los textos correctamente
      | <Titulo> |
    Y el observa los textos correctamente en la categoria Inversiones
      | Nombre personalizado | Descripcion | Numero producto |
      | <Nombre>             | <Producto>  | <Numero>        |

    Ejemplos:
      | Usuario   | Contrasena | Titulo         | Nombre             | Producto   | Numero        |
      | usucfdi01 | 1234       | Hola Hortencia | Fondo de inversión | FIDUCUENTA | 0834000000391 |

  Esquema del escenario: Verificar texto en la categoria de cuentas
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP
      | Usuario  | Contrasena |
      | usuctdc3 | 1234       |
    Entonces el observa los textos correctamente
      | Hola Cristina |
    Y el observa los textos correctamente en la categoria Cuentas
      | Nombre personalizado | Descripcion | Numero producto |
      | <Nombre>             | <Producto>  | <Numero>        |
    Y el observa que el boton: <Boton> esta Habilitado

    Ejemplos:
      | Nombre | Producto  | Numero        | Boton           |
      | Cuenta | Ahorros   | 406-702330-08 | crear bolsillos |
      | Cuenta | Corriente | 406-102330-00 | crear bolsillos |

  Esquema del escenario: Verificar texto en la categoria de Tarjetas de créditos
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP
      | Usuario  | Contrasena |
      | usuctdc3 | 1234       |
    Entonces el observa los textos correctamente
      | Hola Cristina |
    Y el observa los textos correctamente en la categoria Tarjetas de crédito
      | Nombre personalizado | Descripcion | Numero producto |
      | <Nombre>             | <Producto>  | <Numero>        |
    Y el observa que el boton: <Boton> esta Habilitado

    Ejemplos:
      | Nombre              | Producto                  | Numero   | Boton |
      | Tarjetas de crédito | Personal American Express | ****7036 | pagar |
      | Tarjetas de crédito | Personal Visa             | ****0374 | pagar |
      | Tarjetas de crédito | Personal Mastercard       | ****8091 | pagar |

  Esquema del escenario: Verificar texto en la categoria de Creditos
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP
      | Usuario   | Contrasena |
      | chipote95 | 1234       |
    Entonces el observa los textos correctamente
      | Hola First |
    Y el observa los textos correctamente en la categoria Créditos
      | Nombre personalizado | Descripcion | Numero producto |
      | <Nombre>             | <Producto>  | <Numero>        |
    Y el observa que el boton: <Boton> esta Habilitado

    Ejemplos:
      | Nombre              | Producto             | Numero      | Boton |
      | Préstamo            | Prestamo Personal Ta | 29281026324 | pagar |
      | Crédito Hipotecario | Préstamo             | 10001263181 | pagar |
