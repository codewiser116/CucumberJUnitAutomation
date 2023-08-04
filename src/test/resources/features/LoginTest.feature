@allLoginTests
Feature: This file covers all login test scenarios

  @login1
  Scenario: User with the right credentials must be able to login
    Given user is on login page
    When user enters email "sakydin.tashmurzaev.kk@gmail.com"
    And user enters password "CodeWise2023!"
    Then user clicks on login button
    Then user must be logged in

  @login2
  Scenario: encrypted password alternative
    Given user is on login page
    When user enters correct email
    And user enters correct password
    Then user clicks on login button
    Then user must be logged in




