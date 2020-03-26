package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelRegistraion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTechnology\\selenium\\driver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://adactin.com/HotelApp/SearchHotel.php");
WebElement username = driver.findElement(By.name("username"));
username.sendKeys("vallikannan");
WebElement password = driver.findElement(By.name("password"));
password.sendKeys("12345678");
WebElement login = driver.findElement(By.name("login"));
login.click();
WebElement location = driver.findElement(By.name("location"));
location.sendKeys("london");
WebElement hotels = driver.findElement(By.name("hotels"));
hotels.sendKeys("hotel creek");
WebElement room_type = driver.findElement(By.name("room_type"));
room_type.sendKeys("super deluxe");
WebElement room_nos = driver.findElement(By.name("room_nos"));
room_nos.sendKeys("2");
WebElement datepick_in = driver.findElement(By.name("datepick_in"));
datepick_in.sendKeys("23/04/2020");
WebElement datepick_out = driver.findElement(By.name("datepick_out"));
datepick_out.sendKeys("25/04/2020");
WebElement adult_room = driver.findElement(By.name("adult_room"));
adult_room.sendKeys("2");
WebElement child_room = driver.findElement(By.name("child_room"));
child_room.sendKeys("2");
WebElement Submit = driver.findElement(By.name("Submit"));
Submit.click();
WebElement radiobutton_0 = driver.findElement(By.name("radiobutton_0"));
radiobutton_0.click();
WebElement continue1 = driver.findElement(By.name("continue"));
continue1.click();
WebElement first_name = driver.findElement(By.name("first_name"));
first_name.sendKeys("vallikannan");
WebElement last_name = driver.findElement(By.name("last_name"));
last_name.sendKeys("vasan");
WebElement address = driver.findElement(By.name("address"));
address.sendKeys("123 aha gnna  habbg agb ag");
WebElement cc_num = driver.findElement(By.name("cc_num"));
cc_num.sendKeys("1234567890123456");
WebElement cc_type = driver.findElement(By.name("cc_type"));
cc_type.sendKeys("master card");
WebElement cc_exp_month = driver.findElement(By.name("cc_exp_month"));
cc_exp_month.sendKeys("october");
WebElement cc_exp_year = driver.findElement(By.name("cc_exp_year"));
cc_exp_year.sendKeys("2022");
WebElement cc_cvv = driver.findElement(By.name("cc_cvv"));
cc_cvv.sendKeys("023");
WebElement book_now = driver.findElement(By.name("book_now"));
book_now.click();
WebElement search_hotel = driver.findElement(By.name("search_hotel"));
search_hotel.click();






	}

}
