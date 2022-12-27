package Mav_pkg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Asst2_cls {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	    //WebDriver wd = new ChromeDriver();
         WebDriver wd = new ChromeDriver();
         wd.manage().window().maximize();
         wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(3000);
         //wd.getTitle();
         //String Actual_Title = wd.getTitle();
         //System.out.print(Actual_Title);
         //String Expected_Title = "OrangeHRM";
         //Assert.assertEquals(Actual_Title, Expected_Title);
         WebElement wb = wd.findElement(By.xpath("//*[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
         Assert.assertEquals(true, wb.isDisplayed());
         System.out.print("Assertion is passed");
         wd.quit();
         
         
         
 
}
}