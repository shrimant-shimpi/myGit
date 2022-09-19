package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookRegistration {

	@Test
	public void register() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//a[@role='button'][@data-testid='open-registration-form-button']")).click();
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));

		firstname.sendKeys("suraj");
		lastName.sendKeys("patil");
		WebElement mobilenumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));

		mobilenumber.sendKeys("96879897392");

		passwordField.sendKeys("Ashish$000");
		WebElement day = driver.findElement(By.id("day"));

		WebElement month = driver.findElement(By.id("month"));

		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(day);
		select.selectByVisibleText("24");

		Select select2 = new Select(month);
		select2.selectByVisibleText("Dec");

		Select select3 = new Select(year);
		select3.selectByVisibleText("1996");

		WebElement Gender = driver.findElement(By.xpath("//input[@value='2']"));
		Gender.click();

		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}
}
