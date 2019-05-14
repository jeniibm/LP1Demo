package Seleniumweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		 WebElement username =driver.findElement(By.name("userName"));
	        if(username.isEnabled())
	        {
	            username.sendKeys("sunil");
	            username.clear();
	            username.sendKeys("sunil");
	        }
	        if(driver.findElement(By.name("userName")).isDisplayed())
	        {
	        driver.findElement(By.name("password")).sendKeys("sunil");
	        driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
	        }
	        Thread.sleep(3000);
	        if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
	        {
	            driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
					WebElement D = driver.findElement(By.name("passCount"));
					Select se1 = new Select(D);
					List<WebElement> data = se1.getOptions();
					System.out.println(data.size());
					for (int i=0; i<data.size(); i++)
					{	
					System.out.println(data.get(i).getText());
					}
					se1.selectByValue("2");
					WebElement  from = driver.findElement(By.name("fromPort"));
					Select se2 = new Select(from);
					List<WebElement> data2 = se2.getOptions();
					System.out.println(data2.size());
					for (int i=0; i<data2.size(); i++)
					{	
					System.out.println(data2.get(i).getText());
					}
					se2.selectByIndex(2);
					driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
					driver.findElement(By.name("findFlights")).click();
					driver.findElement(By.name("reserveFlights")).click();
					driver.findElement(By.name("passFirst0")).sendKeys("Arokiya");
					driver.findElement(By.name("passLast0")).sendKeys("Jenifer");
					driver.findElement(By.name("passFirst1")).sendKeys("Johnson");
					driver.findElement(By.name("passLast1")).sendKeys("S");
					driver.findElement(By.name("creditnumber")).sendKeys("1234 5678 9098 7610");
					List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
					for(WebElement e:checkbox)
					{
						e.click();
					}
					driver.findElement(By.name("buyFlights")).click();
					
					
					
					
					
					
					
					
					
				}

	}

}
