#language: es

Característica: Pruebas unitarias Detalles y movimientos

  Yo como Tester
  Quiero probar las validaciones de los campos en la pantalla detalles y movimientos
  Para brindar un buen servicio

  Esquema del escenario: Validaciones campo Type list seleccionar producto cuentas
    Dado que camilo quiere ingresar a la pagina de usuario
    Y el inicia sesion en la SVP con el robot
      | Usuario   | Contrasena |
      | chipote95 | 1234       |
    Cuando el ingresa a los detalles de Cuentas con numero 406-757950-06
    Y el selecciona un producto: <Opcion>
    Entonces el observa que el placeholder del campo esta correcto
      | <Opcion> |

    Ejemplos:
      | Opcion                  |
      | Ahorros 406-757950-24   |
      | Ahorros 406-757950-25   |
      | Ahorros 406-757950-06   |
      | Corriente 406-157950-05 |