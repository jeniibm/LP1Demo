package Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement first = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		first.sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("input.button")).click();
		Actions button = new Actions(driver);
		button.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		button.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();

	}

}
