package Suresh;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UplodingFiles {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		Actions act=new Actions(driver);
		
		
		WebElement fileupload=driver.findElement(By.xpath("//input[@class='file_upload']"));
		act.moveToElement(fileupload).click().build().perform();
		Thread.sleep(1000);
		fileupload.sendKeys("C:\\Users\\DELL\\Desktop\\Testing.txt");
		//Runtime.getRuntime().exec("");
	}

}
