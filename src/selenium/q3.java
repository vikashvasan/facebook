package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class q3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "F:\\GreensTechnology\\selenium\\driver\\IEDriverServer.exe");
		WebDriver b = new InternetExplorerDriver();
		b.get("http://www.greenstechnologys.com/");
		b.get("http://demo.automationtesting.in/Register.html");
		b.get("http://www.greenstechnologys.com/selenium-course-content.html");
		b.close();
	}

}
