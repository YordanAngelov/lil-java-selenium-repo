Feature: Testing the Internet... all of it!

  Location of the Internet: https://the-internet.herokuapp.com/

  Scenario: Successfully logging into the Internet
    Given I navigate to the Internet
    When I go to Form Authentication
    And I authenticate myself
    Then I will be logged in

  Scenario: Logging into the Internet with an invalid password
    Given I navigate to the Internet
    When I go to Form Authentication
    And I fail to authenticate myself due to invalid password
    Then I will not be logged in because of invalid password

  Scenario: Logging into the Internet with an invalid username
    Given I navigate to the Internet
    When I go to Form Authentication
    And I fail to authenticate myself due to invalid username
    Then I will not be logged in because of invalid username