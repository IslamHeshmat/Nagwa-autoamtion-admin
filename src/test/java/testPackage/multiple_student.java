package testPackage;


import org.testng.annotations.Test;

import pages.Analyticspage;
import pages.LoginPage;
import pages.NewStudent;
import pages.Users_Students_page;
public class multiple_student extends TestBase{
	
	LoginPage loginpageObject;
	Analyticspage analyticspageObject;
	Users_Students_page userpageObject;
	NewStudent newstudentObject;
	@Test(priority = 1)

	public void testSuccessfullyLogin()
	{

		loginpageObject = new LoginPage(driver);
		loginpageObject.FillTheEmail("localization.en.dj@nagwa.com");
		loginpageObject.ClickTheNextButton();
		loginpageObject.FillThePassword("123456");
		loginpageObject.ClickTheLoginButton();
		
	}
	@Test(priority = 2)
	
	public void testSuccessfullyOpningForTheUsesPage()
	{
		analyticspageObject = new Analyticspage(driver);
		analyticspageObject.openTheUsersPage();
	}
@Test(priority = 3)
	
	public void testSuccessfullyOpningForThestudentsPage()
	{
		analyticspageObject = new Analyticspage(driver);
		analyticspageObject.openTheStudentsPage();
	}

@Test(priority = 4)

public void testSuccessfullyOpningForAddstudentsPage()
{
	userpageObject = new Users_Students_page(driver);
	userpageObject.OpenAddStudentPage();
}

@Test(priority = 5)

public void testSuccessfullyAddingStudent()
{
	newstudentObject = new NewStudent(driver);
	newstudentObject.ClickOnMultipleButton();
	newstudentObject.ClickOnUploadButton();
}

}
