package NaveenSuresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorXpath {

	/*
	 * //xpath is are those axes that are used to search for the multiple node in
	 * the XML Documrent from the current node These elements are used to when the
	 * element is not identified with the help of id ,name, class,
	 * classname,cssSelector etc Xpath Axes self parent child ancestor decending
	 * Following sibling-----following Preceding sibling-----preceding
	 * 
	 */

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//Self Select the current node 
		
		WebElement idbibank=driver.findElement(By.xpath("//a[contains(text(),'IDBI Bank')]/self::a"));
		System.out.println("Text of the name="+idbibank.getText());
		
		//parent Select the parent of the current node (always one)
		String text = driver.findElement(By.xpath("//a[normalize-space()='JK Tyre & Industries']/parent::td")).getText();
		System.out.println(text);
		
		//Child Select all children of the current node (One or Many)		
		List<WebElement > child=driver.findElements(By.xpath("//a[normalize-space()='JK Tyre & Industries']/ancestor::tr/child::td"));
		System.out.println("No of child Elements ="+child.size());
		
		//ancestor Select all ancestor (parent,grand parent etc)
		text=driver.findElement(By.xpath("//a[normalize-space()='JK Tyre & Industries']/ancestor::tr")).getText();
		System.out.println(text);
	
		
		//descendant Select all childrens (children,grand children);
		
		List<WebElement> descedant=driver.findElements(By.xpath("//a[normalize-space()='JK Tyre & Industries']/ancestor::tr/descendant::*"));
		System.out.println("No of Descendant nodes:"+descedant.size());
		
		
		//Following Select everything in the document after the closing tag of the current node 
	List<WebElement> following= driver.findElements(By.xpath("//a[normalize-space()='JK Tyre & Industries']/ancestor::tr/following::tr"));
	System.out.println("No of Following nodes:"+following.size());
	
	// following sibling Select all sibling after the current node
	List<WebElement> followingsibling=driver.findElements(By.xpath("//a[normalize-space()='JK Tyre & Industries']/ancestor::tr/following-sibling::tr"));
	System.out.println("Number of following sibling the current node="+followingsibling.size());	
	
	// preceding -Select all nodes that appear before the current node in the document
	
	List<WebElement> preceding=driver.findElements(By.xpath("//a[normalize-space()='JK Tyre & Industries']/ancestor::tr/preceding::tr"));
	System.out.println("Number of preceding the current nodes:"+preceding.size());
	
	//preceding siblings Selects all sibling before the current node 
	List<WebElement> precedingsibling=driver.findElements(By.xpath("//a[normalize-space()='JK Tyre & Industries']/ancestor::tr/preceding-sibling::tr"));
	System.out.println("Number of preceding-siblings the current nodes:"+precedingsibling.size());
	
	//1) div[@class='_8fgl _9l2p']/ancestor::div/descendant::button
	
	//2) first namexpath //button[@id='u_4_s_XQ']/parent::*/parent::*/child::div[1]/div/div[1]
	
	// 3) following xpath //input[@id='u_4_g_XA']/following::input[2]
	
	//4) preceding xpath //input[@id='password_step_input']/preceding::input[2]
	
	// 5) ancestor xpath //label[@for='u_4_4_vp']/ancestor::div[2]/div[1]/div/div[2]
	//label[@for='u_4_4_vp']/ancestor::div[2]//input[@id='u_4_d_qh']
	
	// identify the element from google search to search option
	//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']/parent::*/parent::*/parent::*/div[1]
	
	// identify the element from google search to search option  (following)
	//input[@id='twotabsearchtextbox']/following::a[contains(text(),"Today's Deals")]
	
	// identify the element from google search to search option  (preceding)
	//a[contains(text(),'Fashion')]/preceding::input[@id='twotabsearchtextbox']
	
	driver.close();
	}

}
