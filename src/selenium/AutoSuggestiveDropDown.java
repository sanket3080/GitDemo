package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("/input[@id='autosuggest']")).sendKeys("ind");
		//driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("INDIA")) {
				option.click();
				break;
			}
		}
	}
}
