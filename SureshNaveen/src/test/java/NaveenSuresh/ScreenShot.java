package NaveenSuresh;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts=((TakesScreenshot)driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File tar=new File(".//Screenshot//homepage.png");
		FileUtils.copyFile(src, tar);
	}

}
