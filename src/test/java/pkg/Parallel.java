package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parallel {

	public static WebDriver driver;
	
	@Test @Parameters({"Program"})
	public void abc(String Program){
		
		
	driver= new ChromeDriver();
	driver.get(Program);
	
	driver.manage().window().maximize();	
	driver.quit();
	
		
	}
	
}
