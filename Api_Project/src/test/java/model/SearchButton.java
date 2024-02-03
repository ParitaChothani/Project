package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchButton {
	public void search(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("search")).sendKeys("hoodies for girl");
		Thread.sleep(1000);
		driver.findElement(By.className("action.search")).click();
		Thread.sleep(1000);
	}
}
