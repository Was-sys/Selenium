package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class SwagLabsD extends BaseTest {
	
	@Test(dataProvider="testdata")
	public static void loginTest(String username,String password) throws InterruptedException {
	if (driver != null)	{
	driver.findElement(By.id(locators.getProperty("username"))).sendKeys( username);
    driver.findElement(By.id(locators.getProperty("password"))).sendKeys(password);
    driver.findElement(By.id(locators.getProperty("login_button"))).click();
    }
	
}
	@DataProvider(name="testdata")
	public Object[][] tData()
	{
		return new Object [][] {
			
			{"standard_user","secret_saucen"},
			{"standard_uswer","secret_sauce"},
			{"standard_useer","secret_saucem"},
			{"standard_user","secret_sauce"},
		};
	}
	
 
}
