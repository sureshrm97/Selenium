package NaveenSuresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		//hoe to handle authentication popup 
		//driver.get("http://username:password@url");
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String Url=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(Url);
		driver.close();
		

	}

}
