package com.brite_ERP.tests.components.Sales;

import com.brite_ERP.pages.Sales.Create_InvoicePage;
import com.brite_ERP.pages.Sales.Edit_InvoicePage;
import com.brite_ERP.pages.login_navigation.LoginPage;
import com.brite_ERP.utilities.ConfigurationReader;
import com.brite_ERP.utilities.SeleniumUtils;
import com.brite_ERP.utilities.TestBase;
import com.brite_ERP.utilities.brite_ERPUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Edit_InvoiceTest extends TestBase {





    @Test
    public void EditInvoice() {

        LoginPage login = new LoginPage();
        Create_InvoicePage createInvoice = new Create_InvoicePage();
        Edit_InvoicePage editInvoice = new Edit_InvoicePage();


        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        login.login(username, password);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        brite_ERPUtils.navigateToModule(driver,"Sales");
        createInvoice.ordersElement.click();
        SeleniumUtils.waitPlease(3);
        createInvoice.customerListElement.click();
        SeleniumUtils.waitPlease(5);

        //String initialUnitPriceAmount = editInvoice.unitPriceAmountElement.getText();
        //SeleniumUtils.waitForClickablility(editInvoice.editBtnElement, 5);
        editInvoice.editBtnElement.click();
        SeleniumUtils.waitPlease(2);
        String initialorderedQuantityAmount = editInvoice.orderedQuantityAmountElement.getText();
        System.out.println(initialorderedQuantityAmount);
        SeleniumUtils.waitPlease(2);
        editInvoice.firstInvoiceElement.click();
        SeleniumUtils.waitPlease(3);
        editInvoice.orderedQuantityElement.clear();
        editInvoice.orderedQuantityElement.sendKeys("1600");
        SeleniumUtils.waitPlease(3);
        editInvoice.unitPriceElement.clear();
        editInvoice.unitPriceElement.sendKeys("150");

        editInvoice.saveBtnElement.click();
        SeleniumUtils.waitPlease(2);

        String afterorderedQuantityAmount = editInvoice.orderedQuantityAmountElement.getText();

        System.out.println(afterorderedQuantityAmount);
        Assert.assertNotEquals(afterorderedQuantityAmount, initialorderedQuantityAmount);

    }

}
