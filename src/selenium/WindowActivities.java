package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();  //maximizes browser window
		driver.get("https://www.google.com");
		driver.navigate().to("https://rahulshettyacademy.com/");  // to visit this url on same browser tab
		driver.navigate().back();
		driver.navigate().forward();
	}

}
