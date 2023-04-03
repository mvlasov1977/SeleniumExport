// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class MyNewClass {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();

       /* //C:\Install\QATest\QAHomework\JavaAutotest
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver_32.exe" );

        //WebDriver driver = new FirefoxDriver();
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette",true);
         driver = new FirefoxDriver(capabilities); */

    }
    @After
    public void tearDown() {
        driver.quit();
        //driver1.quiit();
    }
    /* @Test
    public void checkdescriptionofgoods() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1623, 1019));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        assertThat(driver.findElement(By.cssSelector(".inventory_item:nth-child(5) .inventory_item_desc")).getText(), is("Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel."));
        driver.findElement(By.cssSelector("#item_2_title_link > .inventory_item_name")).click();
        assertThat(driver.findElement(By.cssSelector(".inventory_details_desc")).getText(), is("Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel."));
        driver.findElement(By.id("react-burger-menu-btn")).click();
        //driver.findElement(By.id("logout_sidebar_link")).click();

        //driver.findElement(By.id("user-name")).click();
        //assertTrue(driver.findElement(By.id("user-name")).isDisplayed());

    }
    @Test
    public void myCheck1() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1623, 1019));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Maks");
        driver.findElement(By.id("last-name")).sendKeys("Vlasov");
        driver.findElement(By.id("postal-code")).sendKeys("65009");
        driver.findElement(By.id("continue")).click();
        //summary_info_label summary_total_label; Total: $32.39
        assertEquals(driver.findElement(By.className("summary_total_label")).getText(),"Total: $32.39");
    } */
    @Test
    public void AT_Ordering_FinalHeader() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1674, 621));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Maks");
        driver.findElement(By.id("last-name")).sendKeys("Vlasov");
        driver.findElement(By.id("postal-code")).sendKeys("65009");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        assertEquals(driver.findElement(By.className("complete-header")).getText(),"Thank you for your order!");
    }
    @Test
    public void AT_Ordering_FinalText() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1674, 621));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Maks");
        driver.findElement(By.id("last-name")).sendKeys("Vlasov");
        driver.findElement(By.id("postal-code")).sendKeys("65009");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        assertEquals(driver.findElement(By.className("complete-text")).getText(),"Your order has been dispatched, and will arrive just as fast as the pony can get there!");
    }
    @Test
    public void AT_RemovingItemFromTheCart_StartPage() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1674, 621));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();

        if (driver.findElements(By.className("inventory_item_name")).size() > 0) {
            System.out.println("Warning! I don't expect items in the Cart, but I found: "+ driver.findElements(By.className("inventory_item_name")).size());
            for(int i = 0; i<driver.findElements(By.className("inventory_item_name")).size(); i++){
                assertNotEquals(driver.findElements(By.className("inventory_item_name")).get(i).getText(),"Sauce Labs Backpack");
            }
        }
    }
    @Test
    public void AT_RemovingItemFromTheCart_CartPage() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1674, 621));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        if (driver.findElements(By.className("inventory_item_name")).size() > 0) {
            System.out.println("Warning! I don't expect items in the Cart, but I found: "+ driver.findElements(By.className("inventory_item_name")).size());
            for(int i = 0; i<driver.findElements(By.className("inventory_item_name")).size(); i++){
                assertNotEquals(driver.findElements(By.className("inventory_item_name")).get(i).getText(),"Sauce Labs Backpack");
            }
        }

    }
}