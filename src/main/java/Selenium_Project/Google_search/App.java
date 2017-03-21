package Selenium_Project.Google_search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    		System.setProperty("webdriver.chrome.driver","chromedriver 2");
    		WebDriver driver=new ChromeDriver();
    		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	       driver.manage().window().maximize();
    	       
    	       WebElement element=driver.findElement(By.id("lst-ib"));
    		    element.sendKeys("jasdeep kaur");
    	        System.out.println("bye1");
    		    element=driver.findElement(By.className("btnK"));
    		    element.click();
    }
}
