package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class selenium {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","/Users/beigkaustubhs/Downloads/jdk-14.0.1.jdk/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Kaustubh");
		//driver.findElement(By.name("lastname")).sendKeys("Shahane");
		//driver.findElement(By.name("phone")).sendKeys("9884788440");
		//driver.findElement(By.name("userName")).sendKeys("kaustubh.shahane@gmail.com");
		//driver.findElement(By.name("address1")).sendKeys("Chennai");
		//driver.findElement(By.name("city")).sendKeys("Chennai");
		//driver.findElement(By.name("state")).sendKeys("Tamil Nadu");
		//driver.findElement(By.name("postalCode")).sendKeys("600010");	
		driver.findElement(By.name("country")).sendKeys("AUSTRALIA");
		//driver.findElement(By.name("email")).sendKeys("kaustubh.shahane@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("Chennai123");
		//driver.findElement(By.name("confirmPassword")).sendKeys("Chennai123");

		
	}

}
