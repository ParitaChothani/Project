package model;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPages {
	public void enterUsername(WebDriver driver,String username) throws InterruptedException
	{
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
	}
	public void enterPassword(WebDriver driver,String password) throws InterruptedException
	{
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
	}
	public void clickLogin(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.name("send")).click();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/"))
		{
			System.out.println("Your Login Test Has been Passed...");
		}
		else
		{
			System.out.println("Your Login Test Hasbeen Failed...");
		    fail("login failed !!");
		}
		
	}
}
