package steps;

import java.awt.AWTException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class Page2PaginaInicialBotaoWidgets {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Given("abrir o site clicar em widgets")
	public void abrir_o_site_clicar_em_widgets() {
		
		Executa.abrirNavegador();
		metodos.pause(1000);
		metodos.scroll(400);
		metodos.clicar(el.btnWidgetsPaginaInicial);
		metodos.pause(1000);
		metodos.currentUrl("https://demoqa.com/widgets");
		metodos.pause(1000);
		
		
	}

	@When("clicar no botao slider")
	public void clicar_no_botao_slider() {
		
		metodos.scroll(400);
		metodos.clicar(el.btnSlide);
		metodos.pause(1000);
		metodos.evidencia("PaginaDeWidgetsSliderElementoSemSeMover");
		metodos.pause(1000);
		metodos.currentUrl("https://demoqa.com/slider");
		
	}

	@When("clicar no elemento")
	public void clicar_no_elemento() throws AWTException {
		
		metodos.clicarEmUmaParteComCoordenadas(el.btnControll); 
		metodos.pause(1000);
	}

	@Then("o usuario vera o elemento se movimento para cima")
	public void o_usuario_vera_o_elemento_se_movimento_para_cima() {
		
		metodos.evidencia("PaginaDeWidgetsSliderElementoMovido");
		metodos.pause(1000);
		metodos.fecharNavegador();
		
	}
	@When("clicar em widgets")
	public void clicar_em_widgets() {
	    
		metodos.scroll(400);
		metodos.evidencia("PaginaDeWidgetsColunaAberta");
		metodos.pause(1000);
		metodos.clicar(el.btnWidgetsPage);
		metodos.pause(1000);
	}

	@Then("a coluna vai se fechar")
	public void a_coluna_vai_se_fechar() {
	  
		metodos.evidencia("PaginaDeWidgetsColunaFechada");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	
}
