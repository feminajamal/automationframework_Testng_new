package framework.pages;

import framework.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    private WebDriver driver;
    public SignInPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "body > div.xoo-el-container.xoo-el-popup-active > div.xoo-el-modal > div > div > div.xoo-el-srcont > div.scroll-content > div > div > div.xoo-el-section.xoo-el-active > div > form > div.xoo-aff-group.xoo-aff-cont-text.one.xoo-aff-cont-required.xoo-el-username_cont > div > input")
    WebElement signInEmail;
    @FindBy(css = "body > div.xoo-el-container.xoo-el-popup-active > div.xoo-el-modal > div > div > div.xoo-el-srcont > div.scroll-content > div > div > div.xoo-el-section.xoo-el-active > div > form > div.xoo-aff-group.xoo-aff-cont-password.one.xoo-aff-cont-required.xoo-el-password_cont > div > input")
    WebElement password;
    @FindBy(css = "body > div.xoo-el-container.xoo-el-popup-active > div.xoo-el-modal > div > div > div.xoo-el-srcont > div.scroll-content > div > div > div.xoo-el-section.xoo-el-active > div > form > button")
    WebElement signInButton;

    public void login(String email, String password){
        signInEmail.sendKeys(email);
        this.password.sendKeys(password);
        signInButton.click();
    }

}
