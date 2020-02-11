package darazhomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeAfterLogin {
	
	private static WebElement element = null;
	
	public static WebElement searchbar(WebDriver driver){
		
		element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div/div[2]/form/div/div[1]/input[1]"));
		return element;
	}
		public static WebElement searchbtn(WebDriver driver){
			
			element = driver.findElement(By.xpath("//*[@id=\"topActionHeader\"]/div/div[2]/div/div[2]/form/div/div[2]/button"));
			return element;
}
}