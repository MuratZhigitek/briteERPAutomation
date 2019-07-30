package com.brite_ERP.pages.login_navigation;

import com.brite_ERP.utilities.ConfigurationReader;
import com.brite_ERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Long.valueOf(ConfigurationReader.getProperty("explicitwait")));

    @FindBy(xpath = "//a[*='Sign in']")
    public WebElement signInBtnElement;

    @FindBy(xpath = "//input[@id='login']")
    public WebElement userNameElement;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordElement;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginBtnElement;

    public  LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(String username, String password){


        signInBtnElement.click();
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginBtnElement.click();

    }

    public void clickSignInButton(){

        wait.until(ExpectedConditions.elementToBeClickable(signInBtnElement));
        if(!signInBtnElement.isSelected()) {
            signInBtnElement.click();
        }
    }


}
