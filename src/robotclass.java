import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();

	driver.get("https://www.google.com/");
	Robot r = new Robot();
	driver.findElement(By.name("q")).click();
r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_A);
	WebElement images = driver.findElement(By.xpath("(//a[@class=\"gb_g\"])[2]"));
	Actions ac = new Actions(driver);
	ac.contextClick(images).build().perform();
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	
	}

}
