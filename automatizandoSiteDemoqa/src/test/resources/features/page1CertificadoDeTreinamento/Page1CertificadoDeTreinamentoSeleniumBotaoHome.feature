	@tag
	Feature: botao home
  como usuario que clicar no botao home e ir para pagina home para ver o que tem a pagina

 	Background: dado que o usuario esteja na tela de SeleniumTraining e clicar no botao home
  Given abrir o site clicar em join e clicar no botao home

  @page1TestPositivo2
  Scenario: botao home
  
    When clicar no botao home na parte superior do site
    Then o usuario sera redirecionado para pagina home
    
 	@page1TestPositivo2
  Scenario: pagina home botao Enroll Yourself 
  
 		And clicar no botao home 
    When clicar no botao Enroll Yourself 
    Then o usuario sera redirecionado para pagina Selenium Certification Training no campo de registrar
    
    @page1TestPositivo2
  	Scenario: pagina home botao ReadMore
  
 		And clicar no botao home 
    When clicar no botao ReadMore
    Then o usuario sera redirecionado para pagina Selenium Certification Training 
    
    @page1TestPositivo2
  	Scenario: pagina home clicar em alguma tecnologia 
  
 		And clicar no botao home 
    When clicar no botao onde tera alguma tecnologias disponiveis
    Then o usuario sera redirecionado para pagina daquela tecnologia especifica com mais informacoes
     
    @page1TestPositivo2
  	Scenario: pagina home clicar em algum conteudo no campo de articles
  
 		And clicar no botao home 
    When clicar em alguns dos artigos disponiveis 
    Then o usuario sera redirecionado para pagina daquele artigo
    
    @page1TestPositivo2
  	Scenario: pagina home rolar ate o final e clicar  em algum conteudo no campo de site links
  
 		And clicar no botao home 
 		And rolar ate o final da pagina
    When clicar em Team no campo de site links
    Then o usuario sera redirecionado para pagina onde precisara do login do linkedin
    
    @page1TestPositivo2
  	Scenario: pagina home rolar ate o final e clicar  em alguma rede social no campo de find us
  
 		And clicar no botao home 
 		And rolar ate o final da pagina
    When clicar em Twitter no campo de find us
    Then o usuario sera redirecionado para pagina do Twitter onde precisara estar logado para ter acesso as informacoes
    
    