package com.todo1.svp.questions.modulotransaccional;

import static com.todo1.svp.interactions.Esperar.esperar;
import static com.todo1.svp.userinterfaces.modulotransaccional.SaldosCategoriaPage.CATEGORIA_PAGOS;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class TextoConsultaPagos implements Question<Boolean> {

  private String categoriaPagos;
  private List<String> texto;

  public TextoConsultaPagos(String categoriaPagos, List<String> texto) {
    this.categoriaPagos = categoriaPagos;
    this.texto = texto;
  }

  public static TextoConsultaPagos esCorrecto(String categoriaPagos, List<String> texto) {
    return new TextoConsultaPagos(categoriaPagos, texto);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean resultado = true;
    actor.attemptsTo(Click.on(CATEGORIA_PAGOS.of(categoriaPagos)));
    for (String textosValidar : texto) {
      resultado = verificarTextoPagos(actor, textosValidar);
      if (!resultado) {
        break;
      }
    }
    return resultado;
  }

  private boolean verificarTextoPagos(Actor actor, String texto) {
    actor.attemptsTo(esperar(3000));
    return CATEGORIA_PAGOS
        .of(categoriaPagos)
        .resolveFor(actor)
        .findBy(By.xpath(".//span[contains(.,'" + texto + "')]"))
        .isVisible();
  }
}
