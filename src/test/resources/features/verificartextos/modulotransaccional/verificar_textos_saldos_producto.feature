#language: es

Característica: Verificar texto y botones en la funcionalidad de saldos por producto

  Yo como Tester
  Quiero verificar los textos y botones mostrados en pantalla
  Para brindar un buen servicio

  Esquema del escenario: Verificar texto en la categoria de inversiones
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP
      | Usuario  | Contrasena |
      | fiduqa02 | 1234       |
    Entonces el observa los textos correctamente
      | Hola Abundio |
    Y el observa los textos correctamente en la categoria Inversiones
      | Nombre personalizado | Descripcion | Numero producto |
      | <Nombre>             | <Producto>  | <Numero>        |

    Ejemplos:
      | Nombre             | Producto          | Numero        |
      | Fondo de inversión | FIDUCUENTA        | 0233002000445 |
      | Inversión          | Inversión virtual | 27600131486   |

  Escenario: Verificar texto en la categoria de crediagil
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP
      | Usuario    | Contrasena |
      | usucayca01 | 1234       |
    Entonces el observa los textos correctamente
      | Hola Pedro |
    Y el observa los textos correctamente en la categoria Crediágil
      | Descripcion |
      | Crediágil   |
    Y el observa que el boton: desembolsar esta Habilitado

  Esquema del escenario: Verificar texto en la categoria de cuentas
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP
      | Usuario   | Contrasena |
      | chipote95 | 1234       |
    Entonces el observa los textos correctamente
      | Hola First |
    Y el observa los textos correctamente en la categoria Cuentas
      | Nombre personalizado | Descripcion | Numero producto |
      | <Nombre>             | <Producto>  | <Numero>        |
    Y el observa que el boton: <Boton> esta Habilitado

    Ejemplos:
      | Nombre | Producto  | Numero        | Boton           |
      | Cuenta | Ahorros   | 406-757950-25 | crear bolsillos |
      | Cuenta | Corriente | 406-157950-05 | crear bolsillos |

  Esquema del escenario: Verificar texto en la categoria de Tarjetas de créditos
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP
      | Usuario   | Contrasena   |
      | <Usuario> | <Contrasena> |
    Entonces el observa los textos correctamente
      | <Titulo> |
    Y el observa los textos correctamente en la categoria Tarjetas de crédito
      | Nombre personalizado | Descripcion | Numero producto |
      | <Nombre>             | <Producto>  | <Numero>        |
    Y el observa que el boton: <Boton> esta Habilitado

    Ejemplos:
      | Usuario       | Contrasena | Titulo           | Nombre              | Producto                  | Numero   | Boton |
      | usuctdc1      | 1234       | Hola Julia       | Tarjetas de crédito | Personal American Express | ****5988 | pagar |
      | usuctdc1      | 1234       | Hola Julia       | Tarjetas de crédito | Personal Visa             | ****0690 | pagar |
      | usuctdc1      | 1234       | Hola Julia       | Tarjetas de crédito | Personal Mastercard       | ****2284 | pagar |
      | pruebaecard02 | 1234       | Hola Bancolombia | Tarjeta de crédito  | e-Card Mastercard         | ****7371 | pagar |

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


