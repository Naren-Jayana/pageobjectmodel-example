package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfilePageObjects {
	
	@FindBy(xpath="//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")
	public static WebElement myProfile;
	@FindBy(xpath="//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")
	public static WebElement nickName;
	@FindBy(xpath="//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")
	public static WebElement saveButton;
	
	
	/*public static WebElement myProfile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a"));
		
	}
	public static WebElement nickName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input"));

	
	}
	public static WebElement saveButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button"));
	}*/
}


