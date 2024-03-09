import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScenarioTwoLocators {

    WebDriver driver;
    public ScenarioTwoLocators(WebDriver dr){
        this.driver=dr;
    }

    public WebElement todayDeals(){
        return driver.findElement(By.cssSelector("div>div>a[data-csa-c-content-id=\"nav_cs_gb\"]"));
    }

    public WebElement popupDismiss(){
        return driver.findElement(By.xpath("//span[@class=\"a-button-inner\"]//input[@data-action-type=\"DISMISS\"]"));
    }

    public WebElement markHeadphones(){
        return driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[27]/label/input"));
    }

    public WebElement markGrocery(){
        return driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[26]/label/input"));
    }

    public WebElement discount(){
        return driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a/span"));
    }

    public WebElement nextButton (){
        return driver.findElement(By.xpath("//li[@class=\"a-last\"]//a[@href=\"#\"]"));
    }
}
