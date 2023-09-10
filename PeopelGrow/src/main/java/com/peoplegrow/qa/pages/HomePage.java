package com.peoplegrow.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.peoplegrow.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath="//button[contains(text(),'Career')]")
	WebElement careerLink;
	
	
	@FindBy(xpath="//p[contains(text(),'Career Paths')]")
	WebElement careerpaths;
	
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public InspirationForYou verifyclickonCareerLink() throws IOException
	{
		careerLink.click();
		careerpaths.click();
		
		return new InspirationForYou();
	}
	
	
/*	public void verifyclickonCareerLink2()
	{
		
		careerpaths.click();
		
	}*/
	
	
	

}
