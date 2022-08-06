package NaveenSuresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MonkeyTesting {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("https://www.amazon.in/");
		//driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		List<WebElement> footerlist=driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
		int footerCount=footerlist.size();
		System.out.println("footer list having="+footerCount);
		
		
		for(int i=0;i<footerCount;i++) {
			int randomindex=(int)Math.floor(Math.random()*footerCount);
			System.out.println("Random index of the ="+randomindex);
			
			WebElement e=footerlist.get(randomindex);
			System.out.println(e.getText());
			e.click();
			//Thread.sleep(3000);

			driver.navigate().back();
			Thread.sleep(3000);
			
			footerlist=driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
					
		}
	}

}
