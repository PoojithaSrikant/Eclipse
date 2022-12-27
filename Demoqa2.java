package Mav_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa2 {
	public static void main (String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		  WebDriver wd =new ChromeDriver();
		  wd.manage().window().maximize();
		  wd.get("https://demoqa.com/automation-practice-form");
		  wd.findElement(By.id("firstName")).sendKeys("jiyanshi");
		  wd.findElement(By.id("lastName")).sendKeys("gilagam");
		  wd.findElement(By.id("userEmail")).sendKeys("juhi2020@gmail.com");
		  wd.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[2]")).click();
		  wd.findElement(By.id("userNumber")).sendKeys("99555256544");
		  wd.findElement(By.id("dateOfBirthInput")).clear();
		  wd.findElement(By.id("dateOfBirthInput")).sendKeys("26SEP2020");
		  wd.findElement(By.xpath("//*[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("testing,python");
		  wd.findElement(By.id("hobbies-checkbox-3")).click();
		  

		  
		
	}

}
