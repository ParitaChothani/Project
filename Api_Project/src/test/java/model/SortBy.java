package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SortBy {
	public void sort(WebDriver driver) throws InterruptedException
	{
//		driver.findElement(By.id("sorter")).click();
//		Thread.sleep(1000);
        WebElement ele=driver.findElement(By.id("Sort By"));	
	    Select option =new Select(ele);
	    option.selectByValue("Product Name");
	    Thread.sleep(2000);
	}
}