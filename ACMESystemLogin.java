package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMESystemLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Initial Chromedriver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// login to the web page
		driver.get("https://acme-test.uipath.com/login");
		// username
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		// password
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		// login button
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		// title of page
		String title = driver.getTitle();
		// print title
		System.out.println(title);
		// logout
		driver.findElement(By.linkText("Log Out"));
		// closing browser
		driver.close();

	}

}
