@userTest
Feature: Testes de usuarios validos e invalidos

  @teste
  Scenario Outline: Criacao do <cenario>
    Given que tenho os dados do usuario para cadastro:
      | id         | <id>         |
      | username   | <username>   |
      | firstName  | <firstName>  |
      | lastName   | <lastName>   |
      | email      | <email>      |
      | password   | <password>   |
      | phone      | <phone>      |
      | userStatus | <userStatus> |
    When que faco a requisicao com o metodo POST de um usuario "valido"
    Then verifico se esta retornando 200 na requisicao da API
    Examples:
      | cenario        | id   | username      | firstName | lastName | email                | password | phone     | userStatus |
      | usuario valido | 3030 | lucaasemanueel | Lucaas    | Emanueel | lucas.test@email.com | 1234     | 020200202 | 9090       |

  @usuarioinvalido
  Scenario Outline: Criacao do <cenario>
    Given que tenho os dados do usuario para cadastro invalido:
      | id     | <id>        |
      | usern  | <username>  |
      | firstN | <firstName> |
    When que faco a requisicao com o metodo POST de um usuario "invalido"
    Then verifico se esta retornando 400 na requisicao da API
    Examples:
      | cenario          | id   | username | firstName |
      | usuario invalido | 3030 | teste    | Lucaas    |

    @teste
   Scenario Outline: Atualizar um usuario ja cadastrado
      Given que tenho os dados do usuario para cadastro:
        | id         | <id>         |
        | username   | <username>   |
        | firstName  | <firstName>  |
        | lastName   | <lastName>   |
        | email      | <email>      |
        | password   | <password>   |
        | phone      | <phone>      |
        | userStatus | <userStatus> |
      When faco a requisicao com o metodo PUT de um usuario
      Then verifico se esta retornando 200 na requisicao da API
      Examples:
        | cenario        | id   | username      | firstName  | lastName      | email                | password | phone     | userStatus |
        | usuario valido | 3030 | lucaasEditado | lucasTESTE | EmanueelTESTE | lucas.test@email.com | 1234     | 020200202 | 9090       |


