#language: es

Característica: Pruebas unitarias campos en la pantalla ingresar clave

  Yo como Tester
  Quiero probar las validaciones de los campos en la pantalla ingresar clave
  Para brindar un buen servicio

  Esquema del escenario: Validaciones campo clave
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el escribe en los campos
      | Campo a escribir | palabra a escribir |
      | usuario          | Juan1234           |
    Y el ingresa a la pantalla clave
    Y el escribe en el campo
      | Campo a escribir | palabra a escribir |
      | clave            | <clave>            |
    Entonces el observa que en el campo clave hay <Numero de caracteres> caracteres
    Y el observa que el ultimo caracter del campo clave es <Ultimo caracter>
    Y el observa que el boton: continuar esta <Estado del boton>
    Y el observa en pantalla el siguiente mensaje de error: <Mensaje de error>
    Y el observa que su clave es enmascarada

    Ejemplos:
      | clave  | Numero de caracteres | Ultimo caracter | Mensaje de error                  | Estado del boton |
      | 1234   | 1                    | 4               |                                   | Habilitado       |
      | 1      | 1                    | 1               | Ingresa los 4 dígitos de la clave | Desabilitado     |
      | 12     | 1                    | 2               | Ingresa los 4 dígitos de la clave | Desabilitado     |
      | 123    | 1                    | 3               | Ingresa los 4 dígitos de la clave | Desabilitado     |
      | ertg   | 1                    | g               | Ingresa los 4 dígitos de la clave | Desabilitado     |
      | -,.%&% | 1                    | %               | Ingresa los 4 dígitos de la clave | Desabilitado     |

  Esquema del escenario: Validaciones imagen de seguridad
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el escribe en el campo
      | Campo a escribir | palabra a escribir |
      | usuario          | <Usuario>          |
    Y el ingresa a la pantalla clave
    Entonces el observa que la imagen de seguridad esta <Estado> para el usuario

    Ejemplos:
      | Usuario  | Estado       |
      | Juan1234 | Habilitado   |
      | 12345678 | Desabilitado |