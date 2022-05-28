package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
//		setup driver
		WebDriverManager.chromedriver().setup();
		
//		Open Browser
		ChromeDriver driver = new ChromeDriver();
		
//		open URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
//		Maximise window
		driver.manage() .window() .maximize();
		
//		find elements
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Kamala");
		driver.findElement(By.id("lastNameField")).sendKeys("Loganathan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kamali");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Loganathan");
		driver.findElement(By.name("departmentName")).sendKeys("Studio");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Contact Details");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kamali15390@gmail.com");
		
//		select dropdown
		WebElement ele = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_departmentName")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Notes");
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
		
//		Get title
		System.out.println(driver.getTitle());
		
	}

}
