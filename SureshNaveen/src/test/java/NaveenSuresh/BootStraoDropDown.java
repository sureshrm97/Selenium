package NaveenSuresh;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStraoDropDown {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@class='active']//a[@title='Personal'][normalize-space()='Personal']")).click();
		
		driver.findElement(By.xpath("//img[@class='closeSummer']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Select Product Type']")).click();
		
		List<WebElement> producttype=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		System.out.println("Number of elements:"+producttype.size());
		
		for(WebElement ptype:producttype) 
		{
			if(ptype.getText().equals("Loans")) 
			{
				ptype.click();
				break;
			}
		}
		
		//product
		
		//driver.findElement(By.xpath("//a[normalize-space()='Select Product']")).click();
		
		//driver.findElement(By.xpath(""))
		
	}

}
