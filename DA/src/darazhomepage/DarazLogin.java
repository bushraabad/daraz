package darazhomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DarazLogin {
	
	private static WebElement element = null;
	
	public static WebElement email(WebDriver driver){
		
		element = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[1]/input"));
		return element;
	}
	public static WebElement password(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[2]/input"));
		return element;
	}
	public static WebElement loginbtn(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[1]/button"));
		return element;
	}
}
