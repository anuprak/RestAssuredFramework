Feature: Google Locations

  Scenario: Add Location
    Given User has location data to upload
    When User "adds" this location
    Then The location is successfully added with status code "200"
    And the "status" in the response body is "OK"
    And the "scope" in the response body is "APP"      
