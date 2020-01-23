package com.todo1.svp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TextoPantallaPage {
  public static final Target ELEMENTO_MENSAJE =
      Target.the("Mensaje mostrado en pantalla")
          .locatedBy(".//*[self::div or self::span][contains(.,'{0}')]");

  private TextoPantallaPage() {}
}
