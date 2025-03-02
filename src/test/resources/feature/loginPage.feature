Feature: Login feature

Background:
  Given Open site app

  Scenario: Successful login with valid login and password
    Given Login and Password
    When Click Login
    Then User is login to application

  Scenario Outline: Unsuccessful login with invalid login or password
    Given Login "<login>" and Password "<password>"
    When Click Login
    Then User got error message
    Examples:
      | login | password |
      | locked_out_user | secret_sauce|
