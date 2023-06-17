package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getalloptions {
public static void main(String [] args)
{
	System.setProperty("webdriver.chrome.driver.driver", "./seleniumsoftware/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/Admin/Documents/.html");
	WebElement dropDown = driver.findElement(By.id("m1"));
	Select select
	
}
}
