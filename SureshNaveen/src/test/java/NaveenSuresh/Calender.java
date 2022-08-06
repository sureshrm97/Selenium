package NaveenSuresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/flights/cheap.htm");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='modify-search-input-box date']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='10']")).click();
		Thread.sleep(3000);
	}

}
