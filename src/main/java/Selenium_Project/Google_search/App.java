package Selenium_Project.Google_search;
//import utilities.Function_;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Function_;


public class App 
{
   

	public static void main( String[] args)
    {
    	
    		    
    	            Function_ obj1 = new Function_();
    	        
				obj1.driverSelection("webdriver.chrome.driver","chromedriver");
				
				obj1.getUrl("https://google.com");
				
				obj1.getSearch("lst-ib","jasdeep kaur");
				
				obj1.driverClose();
				
    }
}
