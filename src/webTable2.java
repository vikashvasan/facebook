import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();

	driver.get("http://demo.guru99.com/test/web-table-element.php");
	WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
	WebElement thead = table.findElement(By.tagName("thead"));
	WebElement trows = thead.findElement(By.tagName("tr"));
	List<WebElement> th = trows.findElements(By.tagName("th"));
	for (WebElement x : th) {
		String text = x.getText();
		System.out.print(text+"\t");
		
	}
	System.out.println();
WebElement tbody = driver.findElement(By.tagName("tbody"))	;
List<WebElement> tr = tbody.findElements(By.tagName("tr"));
for (WebElement x1 : tr) {
	String text1 = x1.getText();
	System.out.println(text1+"\t");
	
}
System.out.println();
	

	}

}
