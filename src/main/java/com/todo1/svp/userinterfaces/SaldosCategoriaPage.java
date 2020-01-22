package com.todo1.svp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SaldosCategoriaPage {
  public static final Target CATEGORIA =
      Target.the("Saldos por categoria")
          .locatedBy(
              ".//div[contains(@class,'section-expandable')][@data-expanded][contains(.,'{0}')]");
  public static final Target SPINNER =
      Target.the("Spinner svp").located(By.xpath("//*[@id='startup']"));

  private SaldosCategoriaPage() {}
}
