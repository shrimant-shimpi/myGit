package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BTS_macbook {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.indiaistore.com/Back-To-School?utm_source=EspnCricinfo&utm_medium=Display&utm_campaign=Macbook_BTS_July_Aug_22&utm_content=Static");

		// driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector(".bars")).click();

		List<WebElement> menu = driver.findElements(By.cssSelector(".accordion>li"));
		for (int i = 0; i < menu.size(); i++) {
			String name = menu.get(i).getText();
			System.out.println(name);

		}
	}

}
