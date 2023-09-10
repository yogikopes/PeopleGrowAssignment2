package com.peoplegrow.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.peoplegrow.qa.base.TestBase;
import com.peoplegrow.qa.pages.HomePage;
import com.peoplegrow.qa.pages.LoginPage;
import com.peoplegrow.qa.pages.SignInButtonLink;

public class HomePageTest extends TestBase{
	
	SignInButtonLink signLink;
	LoginPage loginpage;
	HomePage homepage;
	public HomePageTest() throws IOException
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws IOException
	{
		
		initialization();
		signLink=new SignInButtonLink();
		signLink.ClickonSignInButtonLink();
		loginpage=new LoginPage();
		
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
		homepage=new HomePage();	
		
	}
	
	
	
	
	@Test(priority=1)
	public void verifyclickonCareerLinkTest() throws IOException
	{
		homepage.verifyclickonCareerLink();
		homepage.verifyclickonCareerLink();
	}
	
	


}
