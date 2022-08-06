package NaveenSuresh;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowsID=driver.getWindowHandles();
		System.out.println("Name of the window:"+windowsID);
		
		Iterator<String> it=windowsID.iterator();
		String parentwindow=it.next();
		System.out.println("Name of the window:"+parentwindow);
		String childwindow =it.next();
		System.out.println("Name of the window:"+childwindow);
		
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//a[@class='btn-orange contact-ohrm ']")).click();
		driver.findElement(By.name("FullName")).sendKeys("Suresh Ramavath");
		driver.findElement(By.xpath("//input[@id='Form_submitForm_Email']")).sendKeys("reamavath2288suresh@gmail.com");
		driver.findElement(By.name("JobTitle")).sendKeys("Test Engineer");
		Thread.sleep(3000);
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123"+Keys.ENTER);
		Thread.sleep(3000);
		driver.switchTo().window(childwindow);
		//driver.close();
		//driver.switchTo().window(parentwindow);
		//driver.quit();
		
		

	}

}
