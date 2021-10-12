package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	private By email_text_box =By.id("Username");
	private By password_text_box =By.id("password");
	private By nextbutton =By.id("btnNext");
	private By Loginbutton =By.id("btnSignin");
	

	
	
	
		public void FillTheEmail(String username)
		{
			driver.findElement(email_text_box).sendKeys(username);
		}
		public void FillThePassword(String password)
		{
			driver.findElement(password_text_box).sendKeys(password);
		}
		public void ClickTheNextButton()
		{
			driver.findElement(nextbutton).click();
		}
		
		public void ClickTheLoginButton()
		{
			driver.findElement(Loginbutton).click();
		}
}