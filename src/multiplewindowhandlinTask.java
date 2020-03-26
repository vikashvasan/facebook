import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multiplewindowhandlinTask {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();

	driver.get("https://www.google.com/");
	Robot r = new Robot();
	Actions ac = new Actions(driver);
	WebElement gmail = driver.findElement(By.xpath("(//a[@class=\"gb_g\"])[1]"));
	ac.contextClick(gmail).build().perform();
	//gmail new tab
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//images new tab
	WebElement images = driver.findElement(By.xpath("(//a[@class=\"gb_g\"])[2]"));
	ac.contextClick(images).build().perform();
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//google search box 
	WebElement mobiles = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
	mobiles.sendKeys("mobiles");
driver.findElement(By.xpath("(//input[@class=\"gNO89b\"])[1]")).click();
Set<String> sid = driver.getWindowHandles();
System.out.println(sid);
for (String x : sid) {
	driver.switchTo().window(x);
	String title = driver.getTitle();
	if (title.contains("Gmail")) {
		driver.findElement(arg0)
		
	}
	
}
	
	
	
	
	
	
	
	}

}
