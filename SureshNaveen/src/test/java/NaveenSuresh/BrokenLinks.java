package NaveenSuresh;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	// private static final String HttpURLConnection = null;

	static public void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.mictest.cc/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			
			
			WebElement element = links.get(i);
			String url = element.getAttribute("href");

			URL link = new URL(url);
			HttpURLConnection httpconnect = (HttpURLConnection) link.openConnection();

			httpconnect.connect();
			int responsecode = httpconnect.getResponseCode();

			if (responsecode >= 400) {
				System.out.println(url + "   " + "  is broken Links");
			} else {
				System.out.println(url + "   " + "  is valid Links");

			}
		}

	}

}
