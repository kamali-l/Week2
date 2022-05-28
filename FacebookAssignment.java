package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {
	public static void main (String args []) {
		
//		Driver setup
		WebDriverManager .chromedriver() .setup();
		
//		Open chrome
		ChromeDriver driver = new ChromeDriver();
		
//		Open URL
		driver.get("https://en-gb.facebook.com/");
		
//		maximise window
		driver .manage() .window().maximize();
		
//		implicit time
		driver .manage().timeouts() .implicitlyWait(Duration.ofSeconds(30)); 
		
//		Find elements
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Kamala");
		
		driver.findElement(By.name("lastname")).sendKeys("Loganathan");
		
		driver.findElement(By.name("reg_email__")).sendKeys("kamala@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("kamala@gmail.com");
		
//		select dropdown
		WebElement ele = driver.findElement(By.id("day"));
		Select dateDD = new Select(ele);
		dateDD.selectByValue("1");
		
		WebElement ele2 = driver.findElement(By.id("month"));
		Select month = new Select(ele2);
		month.selectByVisibleText("Feb");
		
		WebElement ele3 = driver.findElement(By.id("year"));
		Select year = new Select(ele3);
		year.selectByIndex(3);
		
//		select radio button
		driver.findElement(By.xpath("(//input[@class = '_8esa'])[1]")).click();	
	}
}
