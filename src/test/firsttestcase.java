package test;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class firsttestcase {
	
	public static void main(String [] args) throws IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.getcalley.com/page-sitemap.xml");
	Dimension size = new Dimension(1920,1080);
	driver.manage().window().setSize(size);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File tempororyFile=ts.getScreenshotAs(OutputType.FILE);
	String timestamp=LocalDateTime.now().toString().replace(':','-');
	System.out.println(timestamp);
	String name="windows-1920-1080"+timestamp;
	System.out.println(name);
	String Path="./resolution4/"+name+".png";
			
	File parmentFile = new File(Path);
	
	FileUtils.copyFile(tempororyFile, parmentFile);
String	Url=driver.getCurrentUrl();
	if(Url.equals("https://www.getcalley.com/page-sitemap.xml"))
	{
   System.out.println("pass");
   
	}
	else {
	
  System.out.println("fail");
	}
	driver.close();
}

}	
	
	
	
	
	
	
	
	

 
	
 



