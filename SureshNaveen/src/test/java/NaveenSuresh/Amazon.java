package NaveenSuresh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		WebElement text=driver.findElement(By.name("q"));
		text.sendKeys("Testing");
		Thread.sleep(1000);
		text.getText();
		
		for(int i=0;i<=7;i++) {
			driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
		
	}
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.close();
		
	}

}
