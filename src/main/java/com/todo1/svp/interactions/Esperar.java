package com.todo1.svp.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Esperar implements Interaction {
  private int time;

  protected Esperar(int time) {
    this.time = time;
  }

  public static Esperar esperar(int time) {
    return instrumented(Esperar.class, time);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    new InternalSystemClock().pauseFor(time);
  }
}
