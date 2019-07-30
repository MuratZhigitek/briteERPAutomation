package com.brite_ERP.pages.Sales;

import com.brite_ERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Create_InvoicePage {


    @FindBy (xpath = "//a[@href='/web#menu_id=467&action=620']")
    public WebElement ordersElement;

    @FindBy (xpath = "//table//tbody/tr[15]")
    public WebElement customerListElement;

    @FindBy (xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement actionBtnElement;

    @FindBy (xpath = "//a[contains(text(),'Invoice Order')]")
    public WebElement invoiceOrderSelect;

    @FindBy (xpath = "//div[@class='o_radio_item'][3]")
    public WebElement selectDownPaymentElement;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement percentInputElement;

    @FindBy (xpath = "//span[contains(text(),'Create Invoices')]")
    public WebElement createInvoiceBtnElement;

    @FindBy (xpath = "//div[@name ='invoice_count']")  //"(//span[@class ='o_stat_value'])[2]")
    public WebElement invoiceCountElement;

//    @FindBy (xpath = "//span[contains(text(),'Create and View Invoices')]")
//    public WebElement createAndViewBtnLocator;
//
//    @FindBy (xpath = "//button[contains(text(),'Validate')]")
//    public WebElement validateBtnElement;
//
//
//    @FindBy (xpath = "//span[@name='number']")
//    public WebElement invoiceConfirmationLocation;
//
//    @FindBy (xpath = "//tbody[@class='ui-sortable']")
//    public WebElement multipleOrdersElement;
//
//    @FindBy (xpath = "(//tr[@class='o_data_row text-info'])[2]")
//    public WebElement selectOneFromMultipleInvoices;

    public Create_InvoicePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


}
