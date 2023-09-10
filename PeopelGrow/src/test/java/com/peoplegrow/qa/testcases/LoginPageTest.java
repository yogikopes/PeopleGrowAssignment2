package com.peoplegrow.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.peoplegrow.qa.base.TestBase;
import com.peoplegrow.qa.pages.HomePage;

import com.peoplegrow.qa.pages.LoginPage;
import com.peoplegrow.qa.pages.SignInButtonLink;

public class LoginPageTest extends TestBase {
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignInButtonLink signInButton;
	public LoginPage loginPage;
	public HomePage homePage;
	
	
	
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		signInButton = new SignInButtonLink();
		loginPage = new LoginPage();
		homePage = new HomePage();
		loginPage=signInButton.ClickonSignInButtonLink();
		
	

}
	
	@Test()
	public void LoginPageTitle() {
		String title =loginPage.validateLoginPageTitleC();
	}
	
	@Test()
	public void LoginTest() throws IOException
	{
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	}
