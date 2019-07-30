package com.brite_ERP.tests.login_navigation;

import com.brite_ERP.pages.login_navigation.LoginPage;
import com.brite_ERP.utilities.ConfigurationReader;
import com.brite_ERP.utilities.Driver;
import com.brite_ERP.utilities.SeleniumUtils;
import com.brite_ERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {



   @Test
    public void loginTest(){

        LoginPage loginPage = new LoginPage();
        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        loginPage.signInBtnElement.click();
        loginPage.login(userName, password);
        Assert.assertEquals(driver.getTitle(), "Odoo");


    }

}
