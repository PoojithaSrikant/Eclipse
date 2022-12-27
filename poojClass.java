package Poojipackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class poojClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	    //WebDriver wd = new ChromeDriver();
         WebDriver wd = new ChromeDriver();
         wd.manage().window().maximize();
         wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(3000);
         wd.findElement(By.name("username")).sendKeys("Admin");
         wd.findElement(By.name("password")).sendKeys("admin123");
         wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
         Thread.sleep(2000);
         wd.findElement(By.linkText("PIM")).click();
         Thread.sleep(5000);
         wd.findElement(By.linkText("Dashboard")).click();
         Thread.sleep(3000);
         wd.findElement(By.linkText("Leave")).click();
         wd.findElement(By.linkText("Apply")).click();
         wd.findElement(By.xpath("//*[@class=\'oxd-select-text-input\'][2]")).click();
         
         
 	
 		
 		
}
}