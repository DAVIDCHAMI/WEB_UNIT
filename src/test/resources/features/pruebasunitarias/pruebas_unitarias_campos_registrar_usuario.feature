#language: es

Característica: Pruebas unitarias campos en la pantalla registrar usuario

  Yo como Tester
  Quiero probar las validaciones de los campos en la pantalla registrar usuario
  Para brindar un buen servicio

  Esquema del escenario: Validaciones campo correo electrónico
    Dado que camilo quiere ingresar a la pagina de registrar usuario
    Cuando el escribe en el campo
      | Campo a escribir   | palabra a escribir |
      | correo electrónico | <Diligenciar>      |
    Entonces el observa que en el campo correo electrónico hay <Numero de caracteres> caracteres
    Y el observa en pantalla el siguiente mensaje de error: <Mensaje de error>

    Ejemplos:
      | Diligenciar                              | Numero de caracteres | Mensaje de error                     |
      | pepito_perez1234@hotñmail.com            | 28                   |                                      |
      | pepitoñ.perez-1234@yañhoo.com            | 27                   |                                      |
      | jauahdjsjs_jdjde.iedjie2132ñ.com         | 31                   | Ingresa un correo electrónico válido |
      | !j"u#a$n%&@todoñ1.net                    | 14                   |                                      |
      | juanperez@ñmail12%&"/3-fr.com            | 24                   |                                      |
      | ad@gfñ%"&.com                            | 9                    | Ingresa un correo electrónico válido |
      | asdfghjklasdfghjklzxasdfghjklz@gmail.com | 38                   |                                      |
      | !"#$%&/()=?¡\¨*[]^`~                     | 0                    | Ingresa un correo electrónico válido |

  Esquema del escenario: Validaciones campo nuevo usuario
    Dado que camilo quiere ingresar a la pagina de registrar usuario
    Cuando el escribe en el campo
      | Campo a escribir | palabra a escribir |
      | usuario          | <Diligenciar>      |
    Entonces el observa que en el campo usuario hay <Numero de caracteres> caracteres
    Y el observa en pantalla el siguiente mensaje de error: <Mensaje de error>

    Ejemplos:
      | Diligenciar                             | Numero de caracteres | Mensaje de error                                                  |
      | qwertyuipodkfjgutyrhfncbcuduhdvueheuf   | 20                   | Debe tener entre 8 y 20 caracteres, usa letras y mínimo un número |
      | qwertyuipodkfjgutyrh34fncbcuduhdvueheuf | 20                   |                                                                   |
      | Juan$%&/.,Mruciañ12                     | 13                   |                                                                   |
      | !"#$%&/()=?¡\'´¨*[];:_{}-.,+@           | 0                    |                                                                   |
      | 123456789123456789123456789             | 20                   | Debe tener entre 8 y 20 caracteres, usa letras y mínimo un número |
      | 0JuanAndresñ                            | 12                   |                                                                   |

  Esquema del escenario: Validaciones campo numero de celular
    Dado que camilo quiere ingresar a la pagina de registrar usuario
    Cuando el escribe en el campo
      | Campo a escribir  | palabra a escribir |
      | número de celular | <Diligenciar>      |
    Entonces el observa que en el campo número de celular hay <Numero de caracteres> caracteres
    Y el observa en pantalla el siguiente mensaje de error: <Mensaje de error>

    Ejemplos:
      | Diligenciar                   | Numero de caracteres | Mensaje de error                                  |
      | 1234567890                    | 10                   |                                                   |
      | 12345                         | 5                    | Ingresa un número de celular mínimo de 10 dígitos |
      | ahdhdhfjjjcdñdñeocn           | 0                    | Ingresa un número de celular mínimo de 10 dígitos |
      | !"#$%&/()=?¡\'´¨*[];:_{}-.,+@ | 0                    | Ingresa un número de celular mínimo de 10 dígitos |
      | 123456789123456789123456789   | 14                   |                                                   |

  Esquema del escenario: Verificacion habilitacion boton continuar
    Dado que camilo quiere ingresar a la pagina de registrar usuario
    Cuando el escribe en el campo
      | Campo a escribir   | palabra a escribir               |
      | usuario            | <Diligenciar usuario>            |
      | correo electrónico | <Diligenciar correo electronico> |
      | número de celular  | <Diligenciar celular>            |
    Entonces el observa que el boton: continuar esta <Estado del boton>

    Ejemplos:
      | Diligenciar usuario     | Diligenciar correo electronico          | Diligenciar celular            | Estado del boton |
      | JuanCamilo1             | pepitoperez@todo1.com                   | 3224565780                     | Habilitado       |
      | Juan@ñ/&%%$#perez123243 | pepitoperez@todo1.com                   | 3224565780                     | Desabilitado     |
      | JuanCamilo1             | jauahdjsjs_jdjde@.$%$@""iedjie2132ñ.com | 3224565780                     | Desabilitado     |
      | JuanCamilo1             | pepitoperez@todo1.com                   | 12345                          | Desabilitado     |
      | juan!"#$@@ññ""1ramos    | !j"u#a$n%&@todoñ1.net                   | ddeidb1234"#$&/*!"@123459cbc89 | Habilitado       |

  Escenario: Verificación placeholder campos
    Cuando camilo ingresa a la pagina de registrar usuario
    Entonces el observa que el placeholder del campo esta correcto
      | Crea un usuario               |
      | Ingresa el correo electrónico |
      | Ingresa el número de celular  |