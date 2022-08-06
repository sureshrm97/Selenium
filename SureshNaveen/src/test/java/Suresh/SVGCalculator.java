package Suresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGCalculator {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		
		String verticalXpath="//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		List<WebElement> barlists=driver.findElements(By.xpath(verticalXpath));
		System.out.println("No of barLists="+barlists.size());
		
		
		Actions act=new Actions(driver);
		for(WebElement e:barlists) {
			act.moveToElement(e).build().perform();
			Thread.sleep(1000);
		}
		
		
	}

}
