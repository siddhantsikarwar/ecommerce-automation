package com.sdetprep.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(linkText = " Signup / Login")
    private static WebElement signupAndLoginButton;

    private static String homePageTitle="Automation Exercise";



}