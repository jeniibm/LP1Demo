package Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String ExpectedTitle = "OrangeHRM";
		driver.manage().window().maximize();
		WebElement first = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		first.sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
		String ActualTitle = driver.getTitle();
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("If the title is ssame then logout");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			//driver.findElement(By.linkText("Logout")).click();
			
		}
		
		else
		{
			System.out.println("Not same title");
		}
		
		driver.close();
	}

}
