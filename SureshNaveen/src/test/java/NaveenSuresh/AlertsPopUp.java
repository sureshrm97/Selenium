package NaveenSuresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPopUp {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver suresh=new ChromeDriver();
		
		suresh.get("https://mail.rediff.com/cgi-bin/login.cgi");
		suresh.findElement(By.name("proceed")).click();
		
		
		suresh.switchTo().alert().accept();
		
	}

}
