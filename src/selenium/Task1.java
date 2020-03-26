package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\GreensTechnology\\selenium\\driver\\geckodriver.exe" );
WebDriver s = new FirefoxDriver();
s.get("http://www.greenstechnologys.com/");
String t = s.getTitle();
System.out.println(t);
String q = s.getCurrentUrl();
System.out.println(q);
s.get("https://www.facebook.com/");
String t1 = s.getTitle();
System.out.println(t1);
String q1 = s.getCurrentUrl();
System.out.println(q1);;
s.get("https://www.amazon.in");
String t2 = s.getTitle();
System.out.println(t2);
String q2 = s.getCurrentUrl();
System.out.println(q2);
s.get("http://www.greenstechnologys.com/selenium-course-content.html");
String t3 = s.getTitle();
System.out.println(t3);
String q3 = s.getCurrentUrl();
System.out.println(q3);


s.close();
	}

}
