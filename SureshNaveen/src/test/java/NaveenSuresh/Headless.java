package NaveenSuresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		//opt.setHeadless(true);
		opt.addArguments("--headless");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).getText();
		//System.out.println();
	}

}
