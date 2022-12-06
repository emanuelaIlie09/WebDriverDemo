package org.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class WebDriverDemo {
    public static void main(String[] args) throws MalformedURLException {

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions);


//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement acceptButton= driver.findElement(By.id("L2AGLb"));
        acceptButton.click();
        WebElement  searchField= driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("pluralsight");
        searchField.sendKeys(Keys.ENTER);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Imagini")));


        WebElement imagesLink= driver.findElements(By.linkText("Imagini")).get(0);
        imagesLink.click();

        WebElement imageElement=driver.findElement(By.cssSelector("img[class='rg_i Q4LuWd']"));
        imageElement.click();


    }
}
