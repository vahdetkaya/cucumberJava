
package com.sampleFramework.pages;

import java.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sampleFramework.utilities.Driver;

public class AdminPage {

	
	public AdminPage() {
		PageFactory.initElements(Driver.getDriver(), this);
}
	
	@FindBy (xpath = "//a[text()='Administration interface']")
	public WebElement adminPageLink;
	
	@FindBy (css = "#users a")
	public WebElement topNavBarUsersLink;
	
	

	
	//usersPage 
	
	
	@FindAll (@FindBy(css = ".col.col-username"))
	public List <WebElement> userNames;

	@FindAll (@FindBy(css = ".col.col-email"))
	public List <WebElement> emails;
	@FindBy (css="#q_username_input select")
	public WebElement usersNameDropdown;
	
	@FindBy (id ="q_username")
	public WebElement userNameFilterInputBox;
	
	@FindBy (css= ".buttons input")
	public WebElement usersFilterButton;
	
	@FindBy (css="#q_email_input select")
	public WebElement emailDropdown;
	
	@FindBy (id = "q_email")
	public WebElement emailFilterInputBox;
	
	@FindBy (css = "#titlebar_right a")
	public WebElement newUserButton;
	
	@FindBy (css = ".blank_slate")
	public WebElement noUsersFountText;
	
	///new user page
	
	@FindBy (id="user_username")
	public WebElement newUserNameInpputBox;
	
	@FindBy (id="user_password")
	public WebElement newUserPasswordInpputBox;
	
	@FindBy (id="user_email")
	public WebElement newUseremailInpputBox;
	
	@FindBy (css="#user_submit_action input")
	public WebElement createUserButton;
	
	@FindBy (css=".cancel at")
	public WebElement cancelButton;
	
	//userDetails page
	
	
	@FindBy (id="page_title")
	public WebElement userDetailsPageUserNameHeader;
	
	
	
	@FindBy (css=".attributes_table.user .row-username td")
	public WebElement userDetailsUserName;
	
	@FindBy (css=".attributes_table.user .row-email td")
	public WebElement userDetailsEmail;

}



