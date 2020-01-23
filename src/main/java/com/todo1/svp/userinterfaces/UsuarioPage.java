package com.todo1.svp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioPage {
  public static final Target CAMPO =
      Target.the("Campo {0}")
          .locatedBy(
              "//*[self::input or self::textarea]/../../../../../../..//span[contains(.,'{0}')]//following::*[self::input[not(@type='checkbox')] or self::textarea][1]");
  public static final Target BOTON_PRINCIPAL =
      Target.the("Boton {0}")
          .locatedBy(
              ".//button[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'{0}')]");
  public static final Target MENSAJE_VALIDACION =
      Target.the("Message of validation document")
          .locatedBy(".//span[@class='validation-message' or @id='ErrorText'][text()='{0}']");
  public static final Target LOGO_BANCOLOMBIA =
      Target.the("Logo bancolombia").located(By.className("app-logo"));
  public static final Target TXT_CLAVE =
      Target.the("Campo clave de usuario").located(By.id("b3-Input_TextVar"));

  private UsuarioPage() {}
}
