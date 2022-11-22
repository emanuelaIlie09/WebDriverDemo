package org.pluralsight;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class Main {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.potomac.io/login");

        driver.findElement(By.id("login-form-control-username")).click();
        driver.findElement(By.id("login-form-control-username")).sendKeys("nhall@adimpact.com");
        driver.findElement(By.id("login-form-control-password")).click();
        driver.findElement(By.id("login-form-control-password")).sendKeys("N7dhSlwK");
        driver.findElement(By.cssSelector(".login-form-button-text")).click();

        WebElement myDynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(2))).until(ExpectedConditions.presenceOfElementLocated(By.id("login-form-control-verification-code")));
        WebElement verifCode =driver.findElement(By.id("login-form-control-verification-code"));
        verifCode.click();
        verifCode.sendKeys("000000");
        driver.findElement(By.cssSelector(".login-form-button-text")).click();


    }
}
