package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeVerfication {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		// Get Css Value
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("CssValue:" + cssValue);
		// print Text
		String text = driver.findElement(By.id("color")).getText();
		System.out.println("Text:" + text);
		// Get location for element
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println("Loaction: " + location);
		// get size of element
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("Size:" + size);
		// Get Tag name of element
		String tagName = driver.findElement(By.id("size")).getTagName();
		System.out.println("Tag Name: " + tagName);
	}
}
