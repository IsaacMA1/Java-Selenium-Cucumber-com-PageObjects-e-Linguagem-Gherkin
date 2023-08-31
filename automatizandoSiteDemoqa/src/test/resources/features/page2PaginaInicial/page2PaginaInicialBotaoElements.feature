	@tag
	Feature: pagina elements
  como usuario que clicar no botao elements para acessar pagina de elements

 	Background: dado que o usuario esteja na tela inicial e clicar no botao de elements
  Given abrir o site clicar em elements

  @page2TestPositivo1
  Scenario: clicar em elements na pagina inicial
  
    When clicar no botao elements
    Then o usuario sera redirecionado para de elements
    

  @page2TestPositivo1
  Scenario: clicar em text box na pagina de elementos e digitar dados 
  	
    When clicar em text box
    And digitar nome completo 
    And digitar email 
    And digitar Current Address 
    And digitar Permanent Address
    Then ao clicar em submit o usuario vera os valores digitados em um campo abaixo
    
  @page2TestNegativo1
  Scenario: clicar em text box na pagina de elementos e digitar a penas uma letra em nomes
  	
  	And digitar apenas uma letra no nome completo
    But nao digitar nada nos outros campos
    When clicar submit
    Then o usuario so tera uma letra que foi digitada no nome
    
  @page2TestPositivo1
  Scenario: clicar em check box na pagina de elementos e clicar em home 
  
    When clicar em check box
    Then ao clicar home aparecera uma mensagem dizendo que o usuario selecionou home com algumas informacoes adicionais
    
  @page2TestPositivo1
  Scenario: clicar em check box na pagina de elementos e clicar na seta de +
  
    When clicar em check box
    Then ao clicar + aparecera uma serie de informacoes 
    
  @page2TestPositivo1
  Scenario: clicar em radion button na pagina de elementos e responder a pergunta com yes
  
    When clicar em radion button
    And aparecera uma pergunta dizendo se voce gosta do site 
    Then o usuario quando clicar em yes aparece a mensagem dizendo que ele escolheu yes
    
  @page2TestPositivo1
  Scenario: clicar em web tables na pagina de elementos e adicionar informacoes validas
  
    And clicar web tables
    And clicar add
    When aparecer o formulario
    And adicionar First Name
    And adicionar Last Name
    And adicionar email
    And adicionar age
    And adicionar salary
    And adicionar department
    Then o usuario quando clicar em submit os dados seram salvos
    And aparecera um novo campo com os dados adicionados
    
  @page2TestNegativo1
  Scenario: clicar em web tables na pagina de elementos e clicar em add para adicionar informacoes invalidas
  
    And clicar web tables
    And clicar add
    When aparecer o formulario
    And adicionar First Name
    But nao adicionar letras Last Name 
    And adicionar email
    And adicionar age
    But nao adicionar numeros no salary
    And adicionar department
    Then o usuario quando clicar em submit os campos errados ficaram vermelhos
     
  @page2TestPositivo1
  Scenario: clicar em web tables na pagina de elementos e clicar no campo de pesquisar digitando informacoes validas
  
    And clicar no campo de pesquisa
    When digitar uma letra ou numero que corresponda na lista
    Then o usuario vera os dados sendo correspondido com a pesquisa
    
  @page2TestNegativo1
  Scenario: clicar em web tables na pagina de elementos e clicar no campo de pesquisar digitando informacoes invalidas
  
    And clicar no campo de pesquisa
    But nao digitar uma letra ou numero que nao corresponda na lista
    When o usuario terminar de digitar
    Then o usuario vera nao vera nenhum dado sendo correspondido com a pesquisa
    
  @page2TestPositivo1
  Scenario: clicar em web tables na pagina de elementos e clicar no campo de action para remover um item
  
    When o usuario clicar no desenho de lixeira no campo de action
    Then o item sera removido
    
  @page2TestPositivo1
  Scenario: clicar em web tables na pagina de elementos e clicar no campo de action para editar um item
   
    When o usuario clicar no desenho de lapiz no campo de action
    Then aparecera um campo para editar as informacoes
    
  @page2TestPositivo1
  Scenario: clicar em buttons na pagina de elementos e clicar em double click me
   
    When o usuario clicar no campo de double click me
    Then aparecera uma mensagem confirmando o double click
    
  @page2TestPositivo1
  Scenario: clicar em buttons na pagina de elementos e clicar em right click me
   
    When o usuario clicar no campo de right click me
    Then aparecera uma mensagem confirmando o right click
    
   @page2TestPositivo1
   Scenario: clicar em upload or download na pagina de elementos 
   
    When o usuario clicar no campo selecionar arquivo
    Then o arquivo sera carregado
