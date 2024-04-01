package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.LoginPageObjects;


public class LoginTest {
	@Test
	public void login () throws InterruptedException{
		System.setProperty("web.gecko.driver", "C:\\Users\\USER\\Desktop\\Driver\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.userName.sendKeys("Admin");
		LoginPageObjects.passWord.sendKeys("admin123");
		LoginPageObjects.loginButton.click();
		
		/*LoginPageObjects.userName(driver).sendKeys("Admin");
		LoginPageObjects.passWord(driver).sendKeys("admin123");
		LoginPageObjects.loginButton(driver).click();*/
		
		
		driver.close();

}
}