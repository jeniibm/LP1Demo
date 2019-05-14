package Seleniumweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo4 {


	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		//String match = "Home";
		WebElement username = driver.findElement(By.linkText("Home"));
		 if(username.isEnabled())
	        {
			 System.out.println("Home Link is working");
	        }
		 else
		 {
			 System.out.println("Home Link is under construction");
		 }
		 driver.findElement(By.linkText("Flights")).click();
		 WebElement flight = driver.findElement(By.name("userName"));
		 if(flight.isEnabled())
				
			{
				System.out.println("Flight Link is working");
				
			}
		 else
		 {
			 System.out.println("Flight Link is working");
		 }
		 
		 driver.findElement(By.linkText("Hotels")).click();
		 //WebElement data = driver.findElement(By.xpath("//a[starts-with(@href,'mercurywelcome.php')]"));
		 
		 //System.out.println(data);
		 
		if(driver.findElement(By.xpath("//*[starts-with(@src,'/images/masts/mast_construction.gif')]")).isDisplayed())
			
		{
			System.out.println("Hotel Link is under construction");
			
		}
		else
		 {
			 System.out.println("Hotel Link is working");
		 }
		
		driver.findElement(By.xpath("//a[starts-with(@href,'mercurywelcome.php')]")).click();
		driver.findElement(By.linkText("Car Rentals")).click();
		if(driver.findElement(By.xpath("//*[starts-with(@src,'/images/masts/mast_construction.gif')]")).isDisplayed())
			
		{
			System.out.println("Car Rentals Link is under construction");
			
		}
		else
		 {
			 System.out.println("Car Rentals Link is working");
		 }
		driver.findElement(By.xpath("//a[starts-with(@href,'mercurywelcome.php')]")).click();
		driver.findElement(By.linkText("Cruises")).click();
		//String data2 = driver.findElement(By.xpath("//a[starts-with(@href,'mercurywelcome.php')]")).getText();
		/*String data2 = driver.findElement(By.xpath("//*[starts-with(@src,'/images/masts/cruise_special.gif')]")).getCssValue(match);
		
		System.out.println(data2);*/
		if(driver.findElement(By.xpath("//*[starts-with(@src,'/images/masts/cruise_special.gif')]")).isDisplayed())
		
		{
			System.out.println("Crusies Link is working");
			
		}
		else
		 {
			 System.out.println("Crusies Link is under construction");
		 }
	
	
		driver.findElement(By.partialLinkText("Destina")).click();
		if(driver.findElement(By.xpath("//*[starts-with(@src,'/images/masts/mast_construction.gif')]")).isDisplayed())
			
		{
			System.out.println("Destinations Link is under construction");
			
		}
		else
		 {
			 System.out.println("Destinations Link is working");
		 }
		driver.findElement(By.partialLinkText("Vacat")).click();
		if(driver.findElement(By.xpath("//*[starts-with(@src,'/images/masts/mast_construction.gif')]")).isDisplayed())
			
		{
			System.out.println("Vacation Link is under construction");
			
		}
		else
		 {
			 System.out.println("Vacation Link is working");
		 }
	}
	
}
