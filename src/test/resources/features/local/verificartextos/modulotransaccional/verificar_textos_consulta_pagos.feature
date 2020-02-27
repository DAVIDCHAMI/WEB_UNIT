#language: es

Característica: Verificar texto y botones en la funcionalidad de consulta de pagos

  Yo como Tester
  Quiero verificar los textos y botones mostrados en pantalla
  Para brindar un buen servicio

  Esquema del escenario: Verificar texto en la categoria de consulta de pagos Créditos
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP con el robot
      | Usuario   | Contrasena |
      | chipote95 | 1234       |
    Entonces el observa los textos correctamente
      | Hola First |
    Y el observa los textos correctamente en la seccion de consulta de pagos en la categoria Créditos
      | <Nombre perzonalizado> |
      | <Producto>             |
      | <Numero del producto>  |
      | <Fecha de pago>        |

    Ejemplos:
      | Nombre perzonalizado | Producto             | Numero del producto | Fecha de pago |
      | Préstamo             | Prestamo Personal Ta | 29281026324         | 17 Ene 2020   |
      | Crédito Hipotecario  | Préstamo             | 10001263181         | 11 Sep 2018   |

  Escenario: Verificar texto en la categoria de consulta de pagos Tarjetas de créditos
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP con el robot
      | Usuario  | Contrasena |
      | usuctdc1 | 1234       |
    Entonces el observa los textos correctamente
      | Hola Julia |
    Y el observa los textos correctamente en la seccion de consulta de pagos en la categoria Tarjetas de crédito
      | Tarjeta de crédito        |
      | Personal American Express |
      | *5988                     |
      | 17 Ene 2020               |
