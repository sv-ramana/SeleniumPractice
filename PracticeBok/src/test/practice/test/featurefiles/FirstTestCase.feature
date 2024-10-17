@regression
Feature: Just Login FOr demo

  Background:
    Given User able to see the app

  @validCred
  Scenario: LoginWith Valid Credentials
    Given Username and password as credentials
    |venkat|
    |venky|
    When user click on the login button
    Then user able to login the successfully
  @InvalidCred
  Scenario: LoginWith UnValid Credentials
    Given Username and password as credentials
    |ramana|
      |rao|
    When user click on the login button
    Then user unable to login should through an error

@justscanrio
  Scenario Outline: LoginWith Invalid Credentials
    Given login Username <uname> and <pass> password as credentials
    When user click on the login button
    Then user unable to login should through an error
    Examples:
      | uname | pass|
      |"raama" | "krishna"|
      |"venkat" | "venky"|
