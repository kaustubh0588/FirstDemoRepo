package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class selenium {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","/Users/beigkaustubhs/Downloads/jdk-14.0.1.jdk/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
        Thread.sleep(10000);
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(10000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are " + links.size());
		for (int i = 0; i < links.size(); i++) {
		WebElement element = links.get(i);
		String url = element.getAttribute("href");
		verifyLink(url);
		
				}
			}


	public static void verifyLink(String urlLink) {

	try {
		URL link = new URL(urlLink);
		HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
		httpConn.setConnectTimeout(2000);
		httpConn.connect();
		if (httpConn.getResponseCode() == 200) {
		System.out.println(urlLink + " - " + httpConn.getResponseMessage());
				  }
		if (httpConn.getResponseCode() == 404) {
		System.out.println(urlLink + " - " + httpConn.getResponseMessage());
				}
			}
		
	    catch (Exception e) {
					
				}
			}

		}


