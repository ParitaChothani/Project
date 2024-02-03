package mvn;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.BrowserConfigaration;
import model.AddToCart;
import model.LoginPages;
import model.SearchButton;
import model.SideMenu;
import model.SortBy;
public class MainTest {
	WebDriver driver=null;
	LoginPages lp=null;
	SearchButton ss1=null;
	SortBy sss1=null;
	SideMenu s1=null;
	AddToCart a1 =null;
	@BeforeClass
	public void loadBrowser() throws InterruptedException
	{
		driver=new BrowserConfigaration().ChromeBrowserSelection("edge", "https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@BeforeTest
	public void beforetest()
	{
		lp=new LoginPages();
		ss1=new SearchButton();
		sss1=new SortBy();
		s1=new SideMenu();
		a1=new AddToCart();
	}
	@Test(priority = 0)
	public void loginDetails() throws InterruptedException
	{
		lp.enterUsername(driver, "paritachothani@gmail.com");
		lp.enterPassword(driver, "Admin@123P");
		lp.clickLogin(driver);
	}
	@Test(priority = 3)
	public void sideMenu() throws InterruptedException
	{
		s1.Women(driver);
		s1.Tops(driver);
		s1.openAbout(driver);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void searchbutton() throws InterruptedException {
		ss1.search(driver);
	}
	@Test(priority = 2)
	public void sortby() throws InterruptedException {
		sss1.sort(driver);
	}
	@Test(priority = 4)
	public void addToCart() throws InterruptedException, IOException
	{
		a1.addtocartlogo(driver);
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		System.out.println("Bye Bye...");
		Thread.sleep(1000);
		driver.close();		
	}
}
