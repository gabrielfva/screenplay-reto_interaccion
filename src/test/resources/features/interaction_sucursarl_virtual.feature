Feature: interaction with a virtual branch
  As a web user
  I want to enter the virtual branch
  To get information about my saving account

  Scenario: try to enter to the virtual branch with wrong credentials
    Given that Gabriel wants to try to enter to the Bancolombia's virtual branch
    When he inserts the user <aliashh> and his numeric password
    Then he should see the message: <Usuario o clave inválida. Por favor intente de nuevo.>
