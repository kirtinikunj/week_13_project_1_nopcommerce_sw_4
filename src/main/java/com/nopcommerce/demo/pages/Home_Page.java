package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Home_Page extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.xpath("Register");

    By topMenuElements = By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li");

    By pageTitle = By.xpath("//div[@class='page-title']/h1");

    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public List<WebElement> selectNavigationBar() {
        return getElement(topMenuElements);
    }

    public String getPagetitle() {
        return getTextFromElement(pageTitle);
    }

    public void clickOnComputerLink() {
        clickOnElement(computerLink);
    }

}
