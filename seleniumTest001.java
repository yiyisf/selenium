package com.haibao.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest001 {

    public static void main(String[] args) {

        //System.setProperty();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.taobao.com");
        driver.close();
    }

}
