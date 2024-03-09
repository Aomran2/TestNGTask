import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class TaskTwoSuite {

    WebDriver driver = new ChromeDriver();
    TaskTwoLocators pull = new TaskTwoLocators(driver);

    public void customerDetails(String mobileNumber, String email){
        pull.mobNumber().sendKeys(mobileNumber);
        pull.email().sendKeys(email);
    }


    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }


    @Test (priority = 1)
    public void searchForBuses() throws InterruptedException{
        pull.selectRoute().click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(2));
        wait.until(ExpectedConditions.visibilityOf(pull.selectRoute()));
        pull.selectDate().click();
        pull.busSearch().click();
        Thread.sleep(3000);
    }

    @Test (priority = 2)
    public void seatInteracting ()  throws InterruptedException{

        pull.seat().click();

        pull.seatNumber().click();
        Thread.sleep(10000);
    }

    @Test (priority = 3)
    public void choosePoints() throws InterruptedException {

        pull.boardingPoints().click();
        pull.chooseBoardingPoint().click();
        pull.boardingPoints().click();
        pull.droppingPoints().click();
        pull.chooseDroppingPoint().click();
        Thread.sleep(3000);
    }

    @Test (priority = 4)
    public void customerDetails() throws InterruptedException {

        pull.customerDetailsWidget().click();
        pull.mobNumber().click();
        pull.mobNumber().sendKeys("6789125987");
        pull.email().click();
        pull.email().sendKeys("person@email.com");
        Thread.sleep(3000);
    }

    @Test (priority = 5)
    public void passengerDetails() throws InterruptedException {

        pull.passengerName().sendKeys("Hindi");
        WebElement option = pull.selectGender().findElement(By.cssSelector("option[value=\"24\"]"));
        option.click();
        pull.age().sendKeys("25");
        pull.selectConcession().click();
        pull.generalPublic().click();
        Thread.sleep(5000);
    }

    @Test (priority = 6)
    public void payment() throws InterruptedException {

        pull.termsConditions().click();
        pull.makePayment().click();
        Thread.sleep(3000);
    }



    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
