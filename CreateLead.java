package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

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

		// 5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		// 6. Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();

		// 7. Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Orion");

		// 8. Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");

		// 9. Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("balaji");

		// 10. Click on create Lead Button Using name Locator
		driver.findElement(By.className("smallSubmit")).click();
		// 11. Get the Title of the resulting Page
		String title = driver.getTitle();
		System.out.println(title);
		// 12.close the browser
		driver.close();
	}
}