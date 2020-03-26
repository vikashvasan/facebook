import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mwh2 {

		

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
			 WebDriver driver= new ChromeDriver();
			 
			 driver.manage().window().maximize();

		driver.get("https://www.amazon.in/?ref=icp_country_us_c");
		
		String fid = driver.getWindowHandle();
		System.out.println(fid);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[5]")).click();
		 Thread.sleep(3000);
		 Set<String> pid = driver.getWindowHandles();
		 System.out.println(pid);
		
		 for (String x : pid) {
			 driver.switchTo().window(x);
			 String title = driver.getTitle();
			 if (title.contains("Samsung")) {
				driver.findElement(By.id("add-to-cart-button")).click();}
				else if (title.contains("Redmi")) {
					driver.findElement(By.id("buy-now-button")).click();
					
					
					
				}
			}
			
		}
	
					
				}
				
			
		
			
		
		
		
	


