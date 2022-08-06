package NaveenSuresh;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElements {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> dropdown=driver.findElements(By.xpath("//select[@id='searchDropdownBox']"));
		
		//System.out.println(dropdown.size());
		Thread.sleep(1000);
		
		Select sl=new Select((WebElement) dropdown);
		
		sl.selectByIndex(6);
		Thread.sleep(1000);
		
		sl.selectByVisibleText("Music");
		Thread.sleep(1000);
		
		sl.selectByValue("Software");
		

		
	}

}
