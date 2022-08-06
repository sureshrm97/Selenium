package Suresh;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import NaveenSuresh.ScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath(""));
		// taking full page screenshot
		TakesScreenshot ts=((TakesScreenshot)driver);
		/*File tar=ts.getScreenshotAs(OutputType.FILE);
		File src=new File(".//Screenshots//loginpage.png");
		FileUtils.copyFile(tar, src);*/
		
		// Taking screenshot for selected one element 
		
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']"));
		File tar=logo.getScreenshotAs(OutputType.FILE);
		File src=new File(".//Screenshots//Logo.png");
		FileUtils.copyFile(tar, src);

		
		
	
	}

}
