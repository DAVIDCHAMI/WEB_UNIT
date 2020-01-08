package com.todo1.svp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TextoPantallaPage {
  public static final Target DIV_MENSAJE =
      Target.the("Mensaje mostrado en pantalla").locatedBy(".//div[contains(.,'{0}')]");
  public static final Target SPAN_MENSAJE =
      Target.the("Mensaje mostrado en pantalla").locatedBy(".//span[contains(.,'{0}')]");

  private TextoPantallaPage() {}
}
