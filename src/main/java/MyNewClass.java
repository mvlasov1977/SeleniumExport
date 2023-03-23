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
    }
    @After
    public void tearDown() {
        driver.quit();
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
    public void AT_CreateUser() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().window().setSize(new Dimension(1623, 1019));
        driver.findElement(By.className("btn-outline-white")).click();
        assertEquals(driver.findElement(By.className("modal-title")).getText(),"Log in");
        //assertEquals(driver.findElements(By.className("btn-link")).get(1).getText(),"Registration");
        driver.findElements(By.className("btn-link")).get(1).click();
        //assertEquals(driver.findElement(By.className("modal-title")).getText(),"Registration");
        driver.findElement(By.id("signupName")).sendKeys("Maks");
        driver.findElement(By.id("signupLastName")).sendKeys("Vlasov");
        driver.findElement(By.id("signupEmail")).sendKeys("maks@vlasov.ua");
        driver.findElement(By.id("signupPassword")).sendKeys("Qwerty12345");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Qwerty12345");
        driver.findElement(By.id("signupEmail")).click();
        driver.findElements(By.className("btn-primary")).get(1).click();

        //System.out.println(driver.getPageSource());

        //assertEquals(driver.findElement(By.className("dropdown-toggle")).getText(),"My profile");
        //assertNotEquals(driver.findElement(By.className("alert-danger")).getText(),"User already exists");
        //assertEquals(driver.findElement(By.className("panel-empty_message")).getText() , "You don’t have any cars in your garage");
    }
    @Test
    public void AT_DeleteUser() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().window().setSize(new Dimension(1623, 1019));
        //System.out.println(driver.getTitle()+" "+driver.getCurrentUrl()+" "+driver.getPageSource());

        driver.findElement(By.className("btn-outline-white")).click();

        //assertEquals(driver.findElement(By.className("modal-title")).getText(),"Log in");
        driver.findElement(By.id("signinEmail")).click();
        driver.findElement(By.id("signinEmail")).sendKeys("maks@vlasov.ua");
        driver.findElement(By.id("signinPassword")).click();
        driver.findElement(By.id("signinPassword")).sendKeys("Qwerty12345");
        //driver.findElement(By.id("signinEmail")).click();
        //System.out.println(driver.getPageSource());

        //driver.findElement(By.cssSelector(".btn-primary:nth-child(2)")).click();
        System.out.println(driver.getPageSource());
        driver.findElements(By.className("btn-primary")).get(1).click();

        System.out.println(driver.getPageSource());


        //driver.findElement(By.linkText("Settings")).click();
        //driver.findElement(By.cssSelector(".btn-danger-bg")).click();
        //driver.findElement(By.cssSelector(".btn-danger")).click();

        //btn btn-white btn-sidebar sidebar_btn /panel/settings
        //assertEquals(driver.findElement(By.tagName("You have been successfully logged in")).getText(),"Log in");
        //assertEquals(driver.findElement(By.className("modal-title")).getText(),"qqq");
        //assertEquals(driver.findElement(By.className("panel-empty_message")).getText() , "You don’t have any cars in your garage");

    }
}