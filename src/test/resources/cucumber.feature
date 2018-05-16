Feature:  login fuctinality

  Scenario: homepage fuctionality
    Given  i me on home page
    When   i click on home page
    Then   i should navigate to home page

  Scenario Outline: register new user
    Given  I am on Loginpage
    When   I click on registerlink
    Then  I should navigate to Registerpage
    When  I select tital
    And  I enter firstname as "<Fname>"
    And  I enter lastname as "<Lname>"
    And  I enter email as "<email>"
    And  I enter password as "<password>"
    And  I enter confirm password as "<password>"
    And  I accept terms and codition
    And  I click on submit botton
    Then I should successfully creat account

    Examples:
      | Fname  | Lname    | email                       | password  |
      | vishal | ghinaiya | vishal_ghinaiya@hotmail.com | somnath09 |
