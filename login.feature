Feature: As a user I can able to login successfully
  Scenario:  I should be able to login with valid credential
    #noinspection CucumberUndefinedStep
    Given as a user when i am on login page
    When I input user name as tejal260
    And I input password as TP1234
    And i Click on login button
    Then I should be able to logged into account successfully

  Scenario:  I should be not able to login with invalid credential
    #noinspection CucumberUndefinedStep
    Given as a user when i am on login page // wrong username
    When I input user name as Tejal26
    And I input password as TP1234
    And i Click on login button
    Then I should  not be able to logged into account successfully
    And I should see error message "wrong username or password entered"

  Scenario:  I should be not able to login with invalid credential
    #noinspection CucumberUndefinedStep
    Given as a user when i am on login page
    When I input user name as tejal260
    And I input password as TP2346   // wrong password
    And i Click on login button
    Then I should not be able to logged into account successfully
    And I should see error message "wrong username or password entered"

  Scenario:  I should be not able to login with invalid credential
    #noinspection CucumberUndefinedStep
    Given as a user when i am on login page
    When I input user name as Tejal85   // wrong password and username
    And I input password as Tp8978
    And i Click on login button
    Then I should not be able to logged into account successfully
    And I should see error message "wrong username or password entered"

  Scenario:  I should be not able to login with invalid credential
    #noinspection CucumberUndefinedStep
    Given as a user when i am on login page
    When I do not put user name     // blank username
    And I input password as TP1234
    And i Click on login button
    Then I should  not be able to logged into account successfully
    And I should see error message "wrong username or password entered"

  Scenario:  I should be not able to login with invalid credential
    #noinspection CucumberUndefinedStep
    Given as a user when i am on login page
    When I input user name as tejal260
    And I do not put password   // blank password
    And i Click on login button
    Then I should be able to logged into account successfully
    And I should see error message "wrong username or password entered"