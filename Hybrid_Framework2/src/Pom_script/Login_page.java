package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Base_page;

public class Login_page extends Base_page
{
	 
		@FindBy(id="username")
		private WebElement unTbox;
		@FindBy(name="pwd")
		private WebElement pwdTbox;
		@FindBy(xpath="//div[.='Login ']")
		private WebElement loginbtn;
		public Login_page(WebDriver driver)
		
		{
			super(driver);
			
		}
		public void unData(String un)
		{
			unTbox.sendKeys("admin");
		}
		public void pwdData(String pwd)
		{
			pwdTbox.sendKeys("manager");
		}
		public void clickLogin()
		{
			loginbtn.click();
		}

	}

