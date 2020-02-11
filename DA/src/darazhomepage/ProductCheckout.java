package darazhomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCheckout {
	
	private static WebElement element = null;
	
	public static WebElement addtocart(WebDriver driver){
		
		element = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div/div[1]/div[14]/div/button[2]/span/span"));

		return element;
	}
public static WebElement checkout(WebDriver driver){
		
		element = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/button[1]"));

		return element;
	}
}