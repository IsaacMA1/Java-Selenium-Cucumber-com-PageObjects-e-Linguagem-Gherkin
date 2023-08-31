package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class Page1CertificadoDeTreinamentoSeleniumBotaoSeleniumTrainimg {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	
	@Given("abrir o site clicar em join e clicar no SeleniumTraining")
	public void abrir_o_site_clicar_em_join_e_clicar_no_selenium_training() {
		
		Executa.abrirNavegador();
		metodos.clicar(el.CTS);
		metodos.voltarAba();
		metodos.clicar(el.btnSeleniumTrainimg);
		metodos.pause(1000);
		
	}

	@When("clicar no botao SeleniumTraining na parte superior do site")
	public void clicar_no_botao_selenium_training_na_parte_superior_do_site() {
		
		metodos.currentUrl("https://www.toolsqa.com/selenium-training?q=headers");
	}

	@Then("o usuario sera redirecionado para pagina SeleniumTraining")
	public void o_usuario_sera_redirecionado_para_pagina_selenium_training() {
		
		metodos.evidencia("EvidenciaBotaoSeleniumTraining");
		metodos.pause(1000);
		metodos.fecharNavegador();
		
	}
}
