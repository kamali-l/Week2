package week2.day2.assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		
//		Browser setup
		WebDriverManager.chromedriver() .setup();
		
//		Open chrome
		ChromeDriver driver = new ChromeDriver();
		
//		open URL
		driver.get("https://acme-test.uipath.com/login");
		
//		Maximize window
		driver.manage() .window() .maximize();
		
//		find elements
		driver.findElement(By.xpath("//label[text() = 'Email:']/following-sibling::input")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();

//		get title
		System.out.println(driver.getTitle());
		
//		logout
		driver.findElement(By.linkText("Log Out")).click();
		
//		close the browser
		driver.close();

	}

}
