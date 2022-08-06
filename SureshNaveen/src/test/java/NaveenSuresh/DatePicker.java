package NaveenSuresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		String year="2026";
		String month="Jul";
		String date="25";
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
			String monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			if(mon.equals(month) &&yr.equals(year)) 
			
			break;
			else
				driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		List<WebElement> alldates=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//td"));
		for(WebElement ele:alldates) {
			String dt=ele.getText();
			
			if(dt.equals(date)) {
				ele.click();
				break;
			}
		}
	}


}
