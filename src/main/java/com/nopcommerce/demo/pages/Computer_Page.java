package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Computer_Page extends Utility {

    By desktopLink=By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");
    By sortBy=By.xpath("//select[@id='products-orderby']");
    By zToA=By.id("products-orderby");
    By aToZ=By.xpath("//select[@id='products-orderby']");
    // * 2.4 Click on "Add To Cart"
    By cart=By.cssSelector("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");

    //* 2.5 Verify the Text "Build your own computer"
    By text=By.xpath("//h1");

    // * 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By intelPentium=By.xpath("//select[@id='product_attribute_1']");
    // * 2.7.Select "8GB [+$60.00]" using Select class.
    By clickOnRamfield=By.xpath("//select[@id='product_attribute_2']");
    By ram=By.xpath("//select[@id='product_attribute_2']");
    // * 2.8 Select HDD radio "400 GB [+$100.00]"
    By radio=By.xpath("//label[text()='400 GB [+$100.00]']");

    //2.9 Select OS radio "Vista Premium [+$60.00]"
    By vistaPremium=By.xpath("//label[text()='Vista Premium [+$60.00]']");

    //* 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
    // * [+$5.00]"
    By microsoftOffice=By.xpath("//label[text()='Microsoft Office [+$50.00]']");
    By totalCommander=By.xpath("//label[text()='Total Commander [+$5.00]']");

    //  * 2.11 Verify the price "$1,475.00"
    By price=By.xpath("//span[@id='price-value-1']");

    //2.12 Click on "ADD TO CARD" Button.
    By cartButton=By.xpath("//button[@class='button-1 add-to-cart-button']");
    // * 2.13 Verify the Message "The product has been added to your shopping cart" on Top
    // * green Bar
    // * After that close the bar clicking on the cross button.
    By message=By.xpath("//p[@class='content']");
    By close=By.xpath("//span[@class='close']");
    //* 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By shoppingCart=By.xpath("//span[@class='cart-label']");
    By goToCart=By.xpath("//button[@class='button-1 cart-button']");
    // * 2.15 Verify the message "Shopping cart"
    By verifyMessage=By.xpath("//h1");
    // * 2.16 Change the Qty to "2" and Click on "Update shopping cart"
    By qty=By.xpath("//input[@class='qty-input']");
    By update=By.id("updatecart");
    //* 2.17 Verify the Total"$2,950.00"
    By total=By.cssSelector("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    //* 2.18 click on checkbox “I agree with the terms of service”
    By checkBox=By.xpath("//input[@id='termsofservice']");
    //2.19 Click on “CHECKOUT”
    By checkOut=By.id("checkout");
    //  * 2.20 Verify the Text “Welcome, Please Sign In!”
    By verifyText=By.xpath("//h1");
    //* 2.21Click on “CHECKOUT AS GUEST” Tab
    By guest=By.className("checkout-as-guest-button");
    // * 2.22 Fill the all mandatory field
    By name=By.id("BillingNewAddress_FirstName");
    By lastName=By.id("BillingNewAddress_LastName");
    By emailId=By.id("BillingNewAddress_Email");
    By country=By.id("BillingNewAddress_CountryId");
    By city=By.id("BillingNewAddress_City");
    By address=By.id("BillingNewAddress_Address1");
    By postCode=By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber=By.id("BillingNewAddress_PhoneNumber");
    // * 2.23 Click on “CONTINUE”
    By continueButton=By.xpath("//button[@onclick='Billing.save()']");
    // * 2.24 Click on Radio Button “Next Day Air($0.00)”
    By nextDay =By.xpath("//input[@id='shippingoption_1']");
    //* 2.25 Click on “CONTINUE”
    By continue1=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    //* 2.26 Select Radio Button “Credit Card”
    By payment=By.xpath("//input[@id='paymentmethod_1']");
    By creditCard=By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    //  * 2.27 Select “Master card” From Select credit card dropdown
    By masterCard=By.xpath("//select[@id='CreditCardType']");
    // * 2.28 Fill all the details
    By cardHolderName=By.id("CardholderName");
    By cardNumber=By.id("CardNumber");
    By expireMonth=By.id("ExpireMonth");
    By expireYear=By.id("ExpireYear");
    By code=By.id("CardCode");
    // * 2.29 Click on “CONTINUE”
    By continue2=By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    // * 2.30 Verify “Payment Method” is “Credit Card”
    By verifyPayment=By.xpath("//span[normalize-space()='Credit Card']");
    //* 2.32 Verify “Shipping Method” is “Next Day Air”
    By verifyShipping=By.xpath("//span[normalize-space()='Next Day Air']");
    // * 2.33 Verify Total is “$2,950.00”
    By verifyTotal=By.cssSelector("(//strong[contains(text(),'$2,950.00')])[2]");
    //* 2.34 Click on “CONFIRM”
    By confirm=By.xpath("//button[text()='Confirm']");
    //* 2.35 Verify the Text “Thank You”
    By verifyThankYou=By.xpath("//h1");
    //* 2.36 Verify the message “Your order has been successfully processed!”
    By verifyMessageOrder=By.xpath("//strong[text()='Your order has been successfully processed!']");
    //* 2.37 Click on “CONTINUE”
    By continue3=By.xpath("//button[@class='button-1 order-completed-continue-button']");
    //* 2.37 Verify the text “Welcome to our store”
    By verifyMessageWelcome=By.xpath("//h2[text()='Welcome to our store']");

    public void clickOnDesktopLink(){
        clickOnElement(desktopLink);
    }

    public void sortByAToZ(){
        clickOnElement(sortBy);
        selectByValueFromDropDown(aToZ,"5");
    }

    public void sortByZToA(){
        clickOnElement(sortBy);
        selectByValueFromDropDown(zToA,"6");
    }

    public void clickOnAddToCart(){
        clickOnElement(cart);
    }

    public String verifyText(){
        return getTextFromElement(text);
    }

    public void clickOnIntelPentium(){
        clickOnElement(intelPentium);
    }

    public void select8GbRam(){
        clickOnElement(clickOnRamfield);
        selectByValueFromDropDown(ram,"8GB [+$60.00]");
    }

    public void selectHddRadio(){
        clickOnElement(radio);
    }

    public void selectVistaPermium(){
        clickOnElement(vistaPremium);
    }

    public void clickOnMicrosoftOffice(){
        clickOnElement(microsoftOffice);
    }

    public void clickOnTotalCOmmander(){
        clickOnElement(totalCommander);
    }

    public String verifyThePrice(){
        return getTextFromElement(price);
    }

    public void cartButton(){
        clickOnElement(cartButton);
    }

    public String verifyMessage(){
        return getTextFromElement(message);
    }

    public void clickOnCloseButton(){
        clickOnElement(close);
    }

    public void mouseHoverAndClickOnGoToCart(){
        mouseHoverToElement(shoppingCart);
        clickOnElement(goToCart);
    }

    public String verifyMessage1(){
        return getTextFromElement(verifyMessage);
    }

    public void changeQuantityAndClickOnUpdateButton(){
        sendTextToElement(qty,"2");
        clickOnElement(update);
    }

    public String verifyTotalAmount(){
        return getTextFromElement(total);
    }

    public void clickOnCheckBoxOfTermsOfServices(){
        clickOnElement(checkBox);
    }

    public void clickOnCheckOut(){
        clickOnElement(checkOut);
    }

    public String verifyTextSignIn(){
        return getTextFromElement(verifyText);
    }

    public void clickOnCheckOutAsGuest(){
        clickOnElement(guest);
    }

    public void fillAllMandatoryField(){
        sendTextToElement(name,"Nill");
        sendTextToElement(lastName,"Poddar");
        sendTextToElement(emailId,"nill123@gmail.com");
        selectByValueFromDropDown(country,"United Kingdom");
        sendTextToElement(city,"London");
        sendTextToElement(address,"21");
        sendTextToElement(postCode,"LA1 2QL");
        sendTextToElement(phoneNumber,"+44 7076543725");
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAir(){
        clickOnElement(nextDay);
    }

    public void clickOnContinue1(){
        clickOnElement(continue1);
    }

    public void selectRadioButtonCreditCard(){
        clickOnElement(payment);
        clickOnElement(creditCard);
    }

    public void selectMasterCard(){
        selectByValueFromDropDown(masterCard,"MasterCard");
    }

    public void fillDetailsForPayment(){
        sendTextToElement(cardHolderName,"Nill Poddar");
        sendTextToElement(cardNumber,"34987654325567895");
        selectByValueFromDropDown(expireMonth,"10");
        selectByValueFromDropDown(expireYear,"2027");
        sendTextToElement(code,"0044");
    }

    public void clickOnContinue2(){
        clickOnElement(continue2);
    }

    public String verifyPaymentMethod(){
        return getTextFromElement(verifyPayment);
    }

    public String verifyShippingMethod(){
        return getTextFromElement(verifyShipping);
    }

    public String verifyTotalMethod(){
        return getTextFromElement(verifyTotal);
    }

    public void clickOnConfirmButton(){
        clickOnElement(confirm);
    }

    public String verifyThankYou(){
        return getTextFromElement(verifyThankYou);
    }

    public String verifyMessageOrder(){
        return getTextFromElement(verifyMessageOrder);
    }

    public void clickOnContinue3(){
        clickOnElement(continue3);
    }

    public String verifyMessageWelcome(){
        return getTextFromElement(verifyMessageWelcome);
    }

}
