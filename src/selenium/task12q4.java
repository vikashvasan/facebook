package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task12q4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','greens@gmail.com')", username);
   WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	js.executeScript("arguments[0].setAttribute('value','12345')", password);
	
	WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up'][1]"));
	String color = signup.getCssValue("color");
	System.out.println(color);
	String bgcolor = signup.getCssValue("Backgroundcolor");
	System.out.println(bgcolor );
	String fs = signup.getCssValue("Font-Size");
	System.out.println(fs);
	String ff = signup.getCssValue("Font-Family");
	System.out.println(ff);
	
	}

}
