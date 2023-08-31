@tag
Feature: @tag
	Feature: botao tutorials
  como usuario que clicar no botao tutorials abrir o menu para acessar o conteudo disponivel e ao clicar ser direcionado para a pagina do conteudo

 	Background: dado que o usuario esteja na tela de SeleniumTraining e clicar em tutorials
  Given abrir o site clicar em join e clicar no botao tutorials

 @page1TestPositivo6
  Scenario: botao tutorials
  
  	When clicar no botao tutorials na parte superior do site
    Then o usuario abrira um menu com opcoes de tutoriais
 
 @page1TestPositivo6
  Scenario: qa practies
  
  	When clicar no botao tutorials na parte superior do site
  	And clicar em qa practies
  	And clicar em software testing
    Then o usuario sera redirecionado para o tutorial sobre software testing

 @page1TestPositivo6
  Scenario: back-end testing automation
  
  	When clicar no botao tutorials na parte superior do site
  	And clicar em back-end testing automation
  	And clicar em rest assured
    Then o usuario sera redirecionado para o tutorial sobre rest assured