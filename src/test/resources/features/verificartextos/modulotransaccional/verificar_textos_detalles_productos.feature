#language: es

Característica: Verificar texto y botones en la funcionalidad de detalles

  Yo como Tester
  Quiero verificar los textos y botones mostrados en pantalla
  Para brindar un buen servicio

  Escenario: Verificar texto detalles cuenta de ahorro
    Dado que camilo quiere ingresar a la pagina de usuario
    Y el inicia sesion en la SVP
      | Usuario   | Contrasena |
      | chipote95 | 1234       |
    Cuando el ingresa a los detalles de Cuentas con numero 406-757950-06
    Entonces el observa los textos correctamente
      | Cuenta de Ahorro       |
      | Tipo de cuenta         |
      | Saldo disponible       |
      | Saldo en canje         |
      | Saldo total            |
      | Transferir dinero      |
      | Pagar crédito          |
      | Pagar tarjetas propias |
      | Ver extractos          |
      | Exportar               |
    Y el observa un tooltip con un mensaje de ayuda
      | Saldo disponible más el saldo en canje.                                |
      | Valor de los cheques consignados que están pendientes de autorización. |

  Escenario: Verificar texto detalles cuentas corrientes
    Dado que camilo quiere ingresar a la pagina de usuario
    Y el inicia sesion en la SVP
      | Usuario   | Contrasena |
      | chipote95 | 1234       |
    Cuando el ingresa a los detalles de Cuentas con numero 406-157950-05
    Entonces el observa los textos correctamente
      | Cuenta Corriente       |
      | Tipo de cuenta         |
      | Saldo disponible       |
      | Saldo en canje         |
      | Saldo total            |
      | Transferir dinero      |
      | Pagar crédito          |
      | Pagar tarjetas propias |
      | Ver extractos          |
      | Exportar               |
      | Días de sobregiro      |
    Y el observa un tooltip con un mensaje de ayuda
      | Saldo disponible más el saldo en canje.                                           |
      | Valor de los cheques consignados que están pendientes de autorización.            |
      | Días en los que se ha utilizado el cupo de sobregiro y se han generado intereses. |

  Escenario: Verificar texto detalles tarjetas de credito
    Dado que camilo quiere ingresar a la pagina de usuario
    Y el inicia sesion en la SVP
      | Usuario  | Contrasena |
      | usuctdc1 | 1234       |
    Cuando el ingresa a los detalles de Tarjetas de crédito con numero ****5988
    Entonces el observa los textos correctamente
      | Realizar avances                 |
      | Pagar                            |
      | Bloquear temporalmente           |
      | Ver extractos                    |
      | Exportar                         |
      | Disponible para avances en pesos |
      | Cupo disponible                  |
      | Deuda a la fecha en pesos        |
      | TRM                              |
      | Fecha próximo pago               |
      | Pago mínimo en  pesos            |
      | Pago total en pesos              |
      | Deuda a la fecha en dólares      |
      | Pago mínimo en dólares           |
      | Pago total en dólares            |
    Y el observa que el boton: pagar esta Habilitado
    Y el observa un tooltip con un mensaje de ayuda
      | Valor disponible para realizar avances en efectivo o traslados de dinero a cuentas propias e inscritas Bancolombia. |

  Escenario: Verificar texto detalles tarjetas de credito virtual
    Dado que camilo quiere ingresar a la pagina de usuario
    Y el inicia sesion en la SVP
      | Usuario       | Contrasena |
      | pruebaecard02 | 1234       |
    Cuando el ingresa a los detalles de Tarjetas de crédito con numero ****7371
    Entonces el observa los textos correctamente
      | Realizar avances                 |
      | Pagar                            |
      | Bloquear temporalmente           |
      | Ver extractos                    |
      | Exportar                         |
      | Disponible para avances en pesos |
      | Cupo disponible                  |
      | Deuda a la fecha en pesos        |
      | TRM                              |
      | Fecha próximo pago               |
      | Pago mínimo en  pesos            |
      | Pago total en pesos              |
      | Deuda a la fecha en dólares      |
      | Pago mínimo en dólares           |
      | Pago total en dólares            |
      | Fecha de vencimiento             |
      | Código de seguridad (CVC2)       |
    Y el observa que el boton: pagar esta Habilitado
    Y el observa un tooltip con un mensaje de ayuda
      | Valor disponible para realizar avances en efectivo o traslados de dinero a cuentas propias e inscritas Bancolombia. |
      | Te brinda mayor seguridad al momento de la compra.                                                                  |