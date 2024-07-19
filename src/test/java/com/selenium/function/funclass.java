package com.selenium.function;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class funclass {
	
	WebDriver driver = new ChromeDriver();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	//Locators
	public String URL= "https://www.flipkart.com/";
	public By login = By.xpath("(//*[text()='Login'])[1]");
	public By verifytool = By.xpath("(//*[text()='New customer?'])");
	
	
	
	
	//common functions 
	public void URL()  
	{
		driver.get(URL);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(login));
	
	
	}
	
	public void movetologin()
	{		
		Actions action = new Actions(driver);
		
		WebElement loginele = driver.findElement(login);
		action.moveToElement(loginele).perform();
		
	}
	
	public void verifytooltip()
	{
		
        WebElement tooltip = wait.until(ExpectedConditions.visibilityOfElementLocated(verifytool));

		assert tooltip.isDisplayed();
	}
	
	
	public void closebrowser()
	{
		driver.close();
	}
	public void quit()
	{
		driver.quit();;
	}
}
