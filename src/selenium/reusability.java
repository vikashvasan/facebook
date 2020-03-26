package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class reusability {

	public void Displayed(WebElement Element,String Sendkeys) {
boolean displayed = Element.isDisplayed();
boolean enabled = Element.isEnabled();
System.out.println(displayed);
System.out.println(enabled);
if (displayed&&enabled) {
	Element.sendKeys(Sendkeys);
	
}
	}

	}


