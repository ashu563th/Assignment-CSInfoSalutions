package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class emptychromelaunch
{
	public static void main(String [] args)
	{
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");
		//EdgeDriver driver = new EdgeDriver();
		
		//WebDriver driver = new ChromeDriver();
		 
		WebDriver driver = new EdgeDriver();
		
		
		
		
	}
}
