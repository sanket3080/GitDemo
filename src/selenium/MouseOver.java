package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		//driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		
		Actions action=new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		
		action.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//moves to specific element
		action.moveToElement(move).contextClick().build().perform();
	}
}
