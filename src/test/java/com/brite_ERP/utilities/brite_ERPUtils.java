package com.brite_ERP.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class brite_ERPUtils {

    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param driver
     * @param tab

     */
    public static void navigateToModule(WebDriver driver, String tab) {
        String tabLocator = "//span[contains(text(),'"+tab+"') and contains (@class,'oe_menu_text')]";
//        driver.findElement(By.xpath(tabLocator)).click();
        SeleniumUtils.clickWithWait(driver, By.xpath(tabLocator), 5);
//        SeleniumUtils.waitPlease(1);
    }



}
