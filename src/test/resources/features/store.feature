@storeTest @all
Feature: Testes de validação da LOJA

  Scenario Outline: Realizando um pedido de um animal de estimacao
    Given que tenho os dados do usuario:
      | id       | <id>       |
      | petId    | <petId>    |
      | quantity | <quantity> |
      | shipDate | <shipDate> |
      | status   | <status>   |
      | complete | <complete> |
    When que faco a requisicao na store com o metodo POST
    When verifico se esta retornando 200 na requisicao da API

    Examples:
      | id | petId | quantity | shipDate   | status | complete |
      | 70 | 7020  | 1        | 2022-03-30 | placed | true     |

  Scenario: Localizar pedido de compra por id
    When faco uma requisicao com o metodo GET para o pedido que tem id 70
    Then verifico se esta retornando 200 na requisicao da API


  Scenario: Retornar um mapa com o status de quantidade de cada pet
    When faco uma requisicao com o metodo GET para todos os pedidos
    Then verifico se esta retornando 200 na requisicao da API

  Scenario: Deletando um pedido de um animal por id
      When faco uma requisicao na store com o metodo DELETE para o pedido que tem id 70
      Then verifico se esta retornando 200 na requisicao da API

  Scenario: Deletando um pedido de um animal que não existe
    When faco uma requisicao na store com o metodo DELETE para o pedido que tem id 71
    Then verifico se esta retornando 404 na requisicao da API
