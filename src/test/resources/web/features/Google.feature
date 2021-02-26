Feature: Google search

  @Google
  Scenario: Busqueda exitosa
    Given el usuario se encuentra en la pantalla de Google
    When el usuario ingresa la palabra Consorcio
    Then el usuario visualiza la siguiente lista de palabras en un resultado
      | Consorcio    |
      | Wikipedia    |
      | enciclopedia |
      | libre        |

  @Google
  Scenario Outline: Busqueda exitosa de palabra: <palabra>
    Given el usuario se encuentra en la pantalla de Google
    When el usuario ingresa la palabra <palabra>
    Then el usuario encuentra el resultado entre la segunda opcion
    Examples:
      | palabra   |
      | Consorcio |
      | Crowdar   |