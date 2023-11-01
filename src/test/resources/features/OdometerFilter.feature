
Feature: As a user, I should be able to use "Last Odometer" filter under 'Fleet-Vehicles' page

  Agile :1- User can select "Last Odometer" filter under 'Fleet-Vehicles' page

  Background:
    Given the user logged in as "driver"
    And user selects the vehicle option from Fleet tab
    And user enables Filters  button
    And user enters : Last Odometer in searchBox


  Scenario: 1- User can select "Last Odometer" filter under 'Fleet-Vehicles' page

    Then user should see Last Odometer button on page

  @wip
  Scenario: "Last Odometer" filter should provide the methods shown as below:	->
  Between	-> Not Between	-> Equals	-> Not Equals	-> More Than
  -> Less Than	-> Equals or More Than	-> Equals or Less Than	-> Is
  Empty	-> Is Not Empty



    Then  user should see all options
      | Between             |
      | Not Between         |
      | Equals              |
      | Not Equals          |
      | More Than           |
      | Less Than           |
      | Equals or More Than |
      | Equals or Less Than |
      | Is Empty            |
      | Is Not Empty        |

