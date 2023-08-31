package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class Page1CertificadoDeTreinamentoSeleniumBotaoTutorials {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("abrir o site clicar em join e clicar no botao tutorials")
	public void abrir_o_site_clicar_em_join_e_clicar_no_botao_tutorials() {

		Executa.abrirNavegador();
		metodos.clicar(el.CTS);
		metodos.voltarAba();
		metodos.pause(2000);
		metodos.clicar(el.btnTutorials);

	}

	@When("clicar no botao tutorials na parte superior do site")
	public void clicar_no_botao_tutorials_na_parte_superior_do_site() {

		metodos.currentUrl("https://www.toolsqa.com/selenium-training/");
	}

	@Then("o usuario abrira um menu com opcoes de tutoriais")
	public void o_usuario_abrira_um_menu_com_opcoes_de_tutoriais() {

		metodos.pause(1000);
		metodos.evidencia("EvidenciaBotaoTutorials");
		metodos.fecharNavegador();
	}

	@When("clicar em qa practies")
	public void clicar_em_qa_practies() {

		metodos.pause(2000);
		metodos.clicar(el.btnQAPractices);
	}

	@When("clicar em software testing")
	public void clicar_em_software_testing() {

		metodos.pause(2000);
		metodos.clicar(el.btnSoftwareTesting);
	}

	@Then("o usuario sera redirecionado para o tutorial sobre software testing")
	public void o_usuario_sera_redirecionado_para_o_tutorial_sobre_software_testing() {

		metodos.currentUrl("https://www.toolsqa.com/software-testing/software-testing-tutorial/");
		metodos.pause(1000);
		metodos.evidencia("EvidenciaBotaoTutorialsQAPracticesAssuntoSoftwareTesting");
		metodos.fecharNavegador();
	}

	@When("clicar em back-end testing automation")
	public void clicar_em_back_end_testing_automation() {

		metodos.pause(2000);
		metodos.clicar(el.btnBackEndTestingAutomation);
	}

	@When("clicar em rest assured")
	public void clicar_em_rest_assured() {

		metodos.pause(2000);
		metodos.clicar(el.btnRestAssured);
	}

	@Then("o usuario sera redirecionado para o tutorial sobre rest assured")
	public void o_usuario_sera_redirecionado_para_o_tutorial_sobre_rest_assured() {
		
		metodos.currentUrl("https://www.toolsqa.com/rest-assured-tutorial/");
		metodos.pause(1000);
		metodos.evidencia("EvidenciaBotaoTutorialsback-endTestingAutomationRestAssured");
		metodos.fecharNavegador();
	}

}
