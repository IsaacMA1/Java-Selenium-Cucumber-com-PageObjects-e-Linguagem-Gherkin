@tag
Feature: @tag
	Feature: botao demo site
  como usuario que clicar no botao demo site e ir para pagina demo site para acessar o conteudo da pagina

 	Background: dado que o usuario esteja na tela de SeleniumTraining e clicar no demo site
  Given abrir o site clicar em join e clicar no botao demo site

 @page1TestPositivo4
  Scenario: botao demo site
  
    When clicar no botao demo site na parte superior do site
    Then o usuario sera redirecionado para pagina demo site


 
