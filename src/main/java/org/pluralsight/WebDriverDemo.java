package org.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement acceptButton= driver.findElement(By.id("L2AGLb"));
        acceptButton.click();
        WebElement  searchField= driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("pluralsight");
        searchField.sendKeys(Keys.ENTER);


        WebElement imagesLink= driver.findElements(By.linkText("Imagini")).get(0);
        imagesLink.click();

        WebElement imageElement=driver.findElement(By.cssSelector("img[class='rg_i Q4LuWd']"));
        imageElement.click();


    }
}
