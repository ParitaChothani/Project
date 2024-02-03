package model;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class AddToCart {
	public void addtocartlogo(WebDriver driver) throws InterruptedException, IOException
	{
        File file=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("D:\\Selenium\\ss\\magentodefect.png"));
		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
		Thread.sleep(1000);
	}
}