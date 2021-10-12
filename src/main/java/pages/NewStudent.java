package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewStudent extends PageBase{

	public NewStudent(WebDriver driver) {
		super(driver);
	}
	private By StudentCodeTextButton =By.id("StudentID");
	private By FirstNameTextButton =By.id("FirstName");
	private By LastNameTextButton =By.id("LastName");
	private By UsernameTextButton =By.id("UserName");
	
	
	private By GradeDropDown =By.xpath("//input[@type='search']");
	private By SelectGrade =By.xpath("//li[@role='treeitem'][3]");
	
	private By ClassDropDown =By.xpath("//input[@placeholder='Select Classes'][1]");
	private By SelectClass =By.xpath("//li[@class='select2-results__option'][2]");
	private By SelectAnotherClass =By.xpath("//li[@class='select2-results__option'][1]");
	private By CreatStudentButton =By.id("AddSingleStudent");
	
	
	private By MultipleButton =By.xpath("//span[normalize-space()='Multiple']");
	private By UploadButton =By.xpath("//button[@id='btn_submit_upload']");
	
	
	public void FillTheStudentCodetextBox(String studentcode)
	{
		driver.findElement(StudentCodeTextButton).sendKeys(studentcode);
	}
	
	public void FillFirstNametextBox(String firstname)
	{
		driver.findElement(FirstNameTextButton).sendKeys(firstname);
	}
	public void FillLastNameTextButton(String lastname)
	{
		driver.findElement(LastNameTextButton).sendKeys(lastname);
	}
	public void FilluserNameTextButton(String username)
	{
		driver.findElement(UsernameTextButton).sendKeys(username);
	}
	public void FillGradeDropDown()
	{
		driver.findElement(GradeDropDown).click();
		driver.findElement(SelectGrade).click();
	}
	
	public void SelectClassDropDown()
	{
		driver.findElement(ClassDropDown).click();
		driver.findElement(SelectClass).click();
		driver.findElement(SelectAnotherClass).click();
		
	}
	public void ClickOnCreateButton()
	{
		driver.findElement(CreatStudentButton).click();
		
	}
	
	public void ClickOnMultipleButton()
	{
		driver.findElement(MultipleButton).click();
		
	}
	
	public void ClickOnUploadButton()
	{
		driver.findElement(UploadButton).click();
		
	}
}
