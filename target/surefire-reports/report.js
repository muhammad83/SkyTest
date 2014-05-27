$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "Test Feature",
  "description": "",
  "id": "test-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Go to sky\u0027s Find\u0026Watch TV page, search for Game of thrones s4 episodes and for all the returned episodes I can see the record and watch now button",
  "description": "",
  "id": "test-feature;go-to-sky\u0027s-find\u0026watch-tv-page,-search-for-game-of-thrones-s4-episodes-and-for-all-the-returned-episodes-i-can-see-the-record-and-watch-now-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on the \u0027Find\u0026Watch TV\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for \"game of thrones s4\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should get a results page of available episodes",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I should see the \"Watch Now\" button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should also see the \"Record\" button",
  "keyword": "And "
});
formatter.match({
  "location": "TestStepDef.I_am_on_the_Find_Watch_TV_page()"
});
formatter.result({
  "duration": 7106891000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "game of thrones s4",
      "offset": 14
    }
  ],
  "location": "TestStepDef.I_search_for(String)"
});
formatter.result({
  "duration": 4082201000,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.I_should_get_a_results_page_of_available_episodes()"
});
formatter.result({
  "duration": 6313000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Watch Now",
      "offset": 18
    }
  ],
  "location": "TestStepDef.I_should_see_the_button(String)"
});
formatter.result({
  "duration": 10015000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Record",
      "offset": 23
    }
  ],
  "location": "TestStepDef.I_should_see_the_button(String)"
});
formatter.result({
  "duration": 9875000,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat StepDef.TestStepDef.I_should_see_the_button(TestStepDef.java:47)\n\tat ✽.And I should also see the \"Record\" button(Test.feature:8)\n",
  "status": "failed"
});
});