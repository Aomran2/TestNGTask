import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskTwoLocators {

    WebDriver driver;
    public TaskTwoLocators(WebDriver dri){
        this.driver = dri;
    }

    public WebElement selectRoute(){
        return driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a"));
    }

    public WebElement selectDate(){
        return driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[5]/td[7]/a"));
    }

    public WebElement busSearch(){
        return driver.findElement(By.cssSelector("button[class=\"btn btn-primary btn-lg btn-block btn-booking\"]"));
    }

    public WebElement seat(){
        return driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[1]/div[1]/div[3]/div/input[4]"));
    }

    public WebElement seatNumber(){
        return driver.findElement(By.cssSelector("li[title=\"30(A,S)\"]>span[class=\"seatNumber\"]"));
    }

    public WebElement boardingPoints(){
        return driver.findElement(By.cssSelector("span[id=\"BpFid\"]"));
    }

    public WebElement chooseBoardingPoint(){
        return driver.findElement(By.cssSelector("input[id=\"BoardingPoint885\"]"));
    }

    public WebElement droppingPoints(){
        return driver.findElement(By.cssSelector("span[id=\"DpFid\"]"));
    }

    public WebElement chooseDroppingPoint(){
        return driver.findElement(By.cssSelector("input[id=\"DroppingPoint560\"]"));
    }

    public WebElement customerDetailsWidget(){
        return driver.findElement(By.cssSelector("a[id=\"Forwardprofile-tab\"]"));
    }

    public WebElement mobNumber(){
        return driver.findElement(By.xpath("//input[@name=\"mobileNo\"]"));
    }

    public WebElement email(){
        return driver.findElement(By.cssSelector("input[id=\"email\"]"));
    }

    public WebElement passengerName(){
        return driver.findElement(By.cssSelector("input[name=\"passengerName\"]"));
    }

    public WebElement selectGender(){
        return driver.findElement(By.cssSelector("select[id=\"genderCodeIdForward0\"]"));
    }

    public WebElement age(){
        return driver.findElement(By.cssSelector("input[id=\"passengerAgeForward0\"]"));
    }

    public WebElement selectConcession(){
        return driver.findElement(By.cssSelector("select[id=\"concessionIdsForward0\"]"));
    }

    public WebElement generalPublic(){
        return driver.findElement(By.xpath("//*[@id=\"concessionIdsForward0\"]/option[2]"));
    }

    public WebElement termsConditions(){
        return driver.findElement(By.cssSelector("input[id=\"termsChk\"]"));
    }

    public WebElement makePayment(){
        return driver.findElement(By.cssSelector("input[id=\"PgBtn\"]"));
    }

}
