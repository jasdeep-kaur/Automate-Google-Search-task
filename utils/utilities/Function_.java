package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Function_ 
{
   public String str;
    public String str1;
    public String url;
    public String name;
    public String xPath;
    public String id1;
    WebDriver driver;
    WebElement element;
    

	public void  driverSelection(String string,String string1)
	{
    	str=string;
    	str1=string1;
    	driver=new ChromeDriver();
        System.setProperty(string,string1);
	}
	
	
    public void getUrl(String url)
    {
    	   driver.get(url);
    }
    
    public void getSearch(String id1,String name)
    {
    	driver.findElement(By.id(id1)).sendKeys(name);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
     }
     
    public void driverClose()
    {
    driver.quit();	
    }
}
