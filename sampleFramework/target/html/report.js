$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/adminPage.feature");
formatter.feature({
  "name": "Admin Page Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Admin user should be able to filter results with username",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.MainPageStepDefs.the_user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on admin page",
  "keyword": "And "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.adminPageStepDefs.user_lands_on_admin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks \"Users\" from top Nav Bar",
  "keyword": "When "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.adminPageStepDefs.user_clicks_from_top_Nav_Bar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin User should be able to filter users with userName",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.adminPageStepDefs.admin_User_should_be_able_to_filter_users_with_userName()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Admin user should be able to filter results with email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.MainPageStepDefs.the_user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on admin page",
  "keyword": "And "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.adminPageStepDefs.user_lands_on_admin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks \"Users\" from top Nav Bar",
  "keyword": "When "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.adminPageStepDefs.user_clicks_from_top_Nav_Bar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin User should be able to filter users with email",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.adminPageStepDefs.admin_User_should_be_able_to_filter_users_with_email()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Admin user should be able to create a new user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.MainPageStepDefs.the_user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on admin page",
  "keyword": "And "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.adminPageStepDefs.user_lands_on_admin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks \"Users\" from top Nav Bar",
  "keyword": "When "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.adminPageStepDefs.user_clicks_from_top_Nav_Bar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin User should be able to create new user at users page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sampleFramework.step_definitions.adminPageStepDefs.admin_User_should_be_able_to_create_new_user_at_users_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});