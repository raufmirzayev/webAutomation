Feature: Login

@correct
  Scenario: Login with correct credentials
    Given Open https://beta.misli.com in Chrome browser
    And Click on Daxil Ol button
    When Enter correct phoneNumber and email
    And Click on login button
    Then Check result

@incorrect
  Scenario: Login with incorrect
    Given Open https://beta.misli.com in Chrome browser
    And Click on Daxil Ol button
    When Enter incorrect phoneNumber and email
    And Click on login button
    Then Check result1
