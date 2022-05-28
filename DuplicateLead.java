package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
//		Browser setup
		WebDriverManager .chromedriver() .setup();
		
//		Open chrome
		ChromeDriver driver = new ChromeDriver();
		
//		Open URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
//		Maximize window
		driver.manage() .window() .maximize();
		
//		find elements
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[@class = 'x-tab-strip-inner']/span[text() = 'Email']")).click();

		driver.findElement(By.xpath("//div[@class = 'x-form-item x-tab-item']//input[@name = 'emailAddress']")).sendKeys("kamali15390@gmail.com");

//		Store lead name
		String leadName = driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();

		
		driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
//		Title verification
		String verifyDuplicate = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		
		if (verifyDuplicate.equals("Duplicate Lead"))	
		{
			System.out.println("Verified duplicate text");
		}
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//td[@colspan = '4']/input[@value = 'Create Lead']")).click();

//		Store duplicate lead name
		String duplicateLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
//		compare lead name with duplicate lead name
		if (leadName.equals(duplicateLeadName))
		{
			System.out.println("Duplicate lead created successfully");
		}
		Thread.sleep(1000);
		
		driver.close();

	}

}
