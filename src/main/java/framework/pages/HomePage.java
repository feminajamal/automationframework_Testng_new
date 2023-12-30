package framework.pages;

import framework.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    public HomePage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#menu-item-1311 > a")
    WebElement loginLink;

    @FindBy(css = "#menu-item-1314 > a")
    WebElement username;

    public void clickLogin(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        loginLink.click();
        wait.withTimeout(Duration.ofSeconds(60));
    }

    public String getUsername() {
        return username.getText();
    }
}
