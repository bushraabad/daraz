package darazhomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DarazHomepage {
	
	private static WebElement element = null;
	public static Object login;
	
	public static WebElement login(WebDriver driver){
		
		element = driver.findElement(By.id("anonLogin"));
		return element;
		
	}
}