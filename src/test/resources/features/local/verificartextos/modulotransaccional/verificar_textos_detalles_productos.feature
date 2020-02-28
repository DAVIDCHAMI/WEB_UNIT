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
    Cuando el ingresa a los detalles de Tarjetas de crédito con numero *5988
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
      | Pago mínimo en pesos             |
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
    Cuando el ingresa a los detalles de Tarjetas de crédito con numero *7371
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
      | Pago mínimo en pesos             |
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

  Escenario: Verificar texto detalles creditos hipotecarios
    Dado que camilo quiere ingresar a la pagina de usuario
    Y el inicia sesion en la SVP
      | Usuario   | Contrasena |
      | chipote95 | 1234       |
    Cuando el ingresa a los detalles de Créditos con numero 10001263181
    Entonces el observa los textos correctamente
      | Crédito Hipotecario            |
      | Pagar                          |
      | Ver extractos                  |
      | Exportar                       |
      | Tipo de crédito                |
      | Capital vigente                |
      | Deuda a la fecha               |
      | Plan                           |
      | Tasa de interés efectiva anual |
      | Fecha de vencimiento           |
      | Número de cuota                |
      | Fecha próxima cuota            |
      | Pago mínimo                    |
      | Pago total                     |
      | Saldo en mora                  |
      | Intereses de mora              |
      | Número de cuotas en mora       |
    Y el observa un tooltip con un mensaje de ayuda
      | Valor de la deuda a la  fecha sin incluir  intereses ni otros cargos. |
      | Valor total en mora  generado a la fecha.                             |
      | Valor del interés de mora  generado a la fecha.                       |
    Y el observa que el boton: pagar esta Habilitado

  Escenario: Verificar texto detalles inversion virtual
    Dado que camilo quiere ingresar a la pagina de usuario
    Y el inicia sesion en la SVP
      | Usuario  | Contrasena |
      | fiduqa02 | 1234       |
    Cuando el ingresa a los detalles de Inversiones con numero 27600131486
    Entonces el observa los textos correctamente
      | Inversión                         |
      | Exportar                          |
      | Tipo de inversión                 |
      | Fecha de apertura                 |
      | Capital                           |
      | Plazo en días                     |
      | Periodicidad de intereses en días |
      | Fecha de vencimiento              |
      | Tasa de interés efectiva anual    |
      | Tasa de interés nominal           |
      | Intereses pagados                 |
      | Intereses del periodo             |
    Y el observa un tooltip con un mensaje de ayuda
      | Número de días en los que se recibe el pago de los intereses.                                                                     |
      | Es la tasa que calcula el valor del interés esperado en un año teniendo en cuenta  el capital invertido y los intereses generados |
      | Es la tasa  que calcula el intéres en un periodo de tiempo determinado teniendo en cuenta solo el capital invertido.              |
      | Valor de los intereses pagados o abonados a la fecha de la consulta.                                                              |
      | Valor de los intereses que serán pagados en el periodo seleccionado en la inversión.                                              |

  Escenario: Verificar texto detalles fondos de inversión
    Dado que camilo quiere ingresar a la pagina de usuario
    Y el inicia sesion en la SVP
      | Usuario    | Contrasena |
      | fidurenta2 | 1234       |
    Cuando el ingresa a los detalles de Inversiones con numero 7001000083018
    Entonces el observa los textos correctamente
      | Fondo de inversión   |
      | Transferir dinero    |
      | Ver extractos        |
      | Exportar             |
      | Tipo de fondo        |
      | Saldo disponible     |
      | Saldo total          |
      | Fecha de vencimiento |

  Escenario: Verificar textos detalles creditos de consumo
    Dado que camilo quiere ingresar a la pagina de usuario
    Y el inicia sesion en la SVP
      | Usuario   | Contrasena |
      | chipote95 | 1234       |
    Cuando el ingresa a los detalles de Créditos con numero 29281026324
    Entonces el observa los textos correctamente
      | Préstamo             |
      | Pagar                |
      | Ver extractos        |
      | Exportar             |
      | Tipo de crédito      |
      | Capital vigente      |
      | Deuda a la fecha     |
      | Fecha de desembolso  |
      | Valor desembolsado   |
      | Fecha próximo pago   |
      | Pago mínimo          |
      | Pago total           |
      | Intereses corrientes |
      | Saldo en mora        |
      | Intereses de mora    |
      | Otros cargos         |
    Y el observa un tooltip con un mensaje de ayuda
      | Valor de la deuda a la  fecha sin incluir   intereses ni otros cargos. |
      | Valor total en mora   generado a la fecha.                             |
      | Valor del interés de   mora generado a la fecha.                       |
      | Valor de los seguros asociados al crédito                              |

  Escenario: Verificar textos detalles crediagil
    Dado que camilo quiere ingresar a la pagina de usuario
    Y el inicia sesion en la SVP
      | Usuario    | Contrasena |
      | usucayca01 | 1234       |
    Cuando el ingresa a los detalles de Crediágil con numero Crediágil
    Entonces el observa los textos correctamente
      | Desembolsar     |
      | Exportar        |
      | Cupo asignado   |
      | Cupo utilizado  |
      | Cupo disponible |
      | Cupo en canje   |
    Y el observa un tooltip con un mensaje de ayuda
      | Valor de los cheques consignados que están pendientes de autorización. |