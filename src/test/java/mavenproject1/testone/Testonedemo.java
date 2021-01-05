package mavenproject1.testone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testonedemo {

	@Test
	public static void demo() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("windows maximize");
		driver.get("https://www.rameshsoft.com");
		System.out.println("executed");
		driver.close();
		System.out.println("person1 modified");
		
		
		

	}
}
