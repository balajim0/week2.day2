package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lauch opencart URL
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		//first name input
		driver.findElement(By.id("input-firstname")).sendKeys("Chrystal");
		// last name input
		driver.findElement(By.id("input-lastname")).sendKeys("Tester");
		//Select dropdown value using sendkeys
		driver.findElement(By.id("input-country")).sendKeys("India");
	}

}
