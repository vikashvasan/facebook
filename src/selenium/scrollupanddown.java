package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupanddown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	//	JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	//Thread.sleep(5000);
	//WebElement canon = driver.findElement(By.xpath("//h2[text()='Canon DSLR cameras']"));
	//String text = canon.getText();
	//System.out.println(text);
	//js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	//Thread.sleep(5000);
	WebElement findElement = driver.findElement(By.xpath("//div[text()='Connect with Us']"));
	JavascriptExecutor s1 = (JavascriptExecutor)driver;
	s1.executeScript("arguments[0].scrollIntoView(true)", findElement);
	String text = findElement.getText();
	System.out.println(text);
	
	}

}
