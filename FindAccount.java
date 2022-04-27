package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) throws InterruptedException {

		// Pseudo Code
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// 5. Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();

		// 6. Click on Find Accounts
		driver.findElement(By.linkText("Find Accounts")).click();

		// 7. Enter AccountName as "Credit Limited Account"
		driver.findElement(By.xpath("//label[contains(text(),'Account ID')]/../..//input[@name='accountName']"))
				.sendKeys("Credit Limited Account");
		// 8. Click on Find Accounts using xpath Locator

		driver.findElement(By.xpath("//button[contains(text(),'Find Accounts')]")).click();
		// 9. Click on the edit Button
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[contains(@class,'col-groupName')]//a[contains(text(),'Credit Limited Account')]"))
				.click();
		driver.findElement(By.linkText("Edit")).click();
		// 10. Get the Text of Account Name and verify
		Thread.sleep(1000);
		String accountname = driver
				.findElement(By.xpath("//span[contains(text(),'Account Name')]/../..//input[@id='accountName']"))
				.getAttribute("value");
		System.out.println(accountname);
		if (accountname.equalsIgnoreCase("Credit Limited Account")) {
			System.out.println("Account name verified");
		} else
			System.out.println("Account name not verified");

		// 11. Get the Text of Description

		String desc = driver.findElement(By.name("description")).getText();
		System.out.println(desc);
		// 12. Get the title of the page and verify it.
		System.out.println(driver.getTitle());
		if (("Edit Account | opentaps CRM").contentEquals(driver.getTitle())) {
			System.out.println("Tile is verified");
		} else
			System.out.println("Title is not verified");

	}

}
