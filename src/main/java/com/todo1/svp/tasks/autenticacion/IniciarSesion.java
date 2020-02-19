package com.todo1.svp.tasks.autenticacion;

import static com.todo1.svp.interactions.Esperar.esperar;
import static com.todo1.svp.userinterfaces.autenticacion.UsuarioPage.BOTON_PRINCIPAL;
import static com.todo1.svp.userinterfaces.autenticacion.UsuarioPage.CAMPO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import com.todo1.svp.interactions.EscribirTeclado;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IniciarSesion implements Task {

  private List<Map<String, String>> credenciales;

  public IniciarSesion(List<Map<String, String>> credenciales) {
    this.credenciales = credenciales;
  }

  public static IniciarSesion svp(List<Map<String, String>> credenciales) {
    return instrumented(IniciarSesion.class, credenciales);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    for (Map<String, String> mapCredenciales : credenciales) {
      actor.attemptsTo(
          WaitUntil.the(CAMPO.of("usuario"), isClickable()),
          Enter.theValue(mapCredenciales.get("Usuario")).into(CAMPO.of("usuario")),
          Click.on(BOTON_PRINCIPAL.of("continuar")),
          WaitUntil.the(CAMPO.of("usuario"), isNotVisible()).forNoMoreThan(4000).milliseconds(),
          EscribirTeclado.escribir(mapCredenciales.get("Contrasena"), "clave"),
          Click.on(BOTON_PRINCIPAL.of("continuar")),
          WaitUntil.the(CAMPO.of("clave"), isNotVisible()).forNoMoreThan(10000).milliseconds(),
          esperar(3000));
    }
  }
}
