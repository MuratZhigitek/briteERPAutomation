package com.brite_ERP.pages.CRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Delete_OpportunityPage {

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement createInPipeline;

    //input customer name
    @FindBy (xpath = "//input[@name='name']")
    public WebElement opportunityTitleElement;

    //select Customer
    @FindBy (xpath = "//input[@id='o_field_input_30733']")
    public WebElement customerSelecElement;

    @FindBy (xpath = "//*[@id='ui-id-914']/a")
    public WebElement selectFromDropDown;
}
