Feature: As a user I can able to login successfully.

  Scenario : User should able to login with valid credential.
    Given user is on login page.
    When user type user name as "Daniel smith"
    And user type password as "Da@123"
    And user click on login button
    Then user should able to log in
    And message should display welcome message

  Scenario : User should  not able to login with valid credential.
    Given user is on login page.
    When user type user name as "daniel smith"
    And user type password as "Da@123"
    And user click on login button
    Then user should  not to able to log in
    And message should display "please input valid username or password"

  Scenario : User should  not able to login with invalid credential.
    Given user is on login page.
    When user type user name as "Daniel smith"
    And user type password as "Da?123"
    And user click on login button
    Then user should able not to able to log in
    And message should display "please input valid username or password"

  Scenario : User should  not able to login with invalid credential.
    Given user is on login page.
    When user type user name as "daniel Smith"
    And user type password as "DA?123"
    And user click on login button
    Then user should not to able to log in
    And message should display "please input valid username or password"

  Scenario : User should  not able to login with invalid credential.
    Given user is on login page.
    When user type user name as "daniel smith"
    And user type password as "Da@123"
    And user click on login button
    Then user should not to able to log in
    And message should display "please input valid username or password"

  Scenario : User should  not able to login with invalid credential.
    Given user is on login page.
    When user do not input username
    And user type password as "Da@123"
    And user click on login button
    Then user should  not to able to log in
    And message should display "please input valid username or password"

  Scenario : User should  not able to login with invalid credential.
    Given user is on login page.
    When user type user name as "Daniel smith"
    And user do not input password.
    And user click on login button
    Then user should  not to able to log in
    And message should display "please input valid username or password"

  Scenario : User should  not able to login with invalid credential.
    Given user is on login page.
    When user do not input user name.
    And user do not in put password.
    And user click on login button
    Then user should  not to able to log in
    And message should display "please input valid username or password"