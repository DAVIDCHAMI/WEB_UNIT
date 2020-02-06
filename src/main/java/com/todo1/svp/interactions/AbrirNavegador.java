package com.todo1.svp.interactions;

import static com.todo1.svp.interactions.Esperar.esperar;
import static com.todo1.svp.userinterfaces.autenticacion.TextoPantallaPage.ELEMENTO_MENSAJE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.apache.commons.lang3.StringUtils.stripAccents;

import com.todo1.svp.utils.enums.EnumUrlPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Interaction {

  private static final String COSTANT_URL_PAGE = "URL_//_PAGE";

  private String url;
  private String tituloPantalla;
  private static String comparacionUrl = "";

  public AbrirNavegador(String url) {
    if (url.contains(" ")) {
      url = url.replaceAll(" ", "_");
    }
    this.url = EnumUrlPage.valueOf(COSTANT_URL_PAGE.replace("//", url)).getUrl();
    this.tituloPantalla =
        EnumUrlPage.valueOf(COSTANT_URL_PAGE.replace("//", url)).getTituloPantalla();
  }

  public static AbrirNavegador en(String url) {
    return instrumented(AbrirNavegador.class, stripAccents(url).toUpperCase());
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    if (!(comparacionUrl.equals(url)
        & ELEMENTO_MENSAJE.of(tituloPantalla).resolveFor(actor).isVisible())) {
      actor.attemptsTo(Open.url(url));
      comparacionUrl = url;
      actor.attemptsTo(esperar(2000));
    }
  }
}
