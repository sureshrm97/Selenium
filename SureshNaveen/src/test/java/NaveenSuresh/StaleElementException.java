package NaveenSuresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Suresh");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("Ramavath");
		Thread.sleep(1000);

		driver.navigate().refresh();

		try {
			username.sendKeys("Suresh");
			password.sendKeys("Ramavath");

		} catch (Exception e) {
			username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
			username.sendKeys("Suresh");
			password.sendKeys("Ramavath");
			
		}

	}

}
