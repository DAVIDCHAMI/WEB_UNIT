package com.todo1.svp.userinterfaces.modulotransaccional;

import net.serenitybdd.screenplay.targets.Target;

public class SaldosCategoriaPage {
  public static final Target CATEGORIA =
      Target.the("Saldos por categoria")
          .locatedBy(
              ".//div[contains(@class,'section-expandable')][@data-expanded][contains(.,'{0}')]");
  public static final Target CATEGORIA_PAGOS =
      Target.the("Categoria proximos pagos")
          .locatedBy(
              ".//div[@id='PaymentsAccordion']//div[contains(@class,'section-expandable')][@data-expanded][contains(.,'{0}')]");

  private SaldosCategoriaPage() {}
}
