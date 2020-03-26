package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task12q5 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://www.adactin.com/HotelApp/");
 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
 JavascriptExecutor js=(JavascriptExecutor)driver;
 js.executeScript("arguments[0].setAttribute( 'value','vallikannan')",username);
WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
 js.executeScript("arguments[0].setAttribute('value','12345678')", password);
WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
js.executeScript("arguments[0].click()", login);
	}

}
