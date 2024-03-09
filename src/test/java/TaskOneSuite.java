import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TaskOneSuite {
    WebDriver driver = new ChromeDriver();
    ScenarioOneLocators hooks = new ScenarioOneLocators(driver);
    ScenarioTwoLocators stl = new ScenarioTwoLocators(driver);
    SoftAssert soft = new SoftAssert();

    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver.manage().window().setSize(new Dimension(1024,768));
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test (priority = 1)
    public void addItemToCart() {
        hooks.activeSearchField().click();
        hooks.activeSearchField().sendKeys("car accessories");
        hooks.clickSearch().click();
        hooks.firstItem().click();
        hooks.addToCartBtn().click();
    }


    @Test (priority = 2)
    public void itemInCart() {

        hooks.goToCart().click();
        String expected = "Subtotal (1 item):";
        String actual = driver.findElement(By.xpath("//*[@id=\"sc-subtotal-label-activecart\"]")).getText();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actual.contains(expected),true,"Item added to cart successfully assertion..");
        soft.assertAll();
    }

    @Test (priority = 3)
    public void todayDeal() throws InterruptedException {
        stl.popupDismiss().click();
        stl.todayDeals().click();
        stl.markHeadphones().click();
        stl.markGrocery().click();
        stl.discount().click();
        for (int i = 1; i <= 4; i++)
        {
            WebElement nextButton = stl.nextButton();
            boolean nextBtnIsClickable = nextButton.isDisplayed();
            soft.assertTrue(nextBtnIsClickable, "The button is enabled and nextBtnIsClickable");
            nextButton.click();
            Thread.sleep(2000);
            soft.assertAll();
        }
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
