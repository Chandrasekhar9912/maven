package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
public static void main(String args[]) {
	WebDriverManager.chromedriver();
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	
}

}

