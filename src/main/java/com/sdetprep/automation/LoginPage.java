package com.sdetprep.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(css = "input[data-qa='signup-name']")
    private static WebElement newUserName;

    private static String homePageTitle="Automation Exercise - Signup / Login";



}