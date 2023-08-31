package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class Page1CertificadoDeTreinamentoSeleniumBotaoAbout {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Given("abrir o site clicar em join e clicar no botao About")
	public void abrir_o_site_clicar_em_join_e_clicar_no_botao_about() {
		
		Executa.abrirNavegador();
		metodos.clicar(el.CTS);
		metodos.voltarAba();
		metodos.clicar(el.btnAbout);
		metodos.pause(1000);
	}

	@When("clicar no botao About site na parte superior do site")
	public void clicar_no_botao_about_site_na_parte_superior_do_site() {
	    
		metodos.currentUrl("https://www.toolsqa.com/");
	}
	
	@Then("o usuario sera redirecionado a pagina home")
	public void o_usuario_sera_redirecionado_a_pagina_home() {
	    
		metodos.pause(1000);
		metodos.evidencia("EvidenciaBotaoAbout");
		metodos.fecharNavegador();
	}
}
