package NaveenSuresh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicking {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthyear);
		
		String month=monthyear.split(" ")[0].trim();
		String year=monthyear.split(" ")[1].trim();
		
		while(!(month.equals("May") &&year.equals("2024"))) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	        monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(monthyear);
			
			month=monthyear.split(" ")[0].trim();
			year=monthyear.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//a[normalize-space()='23']")).click();
	}

}
