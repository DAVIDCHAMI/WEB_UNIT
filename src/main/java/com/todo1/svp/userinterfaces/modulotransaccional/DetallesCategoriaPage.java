package com.todo1.svp.userinterfaces.modulotransaccional;

import net.serenitybdd.screenplay.targets.Target;

public class DetallesCategoriaPage {
  public static final Target TYPE_LIST_SELECT =
      Target.the("Type list con elemento select").locatedBy("//span[contains(.,'{0}')]/..//select");

  private DetallesCategoriaPage() {}
}
