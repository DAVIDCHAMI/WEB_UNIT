# SVP Rediseño Personas Web Unit Test – Screenplay

Este proyecto es creado para realizar pruebas a campos como de caracteres permitidos, caracteres no permitidos y mensajes de error del campo; Pruebas de verificacion de botones, validando su habilitacion en ciertos casos en especificos; Validaciones de los textos en pantalla como mensajes, titulos, placeholders y textos en botones.
 
## Contenido ##
 
- [Prerrequisitos](#prerrequisitos)
- [Configuracion](#configuracion)
- [Ejecucion de pruebas](#ejecucion)
- [Changelog](#changelog)
 
## Prerrequisitos 📋
 
- IDE instalado
- JDK 1.8
- Gradle 4.9 o superior
- GIT
 
## Configuracion ⚙️
 
Ya descargado el proyecto, importarlo en el IDE de preferencia.

Es importante compilar el proyecto para esto, ejecutar alguno de los siguientes comandos.
Ejecutar por consola 
```
gradle clean assemble
gradle compileJava
```
**Nota:** El comando gradle clean assemble ejecuta el compileJava por defecto.

### Error al momento de compilar ###

Al momento de compilar puede salir este error

```
> Task :compileJava FAILED
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:19: error: unclosed character literal
    caracteres.put('┬í', EscrituraTeclado::escribirAbrirSignoExclamacion);
                   ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:19: error: illegal character: '\u00a1'
    caracteres.put('┬í', EscrituraTeclado::escribirAbrirSignoExclamacion);
                     ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:19: error: unclosed character literal
    caracteres.put('┬í', EscrituraTeclado::escribirAbrirSignoExclamacion);
                      ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:19: error: ';' expected
    caracteres.put('┬í', EscrituraTeclado::escribirAbrirSignoExclamacion);
                                         ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:19: error: not a statement
    caracteres.put('┬í', EscrituraTeclado::escribirAbrirSignoExclamacion);
                                           ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:19: error: ';' expected
    caracteres.put('┬í', EscrituraTeclado::escribirAbrirSignoExclamacion);
                                                                        ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:28: error: unclosed character literal
    caracteres.put('┬┐', EscrituraTeclado::escribirAbrirSignoInterrogacion);
                   ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:28: error: illegal character: '\u00bf'
    caracteres.put('┬┐', EscrituraTeclado::escribirAbrirSignoInterrogacion);
                     ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:28: error: unclosed character literal
    caracteres.put('┬┐', EscrituraTeclado::escribirAbrirSignoInterrogacion);
                      ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:28: error: ';' expected
    caracteres.put('┬┐', EscrituraTeclado::escribirAbrirSignoInterrogacion);
                                         ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:28: error: not a statement
    caracteres.put('┬┐', EscrituraTeclado::escribirAbrirSignoInterrogacion);
                                           ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:28: error: ';' expected
    caracteres.put('┬┐', EscrituraTeclado::escribirAbrirSignoInterrogacion);
                                                                          ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:42: error: unclosed character literal
    caracteres.put('├▒', EscrituraTeclado::escribirEnie);
                   ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:42: error: illegal character: '\u00b1'
    caracteres.put('├▒', EscrituraTeclado::escribirEnie);
                     ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:42: error: unclosed character literal
    caracteres.put('├▒', EscrituraTeclado::escribirEnie);
                      ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:42: error: ';' expected
    caracteres.put('├▒', EscrituraTeclado::escribirEnie);
                                         ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:42: error: not a statement
    caracteres.put('├▒', EscrituraTeclado::escribirEnie);
                                           ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:42: error: ';' expected
    caracteres.put('├▒', EscrituraTeclado::escribirEnie);
                                                       ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:72: error: unclosed character literal
    caracteres.put('├í', EscrituraTeclado::escribirAcentoLetraA);
                   ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:72: error: illegal character: '\u00a1'
    caracteres.put('├í', EscrituraTeclado::escribirAcentoLetraA);
                     ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:72: error: unclosed character literal
    caracteres.put('├í', EscrituraTeclado::escribirAcentoLetraA);
                      ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:72: error: ';' expected
    caracteres.put('├í', EscrituraTeclado::escribirAcentoLetraA);
                                         ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:72: error: not a statement
    caracteres.put('├í', EscrituraTeclado::escribirAcentoLetraA);
                                           ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:72: error: ';' expected
    caracteres.put('├í', EscrituraTeclado::escribirAcentoLetraA);
                                                               ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:73: error: unclosed character literal
    caracteres.put('├®', EscrituraTeclado::escribirAcentoLetraE);
                   ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:73: error: illegal character: '\u00a9'
    caracteres.put('├®', EscrituraTeclado::escribirAcentoLetraE);
                     ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:73: error: unclosed character literal
    caracteres.put('├®', EscrituraTeclado::escribirAcentoLetraE);
                      ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:73: error: ';' expected
    caracteres.put('├®', EscrituraTeclado::escribirAcentoLetraE);
                                         ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:73: error: not a statement
    caracteres.put('├®', EscrituraTeclado::escribirAcentoLetraE);
                                           ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:73: error: ';' expected
    caracteres.put('├®', EscrituraTeclado::escribirAcentoLetraE);
                                                               ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:74: error: unclosed character literal
    caracteres.put('├¡', EscrituraTeclado::escribirAcentoLetraI);
                   ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:74: error: illegal character: '\u00ad'
    caracteres.put('├¡', EscrituraTeclado::escribirAcentoLetraI);
                     ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:74: error: unclosed character literal
    caracteres.put('├¡', EscrituraTeclado::escribirAcentoLetraI);
                      ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:74: error: ';' expected
    caracteres.put('├¡', EscrituraTeclado::escribirAcentoLetraI);
                                         ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:74: error: not a statement
    caracteres.put('├¡', EscrituraTeclado::escribirAcentoLetraI);
                                           ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:74: error: ';' expected
    caracteres.put('├¡', EscrituraTeclado::escribirAcentoLetraI);
                                                               ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:75: error: unclosed character literal
    caracteres.put('├│', EscrituraTeclado::escribirAcentoLetraO);
                   ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:75: error: illegal character: '\u00b3'
    caracteres.put('├│', EscrituraTeclado::escribirAcentoLetraO);
                     ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:75: error: unclosed character literal
    caracteres.put('├│', EscrituraTeclado::escribirAcentoLetraO);
                      ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:75: error: ';' expected
    caracteres.put('├│', EscrituraTeclado::escribirAcentoLetraO);
                                         ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:75: error: not a statement
    caracteres.put('├│', EscrituraTeclado::escribirAcentoLetraO);
                                           ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:75: error: ';' expected
    caracteres.put('├│', EscrituraTeclado::escribirAcentoLetraO);
                                                               ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:76: error: unclosed character literal
    caracteres.put('├║', EscrituraTeclado::escribirAcentoLetraU);
                   ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:76: error: ';' expected
    caracteres.put('├║', EscrituraTeclado::escribirAcentoLetraU);
                     ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:76: error: unclosed character literal
    caracteres.put('├║', EscrituraTeclado::escribirAcentoLetraU);
                      ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:76: error: ';' expected
    caracteres.put('├║', EscrituraTeclado::escribirAcentoLetraU);
                                         ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:76: error: not a statement
    caracteres.put('├║', EscrituraTeclado::escribirAcentoLetraU);
                                           ^
D:\Proyecto TODO1\svp-rediseno-personas-web-unit-test-screenplay\src\main\java\com\todo1\svp\utils\EscrituraTeclado.java:76: error: ';' expected
    caracteres.put('├║', EscrituraTeclado::escribirAcentoLetraU);
                                                               ^
48 errors

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileJava'.
> Compilation failed; see the compiler error output for details.

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 5.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/4.9/userguide/command_line_interface.html#sec:command_line_warnings

BUILD FAILED in 6s
2 actionable tasks: 2 executed
```

Este error se da momento de compilar ya que aveces con el encode se pieder el caracter.

Para solucionar este error, cambiar el encode a **windows-1552** de la clase **EscrituraTeclado**
y cambiar los caracteres que esten asi:
```
    caracteres.put('�', EscrituraTeclado::escribirAbrirSignoExclamacion);
```
Cambiarlos por el caracter que se dice en el metodo, asi de esta manera:
```
    caracteres.put('¡', EscrituraTeclado::escribirAbrirSignoExclamacion);
```
Despues ejecutar el comando:
```
gradle compileJava
```

## Ejecucion 🚀

**Ejecución Todos los test**

Para ejecutar todos los test del proyecto y generar el reporte puede usar.

```
gradle clean test aggregate
```

**Ejecución algunos test**

Para ejecutar algunos test se puede usar el comando
```
gradle clean test -Dtest.single=**/runners/tipoprueba/operacion/runner aggregate
```
Esta es la estructura base. Quedaria como ejemplo:
```
gradle clean test -Dtest.single=**/runners/pruebasunitarias/autenticacion/PruebasUnitariasCampoClaveRunner aggregate
```

**Ejecucion de test en otro navegador**

El proyecto cuenta con los webderiver de los navegadores de: **Chrome, Firefox y Microsoft Edge.**
Cada uno de estos esta para la ultima version del navegador a seleccionar.

Para la ejecucion de los test con otro navegador puedes utilizar esta linea y puede agregarla al comando de ejecucion
```
-Dwebdriver.driver= Nombre del navegador
```

Esta es la estructura base. Quedaria como ejemplo:
* Firefox
```
-Dwebdriver.driver=firefox
```
* Chrome
```
-Dwebdriver.driver=chrome
```
* Microsoft Edge
```
-Dwebdriver.driver=edge
```

### Nota

***El drivers actuales son compatibles con las ultimas versiones de los navegadores Chrome, Firefox y Microsoft Edge en 
caso de que no funcione por temas del driver ingresar a las URL:***
* ***Para Chrome: [ChromeDriver - WebDriver for Chrome](https://chromedriver.chromium.org/)***
* ***Para Firefox: [Supported platforms](https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html) y
[Descargas version](https://github.com/mozilla/geckodriver)***
* ***Para Microsoft Edge: 
[Microsof Edge WebDriver](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/)***
    
***Buscar el driver correspondiente a la version del navegador instalado en tu computadora; guardarlo en la ruta 
src/test/resource/driver, reemplazar el que esta en la ruta por el nuevo descargado y ejecutar las pruebas.***

***Cualquier duda comunicarse por Teams con [Juan Camilo Murcia Ramos]()***

**Ejecucion de test con un driver en otra ruta**

Si tiene el driver en alguna ruta en tu computadora o tienes un sistema operativo diferente puedes utilizar esta linea 
y puede agregarla al comando de ejecucion.
```
-Dwebdriver.chrome.driver=Ubicacion del driver
```
Esta es la estructura base. Quedaria como ejemplo:
```
gradle clean test -Dwebdriver.chrome.driver=C://chromedriver.exe aggregate
```

todos los filtros que se pueden usar se pueden ver en:
[docGradle](https://docs.gradle.org/current/javadoc/org/gradle/api/tasks/testing/TestFilter.html)
 
## Licencia ##
 
(C) TODO1 SERVICES, INC. ('TODO1') All rights reserved.
 
This work is protected by the United States of America copyright laws.
All information contained herein is and remains the property of TODO1 [and its suppliers, if any]. Dissemination of this information or
reproduction of this material is not permitted unless prior written consent is obtained from TODO1 SERVICES, INC.
 