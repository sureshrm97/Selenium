package Suresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No of links="+links.size());
		
		for(WebElement e:links) {
			System.out.println("No of links"+e.getText()+"Attributes"+e.getAttribute("href"));
		}
	}

}
