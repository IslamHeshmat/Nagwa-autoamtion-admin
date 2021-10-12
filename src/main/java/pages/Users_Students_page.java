package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Users_Students_page extends PageBase{

	public Users_Students_page(WebDriver driver) {
		super(driver);
		
	}
	//private By AddNewStudentButton =By.partialLinkText("New Student");
	private By AddNewStudentButton =By.xpath("//i[@class='f-icon plus-icon']");
	
	
	public void OpenAddStudentPage()
	{
		driver.findElement(AddNewStudentButton).click();
	}
	
}
