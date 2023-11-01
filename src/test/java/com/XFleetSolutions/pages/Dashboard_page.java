package com.XFleetSolutions.pages;

import com.XFleetSolutions.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Dashboard_page extends Login_page {




    public Dashboard_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//ul[@class=\"nav-multilevel main-menu\"]/li[normalize-space(\"Fleet\")]")
    public WebElement fleet;

//this must be pressed if this not pressed (class= "action btn mode-icon-only pressed")
    @FindBy(xpath = "//a[@title=\"Filters\"]")
    public WebElement enableFiltersButton;
    @FindBy(xpath = "(//span[@class=\"title title-level-2\"])[.=\"Vehicles\"]")
    public WebElement vehicles;

    @FindBy(className = "add-filter-button")
    public WebElement manageFilterBtn;
    //click
    @FindBy(xpath = "//input[@type =\"search\"]")
    public WebElement searchBox;
    //send keys
    @FindBy(xpath = "//input[@value =\"LastOdometer\"]")
    public WebElement lastOdometerChkbox;
    @FindBy(xpath = "//button[@class=\"btn dropdown-toggle\"]")

    public WebElement optionEnabler;
    @FindBy(xpath = "//div[@class=\"filter-item oro-drop\"][1]")
    public WebElement lastOdometerDropButton;

    @FindBy(xpath = "//label[@class=\"dib\"][3]")
    public WebElement resultRecords;

//this is The List
    @FindBy(xpath = "//a[@class=\"dropdown-item choice-value\"]") //all 10 options list
    public List<WebElement> lastOdometerDropOptions;
    @FindBy(xpath = "//ul[@class=\"dropdown-menu\"]//a[@class=\"dropdown-item choice-value\"]")
    public WebElement allOptions;
    //The dropdown is html so i need all options
    @FindBy(xpath = "//a[.=\"between\"]")
    public WebElement between;
    @FindBy(xpath = "//a[.=\"not between\"]")
    public WebElement not_between;
    @FindBy(xpath = "//a[.=\"equals\"]")
    public WebElement equals;
    @FindBy(xpath = "//a[.=\"not equals\"]")
    public WebElement not_equals;
    @FindBy(xpath = "//a[.=\"more than\"]")
    public WebElement more_than;
    @FindBy(xpath = "//a[.=\"less than\"]")
    public WebElement less_than;
    @FindBy(xpath = "//a[.=\"equals or more than\"]")
    public WebElement equals_or_more_than;
    @FindBy(xpath = "//a[.=\"equals or less than\"]")
    public WebElement equals_or_less_than;
    @FindBy(xpath = "//a[.=\"is empty\"]")
    public WebElement is_empty;
    @FindBy(xpath = "//a[.=\"is not empty\"]")
    public WebElement is_not_empty;
    //10 elements here



    //Beween filter module contains min value max value and update button
    //should accept numbers only
    @FindBy(xpath = "//div[@class=\"filter-start\"]")
    public WebElement betweenFilterStartValue;
    //should accept numbers only
    @FindBy(xpath = "//div[@class=\"filter-end\"]")
    public WebElement betweenFilterEndValue;
    //click
    @FindBy(xpath = "//button[@class=\"btn btn-primary filter-update\"]")
    public WebElement updateButton;

}
