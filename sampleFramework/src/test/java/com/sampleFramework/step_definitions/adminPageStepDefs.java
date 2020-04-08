
package com.sampleFramework.step_definitions;

import com.github.javafaker.*;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;
import com.sampleFramework.pages.AdminPage;
import com.sampleFramework.utilities.Driver;
import io.cucumber.java.en.*;

public class adminPageStepDefs {
	
	AdminPage adminPage = new AdminPage();
	
	@Given("user lands on admin page")
	public void user_lands_on_admin_page()  {
		String actualTitle = Driver.getDriver().getTitle();
		assertEquals("Dashboard | Active Admin Depot", actualTitle);
	}

	@When("^User clicks \"([^\"]*)\" from top Nav Bar$")
	public void user_clicks_from_top_Nav_Bar(String string) {
		switch(string) {
		  case "Users":
			  adminPage.topNavBarUsersLink.click();
		    break;
		  case "Dasboard":
		    // code block
		    break;
		  case "Products":
			    // code block
			    break;
		  case "Orders":
			    // code block
			    break;
		  default:
		    // code block
		}		
	}
	
	@Then("Admin User should be able to filter users with userName")
	public void admin_User_should_be_able_to_filter_users_with_userName() {
		
		int sizeNameIndex = adminPage.userNames.size();
		int randomNumber = (int) (Math.random()*sizeNameIndex);
		Select userNameDropdown = new Select(adminPage.usersNameDropdown);
		userNameDropdown.selectByVisibleText("Equals");
		String searchName = adminPage.userNames.get(randomNumber).getText();
		adminPage.userNameFilterInputBox.sendKeys(searchName);
		adminPage.usersFilterButton.click();	    
		assertEquals(searchName, adminPage.userNames.get(1).getText());    
	}

	@Then("Admin User should be able to filter users with email")
	public void admin_User_should_be_able_to_filter_users_with_email() {
		
		int sizeNameIndex = adminPage.userNames.size();
		int randomNumber = (int) (Math.random()*sizeNameIndex);
		Select emailDropdown = new Select(adminPage.emailDropdown);
		emailDropdown.selectByVisibleText("Equals");		
		String searchemail = adminPage.emails.get(randomNumber).getText();
		adminPage.emailFilterInputBox.sendKeys(searchemail);
		adminPage.usersFilterButton.click();
		assertEquals(searchemail, adminPage.emails.get(1).getText());
	}

	@Then("Admin User should be able to create new user at users page")
	public void admin_User_should_be_able_to_create_new_user_at_users_page() {
		Faker faker = new Faker();
		String userName = faker.name().firstName() + faker.name().lastName() + (faker.phoneNumber().extension().substring(0,2));
		String passWord = faker.name().lastName().substring(0,2) + faker.name().firstName().substring(0,2) + (faker.phoneNumber().extension().substring(0,2));
		String email = faker.internet().emailAddress();
		
		// searches if username already exists 
		Select userNameDropdown = new Select(adminPage.usersNameDropdown);
		userNameDropdown.selectByVisibleText("Equals");
		adminPage.userNameFilterInputBox.sendKeys(userName);
		adminPage.usersFilterButton.click();	
		assertEquals(true, adminPage.noUsersFountText.isDisplayed());
		
		//creates a new user		
		adminPage.newUserButton.click();
		adminPage.newUserNameInpputBox.sendKeys(userName);
		adminPage.newUserPasswordInpputBox.sendKeys(passWord);
		adminPage.newUseremailInpputBox.sendKeys(email);
		adminPage.createUserButton.click();
		assertEquals(userName, adminPage.userDetailsPageUserNameHeader.getText());
		assertEquals(userName, adminPage.userDetailsUserName.getText());
		assertEquals(email, adminPage.userDetailsEmail.getText());
		
		//filters username again to verify user is created
		adminPage.topNavBarUsersLink.click();
		adminPage.userNameFilterInputBox.sendKeys(userName);
		adminPage.usersFilterButton.click();	    
		assertEquals(userName, adminPage.userNames.get(1).getText());
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	