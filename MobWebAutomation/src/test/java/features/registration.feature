Feature: Registration of new member registration of new user with valid credentials

  Scenario: Registration with valid credentials
    Given Navigate to beta.misli.az
    When Press on Qeydiyyat button
    And Enter name and surname
    And Enter birth date and e-mail
    And Enter password and phone number
    And Accept users agreement
    Then Press Qeydiyyatdan kechin button
    And Check entered mobile number
    Then Press Gonder button
    And Enter OTP code
    And Press ENTER button
    Then Check result
