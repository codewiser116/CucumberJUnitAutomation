Feature: all tests related to students

  Background:
    Given user is on login page
    When user enters correct email
    And user enters correct password
    And user clicks on login button
    Then user navigates to students tab

    @verifyStudentCanBeCreated
  Scenario Outline: Verify admin can create and delete a student
    Then user clicks on add student button
    Then user adds student info "<first_name>", "<last_name>", "<phone_number>", "<email>", "<group>", "<study_format>"
    And user clicks on add button
    Then verify student with "<first_name>", "<last_name>", "<phone_number>", "<email>", "<group>", "<study_format>" was created
    Then user deletes student with "<email>"
    Then verify student with "<first_name>", "<last_name>", "<phone_number>", "<email>", "<group>", "<study_format>" was deleted
    Examples:
      | first_name | last_name | phone_number | email                  | group              | study_format |
      | Sarah      | Parker    | 312893123    | sarah.parker@gmail.com | Batch1687036529983 | ONLINE       |
      | John       | Park      | 312893112    | john@gmail.com         | Batch1687036529983 | OFFLINE      |
      | Benazir    | Baialieva | 312875424    | bena@gmail.com         | Batch1687036529983 | ONLINE       |
      | Aizada     | Alba      | 112423423    | aizada@gmail.com       | Batch1687036529983 | ONLINE       |
      | Sarah      | Parker    | 312893123    | sarah.parker@gmail.com | Batch1687036529983 | ONLINE       |
      | John       | Park      | 312893112    | john@gmail.com         | Batch1687036529983 | OFFLINE      |
      | Benazir    | Baialieva | 312875424    | bena@gmail.com         | Batch1687036529983 | ONLINE       |
      | Aizada     | Alba      | 112423423    | aizada@gmail.com       | Batch1687036529983 | ONLINE       |
      | Sarah      | Parker    | 312893123    | sarah.parker@gmail.com | Batch1687036529983 | ONLINE       |
      | John       | Park      | 312893112    | john@gmail.com         | Batch1687036529983 | OFFLINE      |
      | Benazir    | Baialieva | 312875424    | bena@gmail.com         | Batch1687036529983 | ONLINE       |
      | Aizada     | Alba      | 112423423    | aizada@gmail.com       | Batch1687036529983 | ONLINE       |
      | Sarah      | Parker    | 312893123    | sarah.parker@gmail.com | Batch1687036529983 | ONLINE       |
      | John       | Park      | 312893112    | john@gmail.com         | Batch1687036529983 | OFFLINE      |
      | Benazir    | Baialieva | 312875424    | bena@gmail.com         | Batch1687036529983 | ONLINE       |
      | Aizada     | Alba      | 112423423    | aizada@gmail.com       | Batch1687036529983 | ONLINE       |
      | Sarah      | Parker    | 312893123    | sarah.parker@gmail.com | Batch1687036529983 | ONLINE       |
      | John       | Park      | 312893112    | john@gmail.com         | Batch1687036529983 | OFFLINE      |
      | Benazir    | Baialieva | 312875424    | bena@gmail.com         | Batch1687036529983 | ONLINE       |
      | Aizada     | Alba      | 112423423    | aizada@gmail.com       | Batch1687036529983 | ONLINE       |