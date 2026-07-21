package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;

public class TextBoxTest extends BasePage {

    @BeforeMethod
    public void setup() {
        browserSetup();
    }

    @Test
    public void textBoxTest() {

        driver.get("https://demoqa.com/text-box");

        // Enter Full Name
        driver.findElement(By.id("userName")).sendKeys("Archana");

        // Enter Email
        driver.findElement(By.id("userEmail")).sendKeys("archana@gmail.com");

        // Enter Current Address
        driver.findElement(By.id("currentAddress")).sendKeys("Kerala");

        // Enter Permanent Address
        driver.findElement(By.id("permanentAddress")).sendKeys("India");

        // Scroll to Submit button
        WebElement submitButton = driver.findElement(By.id("submit"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);

        // Small pause for smooth scrolling (optional)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click using JavaScript
        js.executeScript("arguments[0].click();", submitButton);

    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}