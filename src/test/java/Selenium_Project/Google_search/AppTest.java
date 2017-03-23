package Selenium_Project.Google_search;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Function_;
import org.openqa.selenium.WebDriver;
public class AppTest{
	Function_ obj1 = new Function_();
    WebDriver driver;
	@BeforeMethod
	public void test1()
	{
		 obj1.driverSelection("webdriver.chrome.driver","chromedriver");
	}
	
	@Test (priority=1)
	public void test2()
	{		//obj1.driverSelection("webdriver.chrome.driver","chromedriver");
			obj1.getUrl("https://google.com");
			obj1.getSearch("lst-ib","jasdeep kaur");
			//driver.quit();
	}
	

	
	@AfterMethod
	public void test4()
	{
		obj1.driverClose();
	}
	
}
