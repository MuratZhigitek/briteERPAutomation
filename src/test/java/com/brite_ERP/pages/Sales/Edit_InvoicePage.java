package com.brite_ERP.pages.Sales;

import com.brite_ERP.tests.components.Sales.Edit_InvoiceTest;
import com.brite_ERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_InvoicePage {

    @FindBy (xpath = "//button[@accesskey='a']")
    public WebElement editBtnElement;

    @FindBy(xpath = "//table//tbody/tr/td[3]")   //"//tr[@class='o_data_row'][1]")
    public WebElement firstInvoiceElement;

    //to get initial and after quantity amount
    @FindBy (xpath = "//table//tbody/tr[1]/td[4]")
    public WebElement orderedQuantityAmountElement;

    //to get initial and after quantity amount
    @FindBy(xpath = "//table//tbody//td[7]")
    public WebElement unitPriceAmountElement;

    //input random number
    @FindBy (xpath = "//input[@name='product_uom_qty']")
    public WebElement orderedQuantityElement;

    //input random number
    @FindBy (xpath = "//input[@name='price_unit']")
    public WebElement unitPriceElement;

    @FindBy (xpath = "//span[contains(text(),'Save')]")
    public WebElement saveBtnElement;

    public Edit_InvoicePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
}
