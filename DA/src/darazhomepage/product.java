package darazhomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class product {
	
	private static WebElement element = null;
	
	public static WebElement book(WebDriver driver){
		
		element = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div/a/img"));
		return element;
	}
}