package verifyhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify1 {
@Test
public void loginTest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGESH\\Desktop\\TESTING\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	WebElement usernametxt=driver.findElement(By.name("userName"));
	WebElement passwordtxt=driver.findElement(By.name("password"));
	usernametxt.sendKeys("mercury");
	passwordtxt.sendKeys("mercury");
	String expected_title="Welcome: Mercury Tours";
	Assert.assertEquals(expected_title,driver.getTitle());
	driver.close();
}

}
