#language: es

Característica: Verificar texto y botones en la funcionalidad de consulta de pagos

  Yo como Tester
  Quiero verificar los textos y botones mostrados en pantalla
  Para brindar un buen servicio

  Escenario: Verificar texto en la categoria de consulta de pagos Créditos
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP
      | Usuario   | Contrasena |
      | chipote95 | 1234       |
    Entonces el observa los textos correctamente
      | Hola First |
    Y el observa los textos correctamente en la seccion de consulta de pagos en la categoria Créditos
      | Préstamo             |
      | Prestamo Personal Ta |
      | 29281026324          |
      | 17 Ene 2020          |

  Escenario: Verificar texto en la categoria de consulta de pagos Créditos
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el inicia sesion en la SVP
      | Usuario  | Contrasena |
      | usuctdc1 | 1234       |
    Entonces el observa los textos correctamente
      | Hola Julia |
    Y el observa los textos correctamente en la seccion de consulta de pagos en la categoria Tarjetas de crédito
      | Tarjeta de crédito        |
      | Personal American Express |
      | ****5988                  |
      | 17 Ene 2020               |
