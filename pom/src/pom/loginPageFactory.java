package pom;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

	public class loginPageFactory {

	
	@Test
	public void loginPageFactory () {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\pom\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.catch.com.au/shop/cheap-groceries/");
		 
		 
		 PageFactory.initElements(driver, pageFactorys.class);
		
		pageFactorys.product.sendKeys("t-shirt");
		pageFactorys.search.click();
		pageFactorys.quit();
	
	
	}}
	
	// pageFactorys.password.sendKeys("preach");