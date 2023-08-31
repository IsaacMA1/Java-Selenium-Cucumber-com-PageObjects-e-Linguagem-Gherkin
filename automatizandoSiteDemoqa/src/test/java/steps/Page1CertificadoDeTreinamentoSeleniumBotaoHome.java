package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class Page1CertificadoDeTreinamentoSeleniumBotaoHome {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("abrir o site clicar em join e clicar no botao home")
	public void abrir_o_site_clicar_em_join_e_clicar_no_botao_home() {

		Executa.abrirNavegador();
		metodos.clicar(el.CTS);
		metodos.voltarAba();
		metodos.clicar(el.btnHome);
		metodos.pause(1000);

	}

	@When("clicar no botao home na parte superior do site")
	public void clicar_no_botao_home_na_parte_superior_do_site() {

		// validando se o click foi para pagina correta

		metodos.currentUrl("https://www.toolsqa.com/");

	}

	@Then("o usuario sera redirecionado para pagina home")
	public void o_usuario_sera_redirecionado_para_pagina_home() {

		metodos.pause(1000);
		metodos.evidencia("PaginaHome");
		metodos.fecharNavegador();
	}

	@Given("clicar no botao home")
	public void clicar_no_botao_home() {

		metodos.clicar(el.btnHome);
		metodos.currentUrl("https://www.toolsqa.com/");
		metodos.pause(1000);
	}

	@When("clicar no botao Enroll Yourself")
	public void clicar_no_botao_enroll_yourself() {

		metodos.scroll(250);
		metodos.clicar(el.btnEnrollYourSelf);

	}

	@Then("o usuario sera redirecionado para pagina Selenium Certification Training no campo de registrar")
	public void o_usuario_sera_redirecionado_para_pagina_selenium_certification_training_no_campo_de_registrar() {

		metodos.currentUrl("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		metodos.scroll(-150);
		metodos.pause(1000);
		metodos.evidencia("ResultadoDoClickNoBotaoEnrollYourSelf");
		metodos.pause(1000);
		metodos.fecharNavegador();

	}

	@When("clicar no botao ReadMore")
	public void clicar_no_botao_read_more() {

		metodos.scroll(250);
		metodos.clicar(el.btnReadMore);
	}

	@Then("o usuario sera redirecionado para pagina Selenium Certification Training")
	public void o_usuario_sera_redirecionado_para_pagina_selenium_certification_training() {

		metodos.currentUrl("https://www.toolsqa.com/selenium-training?q=banner");
		metodos.scroll(150);
		metodos.pause(1000);
		metodos.evidencia("ResultadoDoClickNoBotaoReadMore");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@When("clicar no botao onde tera alguma tecnologias disponiveis")
	public void clicar_no_botao_onde_tera_alguma_tecnologias_disponiveis() {

		metodos.scroll(300);
		metodos.clicar(el.btnTecnologia);
	}

	@Then("o usuario sera redirecionado para pagina daquela tecnologia especifica com mais informacoes")
	public void o_usuario_sera_redirecionado_para_pagina_daquela_tecnologia_especifica_com_mais_informacoes() {

		metodos.currentUrl("https://www.toolsqa.com/testrigor/testrigor-tutorial");
		metodos.pause(1000);
		metodos.evidencia("ResultadoDoClickNoBotaoTestrigorTutorial");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@When("clicar em alguns dos artigos disponiveis")
	public void clicar_em_alguns_dos_artigos_disponiveis() {

		metodos.scroll(1300);
		metodos.clicar(el.btnArticle);
		metodos.pause(1000);
	}

	@Then("o usuario sera redirecionado para pagina daquele artigo")
	public void o_usuario_sera_redirecionado_para_pagina_daquele_artigo() {
		
		metodos.evidencia("ResultadoDoClickNoCampoDeArticles");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@Given("rolar ate o final da pagina")
	public void rolar_ate_o_final_da_pagina() {

		metodos.scrollAteOFinal();
	}

	@When("clicar em Team no campo de site links")
	public void clicar_em_team_no_campo_de_site_links() {
		
		metodos.pause(1000);
		metodos.clicar(el.btnTeam);
		metodos.voltarAba();
		metodos.pause(1000);
	}

	@Then("o usuario sera redirecionado para pagina onde precisara do login do linkedin")
	public void o_usuario_sera_redirecionado_para_pagina_onde_precisara_do_login_do_linkedin() {

		metodos.evidencia("ResultadoDoClickNoTeamNoCampoDeSitesLinks");
		metodos.pause(1000);
		metodos.currentUrl("https://www.linkedin.com/uas/login?session_redirect=%2Fcompany%2F9458062%2F");
		metodos.fecharNavegador();
		
	}

	@When("clicar em Twitter no campo de find us")
	public void clicar_em_twitter_no_campo_de_find_us() {

		metodos.clicar(el.btnTwitter);
		metodos.pause(3000);
	}

	@Then("o usuario sera redirecionado para pagina do Twitter onde precisara estar logado para ter acesso as informacoes")
	public void o_usuario_sera_redirecionado_para_pagina_do_twitter_onde_precisara_estar_logado_para_ter_acesso_as_informacoes() {
		
		metodos.evidencia("ResultadoDoClickNoTwitterNoCampoDeFindUs");
		metodos.pause(1000);
		metodos.fecharNavegador();
		
	}

}
