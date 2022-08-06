package NaveenSuresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions pop=new ChromeOptions();
		pop.addArguments("--disable notifications");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://licindia.in/");
	}

}
