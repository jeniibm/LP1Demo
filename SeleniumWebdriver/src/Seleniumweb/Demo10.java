package Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ArokiyaJeniferL\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C://Users//ArokiyaJeniferL//Desktop//Selenium//New.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]//preceding-sibling::td")).getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]//following-sibling::td")).getText());
	}

}
