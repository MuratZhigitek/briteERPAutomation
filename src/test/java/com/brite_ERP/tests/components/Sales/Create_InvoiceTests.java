package com.brite_ERP.tests.components.Sales;

import com.brite_ERP.pages.Sales.Create_InvoicePage;
import com.brite_ERP.pages.login_navigation.LoginPage;
import com.brite_ERP.utilities.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Create_InvoiceTests extends TestBase {


    @Test
   public void createInvoice(){



       LoginPage login = new LoginPage();
       Create_InvoicePage invoicePage = new Create_InvoicePage();


       String username = ConfigurationReader.getProperty("username");
       String password = ConfigurationReader.getProperty("password");

       login.login(username, password);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        brite_ERPUtils.navigateToModule(driver,"Sales");
        invoicePage.ordersElement.click();
        SeleniumUtils.waitFor(5);
        invoicePage.customerListElement.click();
        String count = invoicePage.invoiceCountElement.getText();
        System.out.println(count);
        SeleniumUtils.waitFor(5);
        invoicePage.actionBtnElement.click();
        SeleniumUtils.waitFor(3);
        invoicePage.invoiceOrderSelect.click();

        invoicePage.selectDownPaymentElement.click();
        SeleniumUtils.waitFor(3);
        invoicePage.percentInputElement.clear();
        invoicePage.percentInputElement.sendKeys("3");

        invoicePage.createInvoiceBtnElement.click();
        SeleniumUtils.waitPlease(3);
        String afterCount = invoicePage.invoiceCountElement.getText();
        System.out.println(afterCount);
        Assert.assertNotEquals(afterCount, count);


   }



}
