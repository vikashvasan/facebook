package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration extends reusability{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		reusability res= new reusability();
		
		WebElement s = driver.findElement(By.name("firstname"));
		res.Displayed(s, "vikash");
		WebElement s1 = driver.findElement(By.name("lastname"));
		s1.sendKeys("vasan");
		WebElement s2 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		s2.sendKeys("9940258800");
		WebElement s3 = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		s3.sendKeys("Vikash96@");
		WebElement s4 = driver.findElement(By.name("birthday_day"));
		s4.sendKeys("20");
		WebElement s5 = driver.findElement(By.name("birthday_month"));
		s5.sendKeys("october");
		WebElement s6 = driver.findElement(By.name("birthday_year"));
		s6.sendKeys("1996");
		WebElement s7 = driver.findElement(By.id("u_0_a"));
		s7.click();
		WebElement s8 = driver.findElement(By.name("websubmit"));
		s8.getText();
		s8.click();

	}
}