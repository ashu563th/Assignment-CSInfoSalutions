package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class functionaltesting {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		driver.findElement(By.xpath("//div[@class='css-sukebr']/button")).click();
		
		
		
		driver.findElement(By.xpath("//a[@href='/mis/orders']")).click();
		
		
																																																																																																																																																																																																																																																																	
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='mui-7']")).sendKeys("C:\\Users\\Admin\\Downloads\\demo-data.xlsx");
		
		
		driver.findElement(By.xpath("//button[text()='Import']")).click();
		
		
	//	boolean ds=driver.findElement(By.xpath("//table[@class='MuiTable-root css-9177x2']")).isDisplayed();
		
		
		
		
		driver.findElement(By.xpath("// button[text()='Validate Data']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		
	driver.switchTo().alert().accept();
	
			TakesScreenshot ts= (TakesScreenshot)driver;
			
			File tempororyFile=ts.getScreenshotAs(OutputType.FILE);
			
			String timestamp=LocalDateTime.now().toString().replace(':', '-');
			
			System.out.println(timestamp);
			
			String path="./Screenshot1/"+timestamp+".png";
			File parmentFile =new File(path);
			
			FileUtils.copyFile(tempororyFile, parmentFile);
			System.out.println("testCase is passes");
		
		
	}
}