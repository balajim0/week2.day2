package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");

		// Get Attribute
		String attribute = driver.findElement(By.name("username")).getAttribute("Value");
		System.out.println("Attribute: " + attribute);
		// is Displayed- element
		boolean displayed = driver.findElement(By.name("username")).isDisplayed();
		System.out.println("display: " + displayed);
		// is enabled - element
		boolean enabled = driver.findElement(By.xpath("//label[@for='disabled']/../input")).isEnabled();
		System.out.println("enable: " + enabled);

	}

}
