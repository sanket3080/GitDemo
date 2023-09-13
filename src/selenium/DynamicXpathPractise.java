package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathPractise {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mingle-ci-portal.mingle.inforos.dev.inforcloudsuite.com/MNGQAPUCIMS_AX6");
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("sanket.sakore@infor.com");
		driver.findElement(By.xpath("//input[starts-with(@type, 'pass')]")).sendKeys("Automation@1234");
		driver.findElement(By.xpath("//button[contains(@title,'Sign In') and @type='submit']")).click();
		driver.findElement(By.xpath("//span[contains(@id,'usr-span')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
	}

}
