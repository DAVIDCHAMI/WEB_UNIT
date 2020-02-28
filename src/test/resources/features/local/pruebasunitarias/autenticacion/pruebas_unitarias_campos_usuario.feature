#language: es

Característica: Pruebas unitarias campos en la pantalla ingresar usuario

  Yo como Tester
  Quiero probar las validaciones de los campos en la pantalla ingresar usuario
  Para brindar un buen servicio

  Esquema del escenario: Validaciones campo Usuario
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el escribe en el campo
      | Campo a escribir | palabra a escribir |
      | usuario          | <Usuarios>         |
    Entonces el observa que en el campo usuario hay <Numero de caracteres> caracteres
    Y el observa que el boton: continuar esta <Estado del boton>
    Y el observa en pantalla el siguiente mensaje de error: <Mensaje de error>

    Ejemplos:
      | Usuarios                              | Numero de caracteres | Estado del boton | Mensaje de error                              |
      | qwertyuipodkfjgutyrhfncbcuduhdvueheuf | 20                   | Habilitado       |                                               |
      | Juan$%&/.,Mruciañ                     | 11                   | Habilitado       |                                               |
      | !"#$%&/()=?¡\'´¨*[];:_{}-.,+@         | 0                    | Desabilitado     |                                               |
      | 123456789123456789123456789           | 20                   | Habilitado       |                                               |
      | 012138883                             | 9                    | Desabilitado     | Ingresa un documento sin ceros a la izquierda |
      | 0JuanAndresñ                          | 12                   | Habilitado       |                                               |
      | 1345678346                            | 10                   | Habilitado       |                                               |

  @t
  Escenario: Verificación placeholder campo usuario
    Cuando camilo ingresa a la pagina de usuario
    Entonces el observa que el placeholder del campo esta correcto
      | Ingresa el usuario |
