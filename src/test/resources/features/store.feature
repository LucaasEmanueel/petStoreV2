
Feature: Testes de validações de acesso da loja  do PetStore

  Scenario Outline: Faça um pedido para um animal de estimacao
    Given que tenho os dados do usuario:
      | id       | <id>       |
      | petId    | <petId>    |
      | quantity | <quantity> |
      | shipDate | <shipDate> |
      | status   | <status>   |
      | complete | <complete> |
    When que faco a requisicao com o metodo POST de um pet
    When verifico se esta retornando 200 na requisicao da API

    Examples:
      | id | petId | quantity | shipDate                 | status | complete |
      | 70 | 7020  | 1        | 2022-03-30T09:46:33.628Z | placed | true     |
  @PetStore
    Scenario: Deletando um pedido de um animal
      Given que tenho o orderId do pet
      When faco uma requisicao com o metodo DELETE para o pedido
      Then verifico se esta retornando 200 na requisicao da API
