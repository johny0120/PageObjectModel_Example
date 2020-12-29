package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageFactorys {
	
	@FindBy(id="catch-app-1")
	 public static WebElement product;
	//@FindBy(name="password")
	 public static WebElement password;
	@FindBy(xpath="//*[@id=\"primary-header\"]/div/div/div[1]/div[2]/button")
	 public static WebElement search;
	public static void quit() {
		// TODO Auto-generated method stub
		
	}
	
	 
	 

}
