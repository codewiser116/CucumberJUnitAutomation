@regression @smoke
Feature: all tests related to Announcements page

  @verifyNumberOfAnnouncements
  Scenario: Verify the number of announcements per one page is displayed correctly.
    Given user is on login page
    When user enters correct email
    And user enters correct password
    And user clicks on login button
    Then user navigates to announcements tab
    Then verify in announcements page user changes the number of results per page to
      | 1  |
      | 20 |
      | 5  |
      | 8  |
      | 10 |

