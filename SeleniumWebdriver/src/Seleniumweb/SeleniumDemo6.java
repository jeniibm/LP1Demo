package Seleniumweb;

//mport java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumDemo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		String underConstruction = "Under Construction: Mercury Tours";
		List<WebElement> link = driver.findElements(By.tagName("a"));
		String[] linktext = new String[link.size()];
		int i=0;
		// Extract the links
		for (WebElement e:link)
		{
			linktext[i] = e.getText();
			i++;
			
		}

		// Test each link is working or not
		for (String t:linktext)
		{
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals(underConstruction))
			{
				System.out.println("\"" + t+ "\" is under construction");
			}
			else
			{
				System.out.println("\"" + t+ "\" is working");
			}
		driver.navigate().back();
		}
		driver.quit();
	}

}
