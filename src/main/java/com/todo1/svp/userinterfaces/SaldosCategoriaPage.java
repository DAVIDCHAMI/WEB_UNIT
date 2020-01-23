package com.todo1.svp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SaldosCategoriaPage {
  public static final Target CATEGORIA =
      Target.the("Saldos por categoria")
          .locatedBy(
              ".//div[contains(@class,'section-expandable')][@data-expanded][contains(.,'{0}')]");

  private SaldosCategoriaPage() {}
}
