package DAtestNG;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import darazhomepage.DarazHomepage;
import darazhomepage.DarazLogin;
import darazhomepage.HomeAfterLogin;
import darazhomepage.ProductCheckout;
import darazhomepage.product;

public class NewTest {
    public String baseUrl = "https://www.daraz.pk/";
    String driverPath = "C:\\Users\\Emumba\\Desktop\\webdriverfirefox\\geckodriver.exe" ;
    public WebDriver driver ; 
     
  @Test (priority=0)
  public void DarazHomepage() {
       
      System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      DarazHomepage.login(driver).click();
      System.out.println("login page is accessed"); 
  }
  @Test (priority=1)
public void DarazLogin() throws InterruptedException {
	  DarazLogin.email(driver).sendKeys("bushraabad8@gmail.com");
      DarazLogin.password(driver).sendKeys("purple22");
      DarazLogin.loginbtn(driver).click();
    System.out.println("login is successful"); 
    Thread.sleep(2000);
}
  @Test (priority=2)
  public void HomeAfterLogin() throws InterruptedException {
	  HomeAfterLogin.searchbar(driver).sendKeys("A kite runner");
	  HomeAfterLogin.searchbtn(driver).click();
      System.out.println("product search is successful"); 
      Thread.sleep(2000);
  }
  @Test (priority=3)
  public void product() throws InterruptedException {
	  product.book(driver).click();
      System.out.println("product successfully added to cart");
      Thread.sleep(2000);
  }

  @Test (priority=4)
  public void ProductCheckout() throws InterruptedException {
	  ProductCheckout.addtocart(driver).click();
	  Thread.sleep(2000);
	  ProductCheckout.checkout(driver).click();
	  Thread.sleep(2000);
      System.out.println("successful checkout"); 
      driver.close();
	  driver.quit();
  }
  
}
