package Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//String ExpectedTitle = "OrangeHRM";
		driver.manage().window().maximize();
		WebElement first = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		first.sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
		Thread.sleep(8000);
		Actions act = new Actions(driver);
		WebElement link = driver.findElement(By.linkText("Performance"));
		act.moveToElement(link).click().build().perform();
		//build().perform();
		Thread.sleep(8000);
		driver.findElement(By.linkText("Configure")).click();
		Thread.sleep(8000);
		WebElement link2 = driver.findElement(By.id("menu_performance_searchKpi"));
		act.sendKeys(link2, Keys.ENTER).perform();
	}

}
