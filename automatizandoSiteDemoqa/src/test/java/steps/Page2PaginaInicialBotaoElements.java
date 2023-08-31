package steps;

import java.awt.AWTException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;
import utilits.MassaDados;

public class Page2PaginaInicialBotaoElements {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MassaDados mD = new MassaDados();

	@Given("abrir o site clicar em elements")
	public void abrir_o_site_clicar_em_elements() {

		Executa.abrirNavegador();
		metodos.pause(1000);
		metodos.scroll(400);
		metodos.clicar(el.btnElements);
		metodos.pause(1000);

	}

	@When("clicar no botao elements")
	public void clicar_no_botao_elements() {

		metodos.currentUrl("https://demoqa.com/elements");
		metodos.pause(1000);
	}

	@Then("o usuario sera redirecionado para de elements")
	public void o_usuario_sera_redirecionado_para_de_elements() {

		metodos.evidencia("PaginaDeElementos");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@When("clicar em text box")
	public void clicar_em_text_box() {

		metodos.clicar(el.btnTextBox);
		metodos.scroll(300);
		metodos.pause(1000);

	}

	@When("digitar nome completo")
	public void digitar_nome_completo() {

		metodos.escrever(el.btnUserName, mD.nome3 + mD.Sobrenome4);
		metodos.pause(1000);
	}

	@When("digitar email")
	public void digitar_email() {

		metodos.escrever(el.btnUserEmail, mD.Email2);
		metodos.pause(1000);
	}

	@When("digitar Current Address")
	public void digitar_current_address() {

		metodos.escrever(el.btnCurrentAddress, mD.Country2 + mD.City2);
		metodos.pause(1000);
	}

	@When("digitar Permanent Address")
	public void digitar_permanent_address() {

		metodos.escrever(el.btnPermanentAddress, mD.Country3 + mD.City3);
		metodos.scroll(100);
		metodos.pause(1000);
	}

	@Then("ao clicar em submit o usuario vera os valores digitados em um campo abaixo")
	public void ao_clicar_em_submit_o_usuario_vera_os_valores_digitados_em_um_campo_abaixo() {

		metodos.clicar(el.btnSubmit);
		metodos.pause(1000);
		metodos.scroll(350);
		metodos.pause(1000);
		metodos.evidencia("PaginaElementsCampoTextBoxPreenchido");
		metodos.fecharNavegador();
	}

	@Given("digitar apenas uma letra no nome completo")
	public void digitar_apenas_uma_letra_no_nome_completo() {

		metodos.clicar(el.btnTextBox);
		metodos.scroll(300);
		metodos.pause(1000);
		metodos.escrever(el.btnUserName, "A");
		metodos.pause(1000);
	}

	@Given("nao digitar nada nos outros campos")
	public void nao_digitar_nada_nos_outros_campos() {

		metodos.currentUrl("https://demoqa.com/text-box");
		metodos.pause(1000);
	}

	@When("clicar submit")
	public void clicar_submit() {

		metodos.clicar(el.btnSubmit);
		metodos.pause(1000);

	}

	@Then("o usuario so tera uma letra que foi digitada no nome")
	public void o_usuario_so_tera_uma_letra_que_foi_digitada_no_nome() {

		metodos.scroll(350);
		metodos.pause(1000);
		metodos.evidencia("PaginaElementsCampoTextBoxPreenchidoComUmaLetra");
		metodos.fecharNavegador();
	}

	@When("clicar em check box")
	public void clicar_em_check_box() {

		metodos.clicar(el.btnChecktBox);
		metodos.pause(1000);
		metodos.currentUrl("https://demoqa.com/checkbox");
	}

	@Then("ao clicar home aparecera uma mensagem dizendo que o usuario selecionou home com algumas informacoes adicionais")
	public void ao_clicar_home_aparecera_uma_mensagem_dizendo_que_o_usuario_selecionou_home_com_algumas_informacoes_adicionais() {

		metodos.clicar(el.btnPastaHome);
		metodos.pause(1000);
		metodos.evidencia("PaginaElementsCampoCheckBoxClicandoNaPastaHome");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@Then("ao clicar + aparecera uma serie de informacoes")
	public void ao_clicar_aparecera_uma_serie_de_informacoes() {

		metodos.clicar(el.btnSetaMais);
		metodos.pause(1000);
		metodos.scroll(200);
		metodos.evidencia("PaginaElementsCampoCheckBoxClicandoNaSetaDeMais");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@When("clicar em radion button")
	public void clicar_em_radion_button() {

		metodos.scroll(200);
		metodos.clicar(el.btnRadionButton);
		metodos.pause(1000);
	}

	@When("aparecera uma pergunta dizendo se voce gosta do site")
	public void aparecera_uma_pergunta_dizendo_se_voce_gosta_do_site() {

		metodos.currentUrl("https://demoqa.com/radio-button");
		metodos.pause(1000);
	}

	@Then("o usuario quando clicar em yes aparece a mensagem dizendo que ele escolheu yes")
	public void o_usuario_quando_clicar_em_yes_aparece_a_mensagem_dizendo_que_ele_escolheu_yes() {

		metodos.clicar(el.btnYesRadion);
		metodos.pause(1000);
		metodos.evidencia("PaginaElementsCampoRadionButtonClicandoNoButtonYes");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@Given("clicar web tables")
	public void clicar_web_tables() {

		metodos.scroll(200);
		metodos.clicar(el.btnWebTable);
		metodos.pause(1000);
		metodos.currentUrl("https://demoqa.com/webtables");
		metodos.scroll(100);
		metodos.evidencia("PaginaElementsWebTablesFormulariosJaExistentes");
	}

	@Given("clicar add")
	public void clicar_add() {

		metodos.clicar(el.btnAdd);
		metodos.pause(1000);
	}

	@When("aparecer o formulario")
	public void aparecer_o_formulario() {

		// Formulario vazio
		metodos.evidencia("PaginaElementsWebTablesResultadoAoClicarEmAdd");
	}

	@When("adicionar First Name")
	public void adicionar_first_name() {

		metodos.escrever(el.btnFormularioWebTableFirstName, mD.nome2);
		metodos.pause(1000);

	}

	@When("adicionar Last Name")
	public void adicionar_last_name() {

		metodos.escrever(el.btnFormularioWebTableLastName, mD.Sobrenome3);
		metodos.pause(1000);
	}

	@When("adicionar email")
	public void adicionar_email() {

		metodos.escrever(el.btnFormularioWebTableEmail, mD.Email2);
		metodos.pause(1000);

	}

	@When("adicionar age")
	public void adicionar_age() {

		metodos.escrever(el.btnFormularioWebTableFAge, mD.age2);
		metodos.pause(1000);
	}

	@When("adicionar salary")
	public void adicionar_salary() {

		metodos.escrever(el.btnFormularioWebTableSalary, mD.salary1);
		metodos.pause(1000);
	}

	@When("adicionar department")
	public void adicionar_department() {

		metodos.escrever(el.btnFormularioWebDepartment, mD.department4);
		metodos.pause(1000);
	}

	@Then("o usuario quando clicar em submit os dados seram salvos")
	public void o_usuario_quando_clicar_em_submit_os_dados_seram_salvos() {

		metodos.scroll(200);
		metodos.clicar(el.btnFormularioWebSubmit);
		metodos.pause(1000);
	}

	@Then("aparecera um novo campo com os dados adicionados")
	public void aparecera_um_novo_campo_com_os_dados_adicionados() {

		metodos.evidencia("PaginaElementsWebTablesFormularioAdicionado");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@When("nao adicionar letras Last Name")
	public void nao_adicionar_letras_last_name() {

		metodos.escrever(el.btnFormularioWebTableLastName, mD.numero3);
		metodos.pause(1000);
	}

	@When("nao adicionar numeros no salary")
	public void nao_adicionar_numeros_no_salary() {

		metodos.escrever(el.btnFormularioWebTableSalary, mD.department2);
		metodos.pause(1000);
	}

	@Then("o usuario quando clicar em submit os campos errados ficaram vermelhos")
	public void o_usuario_quando_clicar_em_submit_os_campos_errados_ficaram_vermelhos() {

		metodos.clicar(el.btnFormularioWebSubmit);
		metodos.evidencia("PaginaElementsWebTablesFormularioAdicionadoComDadosInvalidos");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@Given("clicar no campo de pesquisa")
	public void clicar_no_campo_de_pesquisa() {

		metodos.scroll(200);
		metodos.clicar(el.btnWebTable);
		metodos.pause(1000);
		metodos.currentUrl("https://demoqa.com/webtables");
		metodos.scroll(100);
		metodos.clicar(el.btnFormularioWebCampoDePesquisa);
		metodos.pause(1000);
	}

	@When("digitar uma letra ou numero que corresponda na lista")
	public void digitar_uma_letra_ou_numero_que_corresponda_na_lista() {

		metodos.escrever(el.btnFormularioWebCampoDePesquisa, "29");
		metodos.pause(1000);
	}

	@Then("o usuario vera os dados sendo correspondido com a pesquisa")
	public void o_usuario_vera_os_dados_sendo_correspondido_com_a_pesquisa() {

		metodos.evidencia("PaginaElementsWebTablesCampoDePesquisaComResultadoCorrespondente");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@Given("nao digitar uma letra ou numero que nao corresponda na lista")
	public void nao_digitar_uma_letra_ou_numero_que_nao_corresponda_na_lista() {

		metodos.escrever(el.btnFormularioWebCampoDePesquisa, "@@");
		metodos.pause(1000);
	}

	@When("o usuario terminar de digitar")
	public void o_usuario_terminar_de_digitar() {

		System.out.println("Terminei de Digitar....");
		metodos.pause(1000);
	}

	@Then("o usuario vera nao vera nenhum dado sendo correspondido com a pesquisa")
	public void o_usuario_vera_nao_vera_nenhum_dado_sendo_correspondido_com_a_pesquisa() {

		metodos.evidencia("PaginaElementsWebTablesCampoDePesquisaComDadosInvalidos");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@When("o usuario clicar no desenho de lixeira no campo de action")
	public void o_usuario_clicar_no_desenho_de_lixeira() {

		metodos.scroll(200);
		metodos.clicar(el.btnWebTable);
		metodos.pause(1000);
		metodos.currentUrl("https://demoqa.com/webtables");
		metodos.scroll(100);
		metodos.evidencia("PaginaElementsWebTablesTodosOsItens");
		metodos.clicar(el.btnFormularioWebTableRemoverItem);
		metodos.pause(1000);
	}

	@Then("o item sera removido")
	public void o_item_sera_removido() {

		metodos.evidencia("PaginaElementsWebTablesRemovendoItem");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@When("o usuario clicar no desenho de lapiz no campo de action")
	public void o_usuario_clicar_no_desenho_de_lapiz() {

		metodos.scroll(200);
		metodos.clicar(el.btnWebTable);
		metodos.pause(1000);
		metodos.currentUrl("https://demoqa.com/webtables");
		metodos.scroll(100);
		metodos.clicar(el.btnFormularioWebTableEditarItem);
		metodos.pause(1000);
	}

	@Then("aparecera um campo para editar as informacoes")
	public void aparecera_um_campo_para_editar_as_informacoes() {

		metodos.evidencia("PaginaElementsWebTablesClicandoEmEditarUmItem");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@When("o usuario clicar no campo de double click me")
	public void o_usuario_clicar_no_campo_de_double_click_me() throws AWTException {

		metodos.scroll(200);
		metodos.clicar(el.btnButtons);
		metodos.pause(1000);
		metodos.scroll(200);
		metodos.mouseDoubleClick(el.btnDoubleClick);
	}

	@Then("aparecera uma mensagem confirmando o double click")
	public void aparecera_uma_mensagem_confirmando_o_double_click() {

		metodos.evidencia("PaginaElementsCampoButtonsDoubleClick");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@When("o usuario clicar no campo de right click me")
	public void o_usuario_clicar_no_campo_de_right_click_me() throws AWTException {

		metodos.scroll(200);
		metodos.clicar(el.btnButtons);
		metodos.pause(1000);
		metodos.scroll(200);
		metodos.mouseClickDireito(el.btnButtonsClickRight);
	}

	@Then("aparecera uma mensagem confirmando o right click")
	public void aparecera_uma_mensagem_confirmando_o_right_click() {

		metodos.evidencia("PaginaElementsCampoButtonsRightClick");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}

	@When("o usuario clicar no campo selecionar arquivo")
	public void o_usuario_clicar_no_campo_selecionar_arquivo() throws AWTException {

		metodos.scroll(500);
		metodos.clicar(el.btnUploadAndDownload);
		metodos.pause(1000);
		metodos.scroll(200);
		metodos.evidencia("PaginaElementsCampoUploadAndDownloadAntesDeEnviarOArquivo");
		metodos.clicar(el.btnUploadArquivo);
		metodos.pause(1000);

	}

	@Then("o arquivo sera carregado")
	public void o_arquivo_sera_carregado() throws AWTException {

		metodos.uploadArquivo("ArquivoCarregado");
		metodos.pause(1000);
		metodos.evidencia("PaginaElementsCampoUploadAndDownloadDepoisDeEnviarOArquivo");
		metodos.pause(1000);
		metodos.fecharNavegador();

	}

}
