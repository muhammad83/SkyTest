Feature: Test Feature
@run
Scenario: Go to sky's Find&Watch TV page, search for Game of thrones s4 episodes and for all the returned episodes I can see the record and watch now button
  Given I am on the 'Find&Watch TV' page
  When I search for "game of thrones s4"
  Then I should get a results page of available episodes
  And I should see the "Watch Now" button
  And I should also see the "Record" button