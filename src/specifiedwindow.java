import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class specifiedwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();

	driver.get("https://www.amazon.in/?ref=icp_country_us_c");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
	driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
	Set<String> pid = driver.getWindowHandles();
	System.out.println(pid);
	ArrayList<String> li = new ArrayList<String>();
	li.addAll(pid);
	driver.switchTo().window(li.get(1));
	String title = driver.getTitle();
	System.out.println(title);
	Thread.sleep(7000);
	driver.quit();
	}

}
