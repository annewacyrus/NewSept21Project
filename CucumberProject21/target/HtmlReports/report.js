$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/ColorBackground.feature");
formatter.feature({
  "name": "feature To Test Background Colors",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Change Color To Blue",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BackgroundColorSteps.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the blue button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.BackgroundColorSteps.i_click_on_the_blue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.BackgroundColorSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Change Color To White",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BackgroundColorSteps.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the white button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.BackgroundColorSteps.i_click_on_the_white_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.BackgroundColorSteps.the_background_color_change_to_white()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});