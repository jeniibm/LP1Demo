package Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

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
		WebElement link = driver.findElement(By.linkText("Leave"));
		act.moveToElement(link).click().build().perform();
		//build().perform();
		Thread.sleep(8000);
		WebElement link1 = driver.findElement(By.linkText("Reports"));
		act.moveToElement(link1);
		act.build().perform();
		Thread.sleep(8000);
		WebElement link2 = driver.findElement(By.id("menu_leave_viewLeaveBalanceReport"));
		act.sendKeys(link2, Keys.ENTER).perform();
		//act.moveToElement(link2).click().build().perform();
		
		
	}

}
