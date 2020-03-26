package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
	
WebDriver a = new ChromeDriver();
a.get("http://www.greenstechnologys.com/");
a.get("http://gmail.com/");
a.get("http://www.flipkart.com/");
a.get("http://www.greenstechnologys.com/selenium-course-content.html");
a.close();
	}

}
