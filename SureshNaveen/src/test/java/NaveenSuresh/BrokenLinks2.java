package NaveenSuresh;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links:" + links.size());

		List<String> urllist = new ArrayList<String>();

		for (WebElement e : links) {
			String url = e.getAttribute("href");
			urllist.add(url);
			// checkbrokenLinks(url);
		}

		long setTime = System.currentTimeMillis();
		urllist.parallelStream().forEach(e -> checkbrokenLinks(e));
		// urllist.stream().forEach(e -> checkbrokenLinks(e));
        /// parallel stream time 62145

		//// stream taken time 173442
		long endTime = System.currentTimeMillis();

		System.out.println("Time taken for=" + (endTime - setTime));
		driver.quit();

	}

	public static void checkbrokenLinks(String linkurl) {

		try {
			URL url = new URL(linkurl);
			HttpURLConnection httpurlConnection = (HttpURLConnection) url.openConnection();
			httpurlConnection.setConnectTimeout(5000);
			httpurlConnection.connect();

			if (httpurlConnection.getResponseCode() >= 400) {
				
				System.out.println(linkurl + "---->" + httpurlConnection.getResponseMessage()  + "is Broken Link");
			} 
			else 
			{
				
				System.out.println(linkurl + "---->" + httpurlConnection.getResponseMessage() + "is  not Broken Link");

			}

		} catch (Exception e) {
			
			
		}
	}

}
