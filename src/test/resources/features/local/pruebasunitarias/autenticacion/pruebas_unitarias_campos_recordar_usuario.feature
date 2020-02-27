#language: es

Característica: Pruebas unitarias campos en la pantalla recordar usuario

  Yo como Tester
  Quiero probar las validaciones de los campos en la pantalla recordar usuario
  Para brindar un buen servicio

  Esquema del escenario: Validaciones campo número de documento
    Dado que camilo quiere ingresar a la pagina de recordar usuario
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

  Esquema del escenario: Validaciones campo clave
    Dado que camilo quiere ingresar a la pagina de recordar usuario
    Cuando el escribe con el robot en el campo
      | Campo a escribir | palabra a escribir |
      | clave            | <Diligenciar>      |
    Entonces el observa que en el campo clave hay <Numero de caracteres> caracteres
    Y el observa en pantalla el siguiente mensaje de error: <Mensaje de error>

    Ejemplos:
      | Diligenciar                   | Numero de caracteres | Mensaje de error                  |
      | 0                             | 1                    | Ingresa los 4 dígitos de la clave |
      | 1234                          | 4                    |                                   |
      | 12345                         | 4                    |                                   |
      | 123456789012345               | 4                    |                                   |
      | qwerrtyuioñplkjhgfdsazxcvbnm  | 0                    | Ingresa los 4 dígitos de la clave |
      | !"#$%&/()=?¡\'´¨*[];:_{}-.,+@ | 0                    | Ingresa los 4 dígitos de la clave |
      | 374345&%$&$sdfdfd             | 4                    |                                   |

  Escenario: Verificación placeholder campos
    Cuando camilo ingresa a la pagina de recordar usuario
    Entonces el observa que el placeholder del campo esta correcto
      | Ingresa la clave               |
      | Ingresa el número de documento |

  Esquema del escenario: Verificación habilitación boton
    Dado que camilo quiere ingresar a la pagina de recordar usuario
    Cuando el escribe con el robot en el campo
      | Campo a escribir    | palabra a escribir    |
      | número de documento | <Diligenciar campo 1> |
      | clave               | <Diligenciar campo 2> |
    Entonces el observa que el boton: recordar esta <Estado del boton>

    Ejemplos:
      | Diligenciar campo 1 | Diligenciar campo 2 | Estado del boton |
      | 123456789           | asdfg               | Desabilitado     |
      | hduehduehd          | 1234                | Desabilitado     |
      | 12345               | 1234                | Habilitado       |
      | 12345678901234567   | 1234                | Habilitado       |
      | a1f2f3g4%5&6/7      | j7.7,2.3            | Habilitado       |
