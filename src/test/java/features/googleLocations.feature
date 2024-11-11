Feature: Google Locations

  Scenario Outline: Add Location
    Given User adds location with the following "<Name>", "<Language>" and "<Address>"
    When User "adds" this location
    Then The location is successfully added with status code "200"
    And the "status" in the response body is "OK"
    And the "scope" in the response body is "APP"

    Examples: 
      | Name  | Language | Address            |
      | Rahul | Hindi    | 12, Jupiter Dr, MW |
      | Dash  | English  | 67, Ether Ln, MW   |

  Scenario: Add static location
    Given User has location data to upload
    When User "adds" this location
    Then The location is successfully added with status code "200"
    And the "status" in the response body is "OK"
    And the "scope" in the response body is "APP"
