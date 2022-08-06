package NaveenSuresh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class ToolsQA {

	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait  =new WebDriverWait(driver, Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.invisibilityOfElementLocated(driver.get("https://www.toolsqa.com/selenium-webdriver/excel-in-selenium/")));
		driver.get("https://www.toolsqa.com/selenium-webdriver/excel-in-selenium/");
		
	}
}
