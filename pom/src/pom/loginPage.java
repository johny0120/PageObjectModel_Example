package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\pom\\Driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 
	
	 BaseClass.userName(driver).sendKeys("8056039733");
	 BaseClass.passWord(driver).sendKeys("preach");
	 BaseClass.login(driver).click();
	 

}}
