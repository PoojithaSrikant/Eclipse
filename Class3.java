package pkg3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe"); // setting the path for chrome driver
		WebDriver wd = new ChromeDriver();  // creating object for chrome driver
		wd.navigate().to("https://amazon.in"); // telling chrome driver navigate to particular website
		
		
		

	}

}
