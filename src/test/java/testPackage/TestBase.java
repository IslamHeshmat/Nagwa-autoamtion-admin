package testPackage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestBase {

    public static WebDriver driver;


    @BeforeClass
    public void setUp(){
    	
    	System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"/resources/chromedriver.exe");
    	
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admins.nagwa.com/");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

       
    }

/*    @AfterClass
    public void tearDown(){
        driver.quit();
    }*/
}