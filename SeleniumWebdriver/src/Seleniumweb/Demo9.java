package Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement label1 = driver.findElement(By.xpath("//*/tbody/tr[1]/td[1]"));
		//WebElement label1 = driver.findElement(By.xpath("//*[@name='email']//parent::td//parent::tr//preceding-sibling::tr/label"));
		WebElement label1 = driver.findElement(By.xpath("//*[@name='email']//ancestor::tr//preceding-sibling::tr/label"));
		WebElement label2 = driver.findElement(By.xpath("//*[@name='email']//parent::td//following-sibling::td/input[@id='pass']"));
		
		System.out.println(label1.getText());
		
	}

}
