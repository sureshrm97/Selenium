package NaveenSuresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorldPopulation {
	
	
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.worldometers.info/world-population/");
		while(true) {
		List<WebElement> popList=driver.
				findElements(By.xpath("//div[@class='maincounter-number']/span/span"));
		
		for(WebElement e:popList ) {
			System.out.println(e.getText());
		}
		try {
			for(WebElement e:popList ) {
				System.out.println(e.getText());
			}
			
			popList=driver.
					findElements(By.xpath("//div[@class='maincounter-number']/span/span"));
		} catch (Exception e) {
			
		}
	}
	}
}
