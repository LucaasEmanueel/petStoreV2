@userTest @all
Feature: Testes de validação do USUARIOS

  Scenario Outline: Criacao do <cenario>
    Given que tenho os dados do usuario:
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

  Scenario Outline: Criacao do <cenario>
    Given que tenho os dados do usuario para cadastro invalido:
      | id     | <id>        |
      | usern  | <username>  |
      | firstN | <firstName> |
    When que faco a requisicao com o metodo POST de um usuario "invalido"
    Then verifico se esta retornando 500 na requisicao da API
    Examples:
      | cenario          | id  | username    | firstName    |
      | usuario invalido | abc | testeFailed | LucaasFailed |

  Scenario Outline: Atualizar um usuario ja cadastrado
      Given que tenho os dados do usuario:
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

     Scenario Outline: logando usuario valido
       Given que tenho os dados do usuario:
         | username | <username> |
         | password | <password> |
       When faco uma requisicao com o metodo GET para um usuario
       Then verifico se esta retornando 200 na requisicao da API

       Examples:
         | username      | password |
         | lucaasEditado | 1234     |

      Scenario: deletando usuario existente
        When faco uma requisicao com o metodo DELETE para um usuario
        Then verifico se esta retornando 200 na requisicao da API
