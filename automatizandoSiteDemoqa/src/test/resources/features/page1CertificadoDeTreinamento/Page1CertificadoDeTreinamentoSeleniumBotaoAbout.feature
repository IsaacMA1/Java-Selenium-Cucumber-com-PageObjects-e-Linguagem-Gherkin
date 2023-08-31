Feature: @tag
	Feature: botao About
  como usuario que clicar no About site e ir para pagina About para acessar o conteudo da pagina

 	Background: dado que o usuario esteja na tela de SeleniumTraining e clicar no About
  Given abrir o site clicar em join e clicar no botao About

 @page1TestPositivo5
  Scenario: botao About
  
    When clicar no botao About site na parte superior do site
    Then o usuario sera redirecionado a pagina home


  
