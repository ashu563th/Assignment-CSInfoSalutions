package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod 
{
	public static void main(String [] args)
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
	}
	
	

}