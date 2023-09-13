package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Lawrence Block']")).click();
		
		System.out.println(driver.findElement(By.xpath("//span[text()='Lawrence Block']")).getText());
		
		//Actions actions=new Actions(driver);
//		
//		WebElement scr=driver.findElement(By.xpath("//span[text()='Lawrence Block']"));
//		
//		System.out.println(scr.getText());
//		WebElement dest=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
//		
//		actions.clickAndHold(scr).pause(Duration.ofSeconds(2)).moveToElement(dest).pause(Duration.ofSeconds(2)).release().build().perform();
//		
	}
}
