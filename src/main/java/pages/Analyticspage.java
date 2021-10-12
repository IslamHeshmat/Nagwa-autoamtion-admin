package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Analyticspage extends PageBase{

	public Analyticspage(WebDriver driver) {
		super(driver);
		
	}
	private By usersButton =By.linkText("Users");
	private By studentsButton =By.linkText("Students");

	public void openTheUsersPage()
	{
		driver.findElement(usersButton).click();
	}
	
	public void openTheStudentsPage()
	{
		driver.findElement(studentsButton).click();
	}
}
