package com.todo1.svp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioPage {
  public static final Target CAMPO =
      Target.the("Campo {0}")
          .locatedBy(".//input/../../../..//span[contains(.,'{0}')]/../../..//input");
  public static final Target CAMPO_CLAVE =
      Target.the("Campo {0}").locatedBy("//span[contains(.,'{0}')]/../../..//input");
  public static final Target BOTON_PRINCIPAL =
      Target.the("Boton {0}").locatedBy(".//button[contains(.,'{0}')]");
  public static final Target MENSAJE_VALIDACION =
      Target.the("Message of validation document")
          .locatedBy(".//span[@class='validation-message' or @id='ErrorText'][text()='{0}']");
  public static final Target LOGO_BANCOLOMBIA =
      Target.the("Logo bancolombia").located(By.className("app-logo"));

  private UsuarioPage() {}
}
