Feature: Test Automation Rest Api

  @api
  Scenario: Login with valid username and password
    Given user is on login page
    When user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    Then user will redirect to homepage

  @api
  Scenario: Login with invalid username and password
    Given user is on login page
    When user input username with "user_lain"
    And user input password with "coba_coba"
    And user click login button
    Then A message appears "Username and password do not match any user in this service"

  @api
  Scenario: Login with empty password
    Given user is on login page
    When user input username with "standard_user"
    And user input password with ""
    And user click login button
    Then A message appears "Password is required"

  @api
  Scenario: Test get list data normal
    Given prepare url valid for "GET_LIST_USERS"
    And hit api get list users
    Then validation status code is equals 200
    Then validation response body get list users
    Then validation response json with JSONSchema "get_list_users_normal.json"

  @api
  Scenario: Test create new user normal
    Given prepare url valid for "CREATE_NEW_USERS"
    And hit api post create new user
    Then validation status code is equals 201
    Then validation response body create new user
    Then validation response json with JSONSchema "create_users_normal.json"

  @api
  Scenario: Test delete user normal
    Given prepare url valid for "GET_LIST_USERS"
    And hit api get list users
    And validation response body get list users
    Given prepare url valid for "DELETE_USERS"
    And hit api delete
    Then validation status code is equals 204