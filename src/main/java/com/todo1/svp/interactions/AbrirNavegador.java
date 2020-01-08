package com.todo1.svp.interactions;

import static com.todo1.svp.userinterfaces.TextoPantallaPage.SPAN_MENSAJE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.apache.commons.lang3.StringUtils.stripAccents;

import com.todo1.svp.utils.enums.EnumUrlPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;

public class AbrirNavegador implements Interaction {

  private static final String COSTANT_URL_PAGE = "URL_//_PAGE";

  private String url;
  private String tituloPantalla;

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
    WebDriver driver = BrowseTheWeb.as(actor).getDriver();
    if (!SPAN_MENSAJE.of(tituloPantalla).resolveFor(actor).isVisible()) {
      actor.attemptsTo(Open.url(url));
    }
  }
}
