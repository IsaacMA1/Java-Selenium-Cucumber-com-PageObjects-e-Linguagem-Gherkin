@tag
Feature: botao SeleniumTraining
  como usuario que clicar no botao SeleniumTraining e ir para pagina SeleniumTraining para saber sobre o treinamento


Background: dado que o usuario esteja na tela de SeleniumTraining e clicar no botao SeleniumTraining
  Given abrir o site clicar em join e clicar no SeleniumTraining

  @page1TestPositivo3
  Scenario: SeleniumTraining
  
    When clicar no botao SeleniumTraining na parte superior do site
    Then o usuario sera redirecionado para pagina SeleniumTraining

