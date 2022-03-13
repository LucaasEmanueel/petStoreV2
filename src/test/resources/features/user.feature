@userTest
Feature: Cadastro do usuario

 Scenario: Criacao do usuario
    Given que tenho os dados do usuario para cadastro
    When que faco a requisicao com o metodo POST
    Then verifico se esta retornando 200 na requisicao da API