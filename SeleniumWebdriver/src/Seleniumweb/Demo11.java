package Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ArokiyaJeniferL\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://realestate.upskills.in/wp-admin/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		WebElement link = driver.findElement(By.linkText("Posts"));
		Actions act = new Actions(driver);
		act.moveToElement(link).click().build().perform();
		WebElement link1 = driver.findElement(By.linkText("All Posts"));
		act.sendKeys(link1, Keys.ENTER).build().perform();
		WebElement link2 = driver.findElement(By.xpath("//strong/a[contains(text(),apollo)]//parent::strong//parent::td//preceding-sibling::th//child::input[@id='cb-select-3371']"));
		link2.click();
		
	}

}
