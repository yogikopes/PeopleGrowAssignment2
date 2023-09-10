package com.peoplegrow.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.peoplegrow.qa.base.TestBase;
import com.peoplegrow.qa.pages.LoginPage;
import com.peoplegrow.qa.pages.SignInButtonLink;

public class SignInButtonLinkTest extends TestBase {
	public SignInButtonLink signInButton;
	public LoginPage loginPage;

	public SignInButtonLinkTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		signInButton = new SignInButtonLink();
		loginPage = new LoginPage();
	}
	
	@Test( ) 
	
		public void signInButtonLinkTest() throws IOException{
			loginPage=signInButton.ClickonSignInButtonLink();
		
		}
	

}
