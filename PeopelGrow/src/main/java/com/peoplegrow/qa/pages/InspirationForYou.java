package com.peoplegrow.qa.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.peoplegrow.qa.base.TestBase;

public class InspirationForYou extends TestBase {
	
	@FindBy(xpath="//div[@class='careers-row-body careers-mobile careers-row-multiple']//a")
	List<WebElement> LS;
	
	
	@FindBy(xpath="//span[text()='Career Paths']")
	WebElement careerpathBack;
	
	@FindBy(xpath="//button[text()='Home']")
	WebElement homeLink;
	
	public InspirationForYou() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickonInspirationalLInk()
	{
		Random rand=new  Random();
		for(int i=0;i<3;i++) 
		{
		int randomIndex=rand.nextInt(LS.size());
		WebElement selectedOption=LS.get(randomIndex);
		selectedOption.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		careerpathBack.click();
		
		

	}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homeLink.click();
		
		driver.navigate().refresh();

}
	
	
}
