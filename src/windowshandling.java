import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();

	driver.get("https://www.amazon.in/?ref=icp_country_us_c");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
	Thread.sleep(5000);
	Set<String> pid = driver.getWindowHandles();
	for (String x : pid) {
		if (!x.equals(pid)) {
			driver.switchTo().window(x);
			System.out.println(x);
			
		}
		
	}
	driver.findElement(By.id("buy-now-button")).click();
	Thread.sleep(5000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	}

}
