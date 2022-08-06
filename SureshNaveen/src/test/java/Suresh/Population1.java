package Suresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Population1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String xpath_current_pop = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		// String xpath_today_pop =
		// "//div[normalize-space()='Today']//parent::div//span[@class='rts-counter']";
		// String xpath_thisyear_pop="//div[normalize-space()='This
		// year']/parent::div//span[@class='rts-counter']";

		String xpath_today_thisyear_pop = "//div[normalize-space()='This year' or normalize-space()='Today']/parent::div//span[@class='rts-counter']";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/world-population/");
		
		// div[normalize-space()='Today']//parent::div//span[@class='rts-counter']
		int count = 1;

		while (count <= 10) {
			System.out.println(count + " sec");
			if (count == 21)
				break;

			System.out.println("----------current population count-----------");
			populationData(xpath_current_pop);
			// populationData(xpath_today_pop);
			// populationData(xpath_thisyear_pop);

			System.out.println("----------Today and Thisyear population count-----------");

			populationData(xpath_today_thisyear_pop);
			System.out.println("==============================================");
			Thread.sleep(1000);
			;
			count++;
			
		}
		driver.close();
	}

	public static void populationData(String locator) throws InterruptedException {
		/*
		 * List<WebElement> poplist = driver.findElements(By.xpath(locator));
		 * 
		 * for (WebElement e : poplist) { System.out.println(e.getText()); }
		 */

		driver.findElements(By.xpath(locator)).stream().forEach(e -> System.out.println(e.getText()));
		//driver.close();
	}
}
