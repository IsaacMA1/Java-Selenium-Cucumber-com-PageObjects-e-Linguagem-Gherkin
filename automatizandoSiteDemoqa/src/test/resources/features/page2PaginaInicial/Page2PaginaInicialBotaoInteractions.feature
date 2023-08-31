
@tag
	Feature: pagina  interactions
  como usuario que clicar no botao interactions para acessar pagina de interactions

 	Background: dado que o usuario esteja na tela inicial e clicar no botao de interactions
  Given abrir o site clicar em interactions    

  @page2TestPositivo3
  Scenario: clicar em sortebla  na pagina de interactions e clicar em grid e mover um elemento
  
  	And clicar em sortebla
		When clicar em grid 
    Then o usuario vai mover um objeto
    
  @page2TestPositivo3
  Scenario: clicar em Droppable  na pagina de interactions e clicar em simple e mover o elemento
  
  	And clicar em Droppable
  	And clicar em simple
		When clicar em drag me
    Then o usuario vai mover o objeto para Drop here
    
    