package com.XFleetSolutions.pages;

import com.XFleetSolutions.utilities.BrowserUtils;
import com.XFleetSolutions.utilities.ConfigurationReader;
import com.XFleetSolutions.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
   public Login_page(){
         PageFactory.initElements(Driver.getDriver(),this);
     }

    @FindBy(id="prependedInput")
    public WebElement username;


    @FindBy(id="prependedInput2")
    public WebElement password;


    @FindBy(id="_submit")
    public WebElement loginBtn;


    public void login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginBtn.click();

    }

    public void dynamicLogin(String userType) {
        userType=userType.replace(" ","_");
        String userName=ConfigurationReader.getProperty(userType+ "_username");
        String password =ConfigurationReader.getProperty(userType+ "_password");
        login(userName,password);
    }
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }
    }


}
