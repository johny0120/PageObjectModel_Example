package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass{
	
	public static  WebElement userName(WebDriver driver) {
		return driver.findElement(By.id("email"));
 
	}
	
	public static  WebElement passWord(WebDriver driver) {
		return driver.findElement(By.id("pass"));
	}
	
	public  static  WebElement login(WebDriver driver) {
		return driver.findElement(By.name("login"));

    }}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	