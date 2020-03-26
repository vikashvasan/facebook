package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement name = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][1]"));
	name.sendKeys("vikash");
	WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys("vasan");
	WebElement mail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	mail.sendKeys("vikkas.vikkas@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
	password.sendKeys("vikash987");
	
	
	WebElement sex = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
	sex.click();


WebElement text = driver.findElement(By.xpath("//span[text()='Create an account']"));
	String text2 = text.getText();
System.out.println(text2);
WebElement contains = driver.findElement(By.xpath("//input[contains(@autocomplete,'new-password')]"));
boolean displayed = contains.isDisplayed();
boolean enabled = contains.isEnabled();
System.out.println(displayed);
System.out.println();



driver.close();
	}

}
