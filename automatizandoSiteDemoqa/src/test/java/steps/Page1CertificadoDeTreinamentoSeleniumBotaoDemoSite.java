package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class Page1CertificadoDeTreinamentoSeleniumBotaoDemoSite {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Given("abrir o site clicar em join e clicar no botao demo site")
	public void abrir_o_site_clicar_em_join_e_clicar_no_botao_demo_site() {
		
		Executa.abrirNavegador();
		metodos.clicar(el.CTS);
		metodos.voltarAba();
		metodos.clicar(el.btnDemoSite);
		metodos.voltarAba();
		metodos.pause(1000);
	}

	@When("clicar no botao demo site na parte superior do site")
	public void clicar_no_botao_demo_site_na_parte_superior_do_site() {
		
	    metodos.currentUrl("https://demoqa.com/");
	}

	@Then("o usuario sera redirecionado para pagina demo site")
	public void o_usuario_sera_redirecionado_para_pagina_demo_site() {
	    
		metodos.pause(1000);
		metodos.evidencia("EvidenciaBotaoDemoSite");
		metodos.fecharNavegador();
	}

	
	
	
}
