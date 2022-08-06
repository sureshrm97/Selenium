package NaveenSuresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://electoralsearch.in/");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(3000);

		WebElement agelist = driver.findElement(By.xpath("//select[@id='ageList']"));
		selectdropdown(agelist, "30");
		Thread.sleep(3000);

		WebElement gender = driver.findElement(By.xpath("//select[@id='listGender']"));
		selectdropdown(gender, "पुरुष/Male");
		Thread.sleep(3000);

		WebElement states = driver.findElement(By.xpath("//select[@id='nameStateList']"));
		selectdropdown(states, "Gujarat");
		Thread.sleep(3000);

	}

	public static void selectdropdown(WebElement ele, String value) {
		Select sl = new Select(ele);

		List<WebElement> alloptions = sl.getOptions();
		for (WebElement option : alloptions) {
			if (option.getText().equals(value)) {

			option.click();
			break;
		}
	}

	}
}
