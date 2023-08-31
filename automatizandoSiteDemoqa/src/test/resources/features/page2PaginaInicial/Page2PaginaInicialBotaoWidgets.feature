@tag
	Feature: pagina widgets
  como usuario que clicar no botao widgets para acessar pagina de widgets

 	Background: dado que o usuario esteja na tela inicial e clicar no botao de widgets
  Given abrir o site clicar em widgets    

 @page2TestPositivo2
 Scenario: clicar em slider na pagina de widgets e manipular o elemento da pagina para mais
  
    And clicar no botao slider
		When clicar no elemento
    Then o usuario vera o elemento se movimento para cima
    
 @page2TestPositivo2
 Scenario: clicar em widgets na pagina de widgets para fechar a coluna de widgets
  
		When clicar em widgets
    Then a coluna vai se fechar
    
 