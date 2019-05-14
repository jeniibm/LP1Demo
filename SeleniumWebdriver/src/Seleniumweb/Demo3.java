package Seleniumweb;

	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
	//import org.openqa.selenium.;
	
public class Demo3 {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				//String ExpectedTitle = "OrangeHRM";
				driver.manage().window().maximize();
				WebElement first = driver.findElement(By.xpath("//*[@id='txtUsername']"));
				first.sendKeys("linda.anderson");
				String Value = driver.findElement(By.id("txtUsername")).getAttribute("value");
				System.out.println(Value);
				driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");
				driver.findElement(By.cssSelector("input.button")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Performance")).click();
				//driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
				Thread.sleep(3000);
				//driver.findElement(By.partialLinkText("Recru")).click();
				/*List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println(links.size());
				for (WebElement e:links)
				{
					String linkelement = e.getText();
					System.out.println(linkelement);
				}*/
				

	}
 
}
