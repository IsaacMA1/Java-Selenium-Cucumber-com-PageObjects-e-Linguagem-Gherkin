
@tag
Feature: registro
  como usuario
  quero saber como funciona o treinamento
  para poder faze-lo

 Background: dado que o usuario esteja na tela de registro
 Given abrir o site clicar em join e clicar go to registration
 
 @page1TestPositivo
 Scenario: prencher com informacoes validas
 
 And informar First Name
 And informar Last Name
 And informar Email
 And informar Mobile
 And informar Country
 And informar City
 And colocar uma Message
 And colocar codigo
 When terminar de prencher as informcoes 
 Then estara apto a enviar

@pag1TestNegativo
 Scenario: dados em branco
  
 But nao preeencher nenhum campo
 When clicar em send 
 Then aparecera uma msg no campo que falta preencher
 
@pag1TestNegativo
 Scenario: dados em validos
  
 But nao preeencher o campo com dado invalido
 When clicar em send 
 Then aparecera uma msg advertindo

  