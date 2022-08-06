package NaveenSuresh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuery {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
		String dateval="25-07-2030";
		
		selectdateByJS(driver,date,dateval);
		
	}
	
	public static void selectdateByJS(WebDriver driver, WebElement element, String dateval) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"' );", element);
	}

}
