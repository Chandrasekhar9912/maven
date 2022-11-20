package test_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testingo {
public static void main (String args[]) {
	/*WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https:\\google.com");*/
	
	
	int num=5;
	for(int i=0;i<=num;i++) {
		for(int j=num;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
