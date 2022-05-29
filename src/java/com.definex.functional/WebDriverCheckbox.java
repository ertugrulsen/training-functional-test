package com.definex.functional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckbox {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ErtugrulSen\\Desktop\\DFX\\DFX Testing Training-2022\\training-functional-test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\ErtugrulSen\\Desktop\\DFX\\DFX Testing Training-2022\\training-functional-test\\dfxSeleniumTest\\src\\java\\webapplication\\Checkbox.html");
        WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
        checkbox.click();

    }
}
