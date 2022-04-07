@petTest
  Feature: Testes de validação de acesso ao pet

    Scenario: Adicionar um novo pet na loja
      Given que tenho os dados do usuario "fulado"
      When que faco a requisicao com o metodo POST no store do pet
      Then verifico se esta retornando 200 na requisicao da API