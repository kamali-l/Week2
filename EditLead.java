package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public static void main (String args[])
	{
		WebDriverManager.chromedriver() .setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage() .window() .maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//div[@class = 'x-form-item x-tab-item']//input[@name = 'firstName']")).sendKeys("Kamala");
		
		driver.findElement(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
//		verify title of the page
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		
//		Add new company name
		
		String newCompanyName = "Click 7 Studio";
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();

		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newCompanyName);
		
		driver.findElement(By.xpath("//td[@colspan = '4']/input[@value = 'Update']")).click();
		
//		verify company name
		
		String updatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		if (updatedCompanyName.contains(newCompanyName))
		{
			System.out.println("Company name updated successfully");
		}
		
		driver.close();
	}

}
