package com.todo1.svp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GenerarClavePage {
  public static final Target SELECT_TYPE_LIST =
      Target.the("Seleccionar type list")
          .locatedBy(".//div[@class='container-dropdown floating-label'][contains(.,'{0}')]");
  public static final Target OPCION_TYPE_LIST =
      Target.the("Seleccionar opcion en type list")
          .locatedBy(".//div[@class='dropdown-list']//span[contains(.,'{0}')]");
  public static final Target PLACEHOLDER_TYPE_LIST =
      Target.the("Placeholder de la opcion escogida en el type list")
          .locatedBy("//div[@class='dropdown-display-content']/span[contains(.,'{0}')]");
  public static final Target TOOLTIP =
      Target.the("Objeto tooltip").located(By.className("tooltip "));

  private GenerarClavePage() {}
}
