package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_script {
	public WebDriver driver;
	@BeforeMethod
	public void openappln()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver32.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void Closeappln()
	{
		driver.close();
	}

}
