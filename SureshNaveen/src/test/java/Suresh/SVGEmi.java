package Suresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGEmi {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		String verticalXpaths="//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		List<WebElement> barlist=driver.findElements(By.xpath(verticalXpaths));
		System.out.println("total bars="+barlist.size());
		
		//body > div:nth-child(2) > div:nth-child(1) > main:nth-child(1) > article:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > table:nth-child(1)
		Actions act=new Actions(driver);
		for(WebElement e: barlist) {
			act.moveToElement(e).build().perform();
			Thread.sleep(1000);
		}
	}

}
