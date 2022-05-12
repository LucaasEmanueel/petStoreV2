@petTest @all
  Feature: Testes de validação do PET

    Scenario: ADICIONAR um novo pet na loja
      Given que tenho os dados do usuario da pet
      When que faco a requisicao com o metodo "POST" no store do pet
      Then verifico se esta retornando 200 na requisicao da API

    Scenario: EDITAR um novo pet na loja
      Given que tenho novos dados do usuario da pet
      When que faco a requisicao com o metodo "PUT" no store do pet
      Then verifico se esta retornando 200 na requisicao da API

    Scenario: PROCURAR pet na loja por Status
      Given que escolho o status "sold" para pesquisa no store do pet
      When que faco a requisicao com o metodo "GET" no store do pet
      Then verifico se esta retornando 200 na requisicao da API

    Scenario: DELETAR um pet na loja
      Given que tenho os dados do usuario da pet
      When que faco a requisicao com o metodo "DELETE" no store do pet
      Then verifico se esta retornando 200 na requisicao da API