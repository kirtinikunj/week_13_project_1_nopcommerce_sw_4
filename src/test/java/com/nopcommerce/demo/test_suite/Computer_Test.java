package com.nopcommerce.demo.test_suite;

import com.nopcommerce.demo.pages.Computer_Page;
import com.nopcommerce.demo.pages.Home_Page;
import com.nopcommerce.demo.test_base.Test_Base;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 1. Create class “ComputerTest” into testsuite package
 * Write the following Test:
 * 1.Test name verifyProductArrangeInAlphaBaticalOrder()
 * 1.1 Click on Computer Menu.
 * 1.2 Click on Desktop
 * 1.3 Select Sort By position "Name: Z to A"
 * 1.4 Verify the Product will arrange in Descending order.
 * 2. Test name verifyProductAddedToShoppingCartSuccessFully()
 * 2.1 Click on Computer Menu.
 * 2.2 Click on Desktop
 * 2.3 Select Sort By position "Name: A to Z"
 * 2.4 Click on "Add To Cart"
 * <p>
 * 2.5 Verify the Text "Build your own computer"
 * 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
 * 2.7.Select "8GB [+$60.00]" using Select class.
 * 2.8 Select HDD radio "400 GB [+$100.00]"
 * 2.9 Select OS radio "Vista Premium [+$60.00]"
 * 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
 * [+$5.00]"
 * 2.11 Verify the price "$1,475.00"
 * 2.12 Click on "ADD TO CARD" Button.
 * 2.13 Verify the Message "The product has been added to your shopping cart" on Top
 * green Bar
 * After that close the bar clicking on the cross button.
 * 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 * 2.15 Verify the message "Shopping cart"
 * 2.16 Change the Qty to "2" and Click on "Update shopping cart"
 * 2.17 Verify the Total"$2,950.00"
 * 2.18 click on checkbox “I agree with the terms of service”
 * 2.19 Click on “CHECKOUT”
 * 2.20 Verify the Text “Welcome, Please Sign In!”
 * 2.21Click on “CHECKOUT AS GUEST” Tab
 * 2.22 Fill the all mandatory field
 * 2.23 Click on “CONTINUE”
 * 2.24 Click on Radio Button “Next Day Air($0.00)”
 * 2.25 Click on “CONTINUE”
 * 2.26 Select Radio Button “Credit Card”
 * 2.27 Select “Master card” From Select credit card dropdown
 * 2.28 Fill all the details
 * 2.29 Click on “CONTINUE”
 * 2.30 Verify “Payment Method” is “Credit Card”
 * 2.32 Verify “Shipping Method” is “Next Day Air”
 * 2.33 Verify Total is “$2,950.00”
 * 2.34 Click on “CONFIRM”
 * 2.35 Verify the Text “Thank You”
 * 2.36 Verify the message “Your order has been successfully processed!”
 * 2.37 Click on “CONTINUE”
 * 2.37 Verify the text “Welcome to our store”
 */
public class Computer_Test extends Test_Base {

    Home_Page homePage=new Home_Page();
    Computer_Page computerPage=new Computer_Page();

