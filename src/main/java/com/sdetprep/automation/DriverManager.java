package com.sdetprep.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    private WebDriver driver;
    private static String browserName;

    public static String getBrowserName(String browserName){
        if (browserName=="chrome"){
            this.browserName=browserName;
        }
    }

}
