package mouseinteraction;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 WebElement rightclick = driver.findElement(By.xpath("//a[text()='Images']"));
	Actions ac= new Actions(driver);
	ac.contextClick().build().perform();
	}

}
