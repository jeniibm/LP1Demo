package Seleniumweb;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("No of tabs " + tabs.size());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.linkText("For Work")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("My India",Keys.ENTER);
		//Thread.sleep(3000);
		//driver.findElement(By.name("btnK")).click();

	}

}
