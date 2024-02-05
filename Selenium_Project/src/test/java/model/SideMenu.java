package model;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SideMenu {
	public void Women(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Women']")).click();
		Thread.sleep(1000);
	}
	public void Tops(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Tops']")).click();
		Thread.sleep(1000);
	}
	public void openAbout(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div/a/span/span/img")).click();
		Thread.sleep(1000);
	}
}