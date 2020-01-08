#language: es

Característica: Verificar texto y botones en pantalla

  Yo como Tester
  Quiero verificar los textos y botones mostrados en pantalla
  Para brindar un buen servicio

  @pantalla_generar_clave
  Escenario: Verificar texto en la  pantalla generar clave
    Cuando que camilo quiere ingresar a la pagina de generar clave
    Entonces el observa los textos correctamente
      | Generar clave                                                                                                                                  |
      | La nueva clave quedará pendiente de activación en la Sucursal Física. Si eres colombiano en el exterior comunícate con la Sucursal Telefónica. |
    Y el observa un tooltip con un mensaje de ayuda
      | La clave no debe tener números repetidos ni consecutivos. |


  @pantalla_ingresar_usuario
  Escenario: Verificar texto en la pantalla ingresar usuario
    Cuando camilo ingresa a la pagina de usuario
    Entonces el observa los textos correctamente
      | ¡Hola!                                                                         |
      | Si aún no has creado el usuario, ingresa el número del documento de identidad. |
      | ¿Olvidaste tu usuario?                                                         |

  @pantalla_recordar_usuario
  Escenario: Verificar texto en la pantalla recordar usuario
    Cuando que camilo quiere ingresar a la pagina de recordar usuario
    Entonces el observa los textos correctamente
      | Recordar usuario                                                                      |
      | Ingresa los datos para enviar el usuario al correo electrónico que tienes registrado. |
      | Debes ingresar la clave que usas en el cajero                                         |
    Y el observa que el boton: cancelar esta Habilitado

  @pantalla_ingresar_clave
  Escenario: Verificar texto en la pantalla ingresar clave
    Dado que camilo quiere ingresar a la pagina de usuario
    Cuando el escribe en los campos
      | Campo a escribir | palabra a escribir |
      | usuario          | Juan1234           |
    Y el ingresa a la pantalla clave
    Entonces el observa los textos correctamente
      | Ingresar clave                          |
      | Ingresa la clave que usas en el cajero  |
      | Verifica la imagen y frase de seguridad |
      | academizar                              |
      | Generar clave                           |
    Y el observa que el boton: volver esta Habilitado
    Y el observa un tooltip con un mensaje de ayuda
      | Esta opción es exclusiva para colombianos en el exterior. Si estas en Colombia, debes generar la clave en la Sucursal Física. |

  @pantalla_registrar_usuario_(usuario)
  Escenario: Verificar texto en la pantalla registrar usuario (Usuario)
    Cuando que camilo quiere ingresar a la pagina de registrar usuario
    Entonces el observa los textos correctamente
      | Registrar usuario                                                                                                                                                 |
      | Ingresa el correo electrónico para que recuerdes el usuario en la opción ¿Olvidaste tu usuario? de la Sucursal Virtual Personas o PSE, cada vez que lo necesites. |
      | Debe tener entre 8 y 20 caracteres, usa letras y mínimo un número                                                                                                 |
      | Debe tener entre 6 y 38 caracteres                                                                                                                                |
    Y el observa que el boton: cancelar esta Habilitado