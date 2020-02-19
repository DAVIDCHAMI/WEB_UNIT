package com.todo1.svp.userinterfaces.autenticacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GenerarClavePage {
  public static final Target SELECT_TYPE_LIST =
      Target.the("Seleccionar type list")
          .locatedBy(".//div[@class='animated-select-container'][contains(.,'{0}')]");
  public static final Target OPCION_TYPE_LIST =
      Target.the("Seleccionar opcion en type list")
          .locatedBy(".//div[@class='dropdown-list']//span[contains(.,'{0}')]");
  public static final Target PLACEHOLDER_TYPE_LIST =
      Target.the("Placeholder de la opcion escogida en el type list")
          .locatedBy("//div[@class='dropdown-display-content']/span[contains(.,'{0}')]");
  public static final Target TOOLTIP =
      Target.the("Objeto tooltip")
          .located(By.xpath(".//div[@data-block='BC_Patterns.TooltipSVP']"));

  private GenerarClavePage() {}
}
