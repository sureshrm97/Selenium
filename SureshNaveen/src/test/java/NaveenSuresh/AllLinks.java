package NaveenSuresh;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		List<WebElement> all = driver.findElements(By.xpath("//select[@id='searchDropdownBox']"));
		System.out.println(all.size());

		
		for(WebElement e:all) {
			System.out.println("No of links :"+e.getText()+"attributes of "+e.getAttribute("href"));
		}
	}

}
