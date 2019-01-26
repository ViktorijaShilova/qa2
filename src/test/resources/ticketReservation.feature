Feature: Ticket Reservation

  Scenario: Ticket Reservation Testing
    Given departure airport RIX
    And destination airport MEL
    And user data is:
      | name           | John       |
      | surname        | Smith      |
      | discountCode   | abcd       |
      | travellerCount | 3          |
      | children       | 1          |
      | luggage        | 4          |
      | nextFlight     | 13-05-2018 |
    And seat number is 15
    And we are on home page

    When we are selecting airports
    And we are pressing GoGoGO button
    Then the registration page appears

    When we are filling registration form
    And we are pressing GetPrice button
    Then our price will be 1000 euro

    When we are pressing Book button
    Then we are on select seat page

    When we are selecting seat number
    And we are clicking Book button
    Then successful registration page appears

    When we are requesting registration list
    Then can see our reservation in the list

    When we are deleting our reservation ticket
    And we are requesting registration list again
    Then we can see aur reservation is not in the list

