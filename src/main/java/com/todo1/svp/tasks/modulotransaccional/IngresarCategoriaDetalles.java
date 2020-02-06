package com.todo1.svp.tasks.modulotransaccional;

import static com.todo1.svp.interactions.Esperar.esperar;
import static com.todo1.svp.userinterfaces.modulotransaccional.SaldosCategoriaPage.CATEGORIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

public class IngresarCategoriaDetalles implements Task {

  private String categoria;
  private String numeroProducto;

  public IngresarCategoriaDetalles(String categoria, String numeroProducto) {
    this.categoria = categoria;
    this.numeroProducto = numeroProducto;
  }

  public static IngresarCategoriaDetalles movimientos(String categoria, String numeroProducto) {
    return instrumented(IngresarCategoriaDetalles.class, categoria, numeroProducto);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(CATEGORIA.of(categoria), isEnabled()));
    if ("false"
        .equalsIgnoreCase(
            CATEGORIA.of(categoria).resolveFor(actor).getAttribute("data-expanded"))) {
      actor.attemptsTo(Click.on(CATEGORIA.of(categoria)), esperar(3000));
    }
    CATEGORIA
        .of(categoria)
        .resolveFor(actor)
        .findElement(
            By.xpath(
                ".//div[@class='account-row-content']//span[contains(.,'" + numeroProducto + "')]"))
        .click();
    actor.attemptsTo(esperar(5000));
  }
}
