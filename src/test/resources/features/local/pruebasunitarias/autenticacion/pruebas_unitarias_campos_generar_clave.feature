#language: es

Característica: Pruebas unitarias campos en la pantalla generar clave

  Yo como Tester
  Quiero probar las validaciones de los campos en la pantalla generar clave
  Para brindar un buen servicio

  Escenario:  Verificación placeholder campos
    Cuando que camilo quiere ingresar a la pagina de generar clave
    Entonces el observa que el placeholder del campo esta correcto
      | Ingresa el número de documento |
      | Ingresa la nueva clave         |
      | Confirma la nueva clave        |

  Esquema del escenario: Validaciones campo Type list tipo de documento
    Dado que camilo quiere ingresar a la pagina de generar clave
    Cuando el selecciona un tipo de documento: <Tipo de documento>
    Entonces el observa que el placeholder del campo esta correcto
      | <Tipo de documento> |

    Ejemplos:
      | Tipo de documento     |
      | Cédula de ciudadanía  |
      | Carnet diplomático    |
      | Cédula de extranjería |
      | Fideicomiso           |
      | Id extranjero         |
      | Nit                   |
      | Pasaporte             |
      | Registro civil        |
      | Tarjeta de identidad  |

  Esquema del escenario: Validaciones campo número de documento
    Dado que camilo quiere ingresar a la pagina de generar clave
    Cuando el escribe con el robot en el campo
      | Campo a escribir    | palabra a escribir |
      | número de documento | <Diligenciar>      |
    Entonces el observa que en el campo número de documento hay <Numero de caracteres> caracteres
    Y el observa en pantalla el siguiente mensaje de error: <Mensaje de error>

    Ejemplos:
      | Diligenciar                   | Numero de caracteres | Mensaje de error                         |
      | 0                             | 0                    | Ingresa un documento mínimo de 5 dígitos |
      | 1234                          | 4                    | Ingresa un documento mínimo de 5 dígitos |
      | 12345                         | 5                    |                                          |
      | 123456789012345456            | 15                   |                                          |
      | qwerrtyuioñplkjhgfdsazxcvbnm  | 0                    | Ingresa un documento mínimo de 5 dígitos |
      | !"#$%&/()=?¡\'´¨*[];:_{}-.,+@ | 0                    | Ingresa un documento mínimo de 5 dígitos |
      | 374345&%$&$sdfdfd             | 6                    |                                          |

  Esquema del escenario: Validaciones campo ingresar nueva clave
    Dado que camilo quiere ingresar a la pagina de generar clave
    Cuando el escribe con el robot en el campo
      | Campo a escribir       | palabra a escribir |
      | Ingresa la nueva clave | <Diligenciar>      |
    Entonces el observa que en el campo Ingresa la nueva clave hay <Numero de caracteres> caracteres
    Y el observa en pantalla el siguiente mensaje de error: <Mensaje de error>

    Ejemplos:
      | Diligenciar                   | Numero de caracteres | Mensaje de error                  |
      | 0                             | 1                    | Ingresa los 4 dígitos de la clave |
      | 12345                         | 4                    |                                   |
      | 123456789012345               | 4                    |                                   |
      | qwerrtyuioñplkjhgfdsazxcvbnm  | 0                    | Ingresa los 4 dígitos de la clave |
      | !"#$%&/()=?¡\'´¨*[];:_{}-.,+@ | 0                    | Ingresa los 4 dígitos de la clave |
      | 374345&%$&$sdfdfd             | 4                    |                                   |
      | 1234                          | 4                    |                                   |


  Esquema del escenario: Validaciones campo confirmar nueva clave
    Dado que camilo quiere ingresar a la pagina de generar clave
    Cuando el escribe con el robot en el campo
      | Campo a escribir        | palabra a escribir |
      | Confirma la nueva clave | <Diligenciar>      |
    Entonces el observa que en el campo Confirma la nueva clave hay <Numero de caracteres> caracteres
    Y el observa en pantalla el siguiente mensaje de error: <Mensaje de error>

    Ejemplos:
      | Diligenciar                   | Numero de caracteres | Mensaje de error                                |
      | 0                             | 1                    | Ingresa el mismo número del campo "Nueva clave" |
      | 1234                          | 4                    |                                                 |
      | 12355                         | 4                    | Ingresa el mismo número del campo "Nueva clave" |
      | 123456789012345               | 4                    |                                                 |
      | qwerrtyuioñplkjhgfdsazxcvbnm  | 0                    | Ingresa un documento mínimo de 5 dígitos        |
      | !"#$%&/()=?¡\'´¨*[];:_{}-.,+@ | 0                    | Ingresa el mismo número del campo "Nueva clave" |
      | 374345&%$&$sdfdfd             | 4                    | Ingresa el mismo número del campo "Nueva clave" |

  Esquema del escenario: Verificación habilitación campo confirmar clave
    Dado que camilo quiere ingresar a la pagina de generar clave
    Cuando el escribe con el robot en los campos
      | Campo a escribir       | palabra a escribir              |
      | número de documento    | <Diligenciar campo documento>   |
      | Ingresa la nueva clave | <Diligenciar campo nueva clave> |
    Entonces el observa que el campo: Confirma la nueva clave esta <Estado del elemento>

    Ejemplos:
      | Diligenciar campo documento | Diligenciar campo nueva clave | Estado del elemento |
      | 1234                        | 1234                          | Desabilitado        |
      | 123456                      | 1234                          | Habilitado          |
      | asdfrgtj                    | 1234                          | Desabilitado        |
      | 983838377                   | hdhdue                        | Desabilitado        |
      | dh4h6&/()fjfj456744         | %6f&h8k9)3                    | Habilitado          |
      | 0                           | -.,.                          | Desabilitado        |

  Esquema del escenario: Verificación habilitación boton generar
    Dado que camilo quiere ingresar a la pagina de generar clave
    Cuando el escribe con el robot en los campos
      | Campo a escribir        | palabra a escribir                  |
      | número de documento     | <Diligenciar campo documento>       |
      | Ingresa la nueva clave  | <Diligenciar campo nueva clave>     |
      | Confirma la nueva clave | <Diligenciar campo confirmar clave> |
    Entonces el observa que el boton: generar esta <Estado del elemento>

    Ejemplos:
      | Diligenciar campo documento | Diligenciar campo nueva clave | Diligenciar campo confirmar clave | Estado del elemento |
      | 123456789                   | 1234                          | 1234                              | Habilitado          |
      | 1234                        | 4321                          |                                   | Desabilitado        |
      | jiecnei                     | 8290                          |                                   | Desabilitado        |
      | 4g7-6m3,6/5)3456            | agsjdj                        |                                   | Desabilitado        |
      | 12345678                    | 1234                          | 4321                              | Desabilitado        |
      | 12345678                    | 2                             |                                   | Desabilitado        |
      | 12345678                    | 2345                          | 2                                 | Desabilitado        |


