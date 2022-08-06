package NaveenSuresh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAction {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		js.executeScript("arguments[0].value='Admin';", username);
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		js.executeScript("arguments[0].value='admin123';", password);
		
	/// click operation with help of javascriptExecutor
		WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		js.executeScript("arguments[0].click();", login);
		
		
	}

}