    //* 1.Test name verifyProductArrangeInAlphaBaticalOrder()
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        // * 1.1 Click on Computer Menu.
        homePage.clickOnComputerLink();
        //  * 1.2 Click on Desktop
        computerPage.clickOnDesktopLink();
        // * 1.3 Select Sort By position "Name: Z to A"
        computerPage.sortByZToA();
        //  * 1.4 Verify the Product will arrange in Descending order.
    }

    // * 2. Test name verifyProductAddedToShoppingCartSuccessFully()
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {

        // * 2.1 Click on Computer Menu.
        homePage.clickOnComputerLink();
        //  * 2.2 Click on Desktop
        computerPage.clickOnDesktopLink();
        // * 2.3 Select Sort By position "Name: A to Z"
        computerPage.sortByAToZ();
        // * 2.4 Click on "Add To Cart"
        computerPage.clickOnAddToCart();
        //* 2.5 Verify the Text "Build your own computer"
        String expectedText="Build your own computer";
        String actualText=computerPage.verifyText();
        Assert.assertEquals(actualText,expectedText);
        // * 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computerPage.clickOnIntelPentium();
        // * 2.7.Select "8GB [+$60.00]" using Select class.
        computerPage.select8GbRam();
        // * 2.8 Select HDD radio "400 GB [+$100.00]"
        computerPage.selectHddRadio();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        computerPage.selectVistaPermium();
        //* 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        // * [+$5.00]"
        computerPage.clickOnMicrosoftOffice();
        computerPage.clickOnTotalCOmmander();
        //  * 2.11 Verify the price "$1,475.00"
        String expectedPrice="$1,475.00";
        String actualPrice= computerPage.verifyThePrice();
        Assert.assertEquals(actualPrice,expectedPrice);
        //2.12 Click on "ADD TO CARD" Button.
        computerPage.cartButton();
        // * 2.13 Verify the Message "The product has been added to your shopping cart" on Top
        // * green Bar
        // * After that close the bar clicking on the cross button.
        String expectedMessage="The product has been added to your shopping cart";
        String actualMessage= computerPage.verifyMessage();
        Assert.assertEquals(actualMessage,expectedMessage);
        computerPage.clickOnCloseButton();
        //* 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        computerPage.mouseHoverAndClickOnGoToCart();
        // * 2.15 Verify the message "Shopping cart"
        String expectedMessage1="Shopping cart";
        String actualMessage1= computerPage.verifyMessage1();
        Assert.assertEquals(actualMessage1,expectedMessage1);
        // * 2.16 Change the Qty to "2" and Click on "Update shopping cart"
        computerPage.changeQuantityAndClickOnUpdateButton();
        //* 2.17 Verify the Total"$2,950.00"
        String expectedTotal="$2,950.00";
        String actualTotal=computerPage.verifyTotalAmount();
        Assert.assertEquals(actualTotal,expectedTotal);
        //* 2.18 click on checkbox “I agree with the terms of service”
        computerPage.clickOnCheckBoxOfTermsOfServices();
        //2.19 Click on “CHECKOUT”
        computerPage.clickOnCheckOut();
        //  * 2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedText1="Welcome, Please Sign In!";
        String actualText1=computerPage.verifyTextSignIn();
        Assert.assertEquals(actualText1,expectedText1);
        //* 2.21Click on “CHECKOUT AS GUEST” Tab
        computerPage.clickOnCheckOutAsGuest();
        // * 2.22 Fill the all mandatory field
        computerPage.fillAllMandatoryField();
        // * 2.23 Click on “CONTINUE”
        computerPage.clickOnContinueButton();
        // * 2.24 Click on Radio Button “Next Day Air($0.00)”
        computerPage.clickOnNextDayAir();
        //* 2.25 Click on “CONTINUE”
        computerPage.clickOnContinue1();
        //* 2.26 Select Radio Button “Credit Card”
        computerPage.selectRadioButtonCreditCard();
        //  * 2.27 Select “Master card” From Select credit card dropdown
        computerPage.selectMasterCard();
        // * 2.28 Fill all the details
        computerPage.fillDetailsForPayment();
        // * 2.29 Click on “CONTINUE”
        computerPage.clickOnContinue2();
        // * 2.30 Verify “Payment Method” is “Credit Card”
        String expectedPayment="Credit Card";
        String actualPayment=computerPage.verifyPaymentMethod();
        Assert.assertEquals(actualPayment,expectedPayment);
        //* 2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedShipping="Next Day Air";
        String actualShipping=computerPage.verifyShippingMethod();
        Assert.assertEquals(actualShipping,expectedShipping);
        // * 2.33 Verify Total is “$2,950.00”
        String expectedTotal1="$2,950.00";
        String actualTotal1=computerPage.verifyTotalMethod();
        Assert.assertEquals(actualTotal1,expectedTotal1);
        //* 2.34 Click on “CONFIRM”
        computerPage.clickOnConfirmButton();
        //* 2.35 Verify the Text “Thank You”
        String expectedThankYou="Thank You";
        String actualThankYou=computerPage.verifyThankYou();
        Assert.assertEquals(actualThankYou,expectedThankYou);
        //* 2.36 Verify the message “Your order has been successfully processed!”
        String expectedOrder="Your order has been successfully processed!";
        String actualOrder=computerPage.verifyMessageOrder();
        Assert.assertEquals(actualOrder,expectedOrder);
        //* 2.37 Click on “CONTINUE”
        computerPage.clickOnContinue3();
        //* 2.37 Verify the text “Welcome to our store”
        String expectedWelcome="Welcome to our store";
        String actualWelcome=computerPage.verifyTotalMethod();
        Assert.assertEquals(actualTotal1,expectedTotal1);
    }
}
