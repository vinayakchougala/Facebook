package Punter;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogintoAppTest 
{
   @Test
   public void tc1()
   {
	   
	   WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.manage().window().maximize();
		 driver.close();
}
	
}
	
