import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScenarioOneLocators {

        WebDriver driver;
        public ScenarioOneLocators(WebDriver dr){
            this.driver = dr;
        }

        public WebElement clickSearch(){
            return driver.findElement(By.cssSelector("input[id=\"nav-search-submit-button\"]"));
        }

        public WebElement activeSearchField(){
            return driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        }

        public WebElement firstItem(){
            return driver.findElement(By.xpath("//div[@data-index=\"3\"]"));
        }

        public WebElement addToCartBtn(){
            return driver.findElement(By.cssSelector("span>span[class=\"a-button-inner\"]>input[id=\"add-to-cart-button\"]"));
        }

        public WebElement goToCart(){
            return driver.findElement(By.xpath("//div[@id=\"nav-cart-count-container\"]"));
        }

    }



