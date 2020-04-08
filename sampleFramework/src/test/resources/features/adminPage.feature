Feature: Admin Page Tests
 

   @test1
  Scenario: Admin user should be able to filter results with username
		Given user lands on admin page
    When User clicks "Users" from top Nav Bar
    Then Admin User should be able to filter users with userName

  
   @test1
  Scenario: Admin user should be able to filter results with email
 		Given user lands on admin page
    When User clicks "Users" from top Nav Bar
    Then Admin User should be able to filter users with email


   @test1
  Scenario: Admin user should be able to create a new user
  	Given user lands on admin page
    When User clicks "Users" from top Nav Bar
    Then Admin User should be able to create new user at users page
    
    