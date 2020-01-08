package com.todo1.svp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClavePage {
  public static final Target IMAGEN_SEGURIDAD =
      Target.the("Imagen de seguridad del usuario").located(By.id("UserImage"));

  private ClavePage() {}
}
