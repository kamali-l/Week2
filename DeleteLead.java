package week2.day2.assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
//		Driver setup
		WebDriverManager .chromedriver() .setup();
		
//		open chrome
		ChromeDriver driver = new ChromeDriver();
		
//		Enter URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
//		Maximise
		driver .manage() .window() .maximize();
		
//		find elements
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//div[@class = 'x-form-item x-tab-item']//input[@name = 'firstName']")).sendKeys("Kamala");
		
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(1000);
		
//		storing text value in a variable
		String lead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).getText();
		
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
		
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name = 'id']")).sendKeys(lead);
		
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(1000);
		
//		Verification of text
		
		 boolean verify = driver.findElement(By.className("x-paging-info")).isDisplayed();
		 
		 if (verify)
		 {
			 System.out.println("No records to display");
		 }
		 
		driver.close();
	}

}
