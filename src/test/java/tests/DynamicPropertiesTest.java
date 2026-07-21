package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;

public class DynamicPropertiesTest extends BasePage {

    @BeforeMethod
    public void setup() {
        browserSetup();
    }

    @Test
    public void dynamicProperties() {

        driver.get("https://demoqa.com/dynamic-properties");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));

        driver.findElement(By.id("enableAfter")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

}