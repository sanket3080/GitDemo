package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("abc");
		driver.findElement(By.name("inputPassword")).sendKeys("jfegjwefg");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("TestUSer");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test@abc.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("989898989");
		driver.findElement(By.className("reset-pwd-btn")).click();
		//driver.findElement(By.className("infoMsg")).getText();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
