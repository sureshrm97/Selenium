package NaveenSuresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopUps {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//options.addArguments("--disable-main-stream");
		options.addArguments("--disable-geoLocation");
		WebDriver driver=new ChromeDriver(options);
		
		//driver.get("/https://www.hdfcbank.com");
		//driver.get("https://www.mictest.cc/");
		driver.get("https://whatmylocation.com/");
	}

}
