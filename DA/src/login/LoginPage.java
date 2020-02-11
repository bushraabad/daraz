package login;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import darazhomepage.DarazHomepage;
import darazhomepage.DarazLogin;
import darazhomepage.HomeAfterLogin;
import darazhomepage.ProductCheckout;
import darazhomepage.product;

public class LoginPage {
	private static WebDriver driver = null;


    public static void main(String[] args) throws InterruptedException {
       
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Emumba\\Desktop\\webdriverfirefox\\geckodriver.exe");
		driver = new FirefoxDriver();
        String baseUrl = "https://www.daraz.pk/";
        String actualTitle = "";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        DarazHomepage.login(driver).click();
        DarazLogin.email(driver).sendKeys("bushraabad8@gmail.com");
        DarazLogin.password(driver).sendKeys("purple22");
        DarazLogin.loginbtn(driver).click();
        Thread.sleep(4000);
        HomeAfterLogin.searchbar(driver).sendKeys("A kite runner");
        Thread.sleep(1000);
        HomeAfterLogin.searchbtn(driver).click();
        Thread.sleep(1000);
        product.book(driver).click();
        Thread.sleep(1000);
        ProductCheckout.addtocart(driver).click();
        Thread.sleep(1000);
        ProductCheckout.checkout(driver).click();
        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}
