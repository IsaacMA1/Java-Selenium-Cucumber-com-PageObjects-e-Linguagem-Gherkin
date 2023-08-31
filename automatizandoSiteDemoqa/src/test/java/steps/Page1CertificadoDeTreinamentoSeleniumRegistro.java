package steps;

import driver.Drivers;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;
import utilits.MassaDados;

public class Page1CertificadoDeTreinamentoSeleniumRegistro extends Drivers {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MassaDados mD = new MassaDados();

	@Given("abrir o site clicar em join e clicar go to registration")
	public void abrir_o_site_clicar_em_join_e_clicar_go_to_registration() {

		Executa.abrirNavegador();
		metodos.clicar(el.CTS);
		metodos.voltarAba();
		metodos.clicar(el.fazerCadastro);
		metodos.pause(1000);
		metodos.scroll(-150);
	}

	@Given("informar First Name")
	public void informar_first_name() {
		
		metodos.escrever(el.firstName, mD.nome3);
		metodos.pause(1000);
	}

	@Given("informar Last Name")
	public void informar_last_name() {

		metodos.escrever(el.lastName, mD.Sobrenome3);
		metodos.pause(1000);

	}

	@Given("informar Email")
	public void informar_email() {

		metodos.escrever(el.email, mD.Email1);
		metodos.pause(1000);
	}

	@Given("informar Mobile")
	public void informar_mobile() {

		metodos.escrever(el.mobile, mD.numero2);
		metodos.pause(1000);
	}

	@Given("informar Country")
	public void informar_country() {

		metodos.escrever(el.country, mD.Country4);
		metodos.pause(1000);
	}

	@Given("informar City")
	public void informar_city() {

		metodos.escrever(el.city, mD.City4);
		metodos.pause(1000);
	}

	@Given("colocar uma Message")
	public void colocar_uma_message() {

		metodos.escrever(el.msg, mD.Msgs4);
		metodos.pause(1000);

	}

	@Given("colocar codigo")
	public void colocar_codigo() {
		
		// escrever manualmente
	}

	@When("terminar de prencher as informcoes")
	public void terminar_de_prencher_as_informcoes() {
		
		metodos.evidencia("formularioPreenchido");
	}

	@Then("estara apto a enviar")
	public void estara_apto_a_enviar() {
		
		metodos.fecharNavegador();
	}
	
	//Scenarios Negativos
	
	@Given("nao preeencher nenhum campo")
	public void nao_preeencher_nenhum_campo() {
	    
		metodos.pause(1000);
		metodos.evidencia("CampoVazio");
		metodos.pause(1000);
	}

	@When("clicar em send")
	public void clicar_em_send() {
	   
		metodos.clicar(el.btnSend);
		metodos.pause(1000);
		
	}

	@Then("aparecera uma msg no campo que falta preencher")
	public void aparecera_uma_msg_no_campo_que_falta_preencher() {
	    
		metodos.evidencia("MensagemPreenchaEsteCampo");
		metodos.fecharNavegador();
		
	}
	@Given("nao preeencher o campo com dado invalido")
	public void nao_preeencher_o_campo_com_dado_invalido() {
		
	    metodos.escrever(el.firstName, mD.numero3);
	}

	@Then("aparecera uma msg advertindo")
	public void aparecera_uma_msg_advertindo() {
	   
		metodos.evidencia("MensagemDeAdvertencia");
		metodos.fecharNavegador();
	}


}