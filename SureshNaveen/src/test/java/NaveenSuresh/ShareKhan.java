package NaveenSuresh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShareKhan {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.sharekhan.com/");
		driver.manage().window().maximize();

		WebElement login = driver.findElement(By.xpath(
				"//body/div[@id='wrapper']/div[@class='ng-scope']/header[@id='mainHeader']/div[@class='topHeader']/div[@class='maxContainer clearfix']/ul[@class='topNav topNavRt']/li[@class='login']/a[1]"));
		login.click();

		driver.findElement(By.xpath("//input[@name='emailLoginId']")).sendKeys("9989174840");
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@type='submit']")));

	}

}
