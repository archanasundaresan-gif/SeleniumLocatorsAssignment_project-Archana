package tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;

public class LinksTest extends BasePage {

    @BeforeMethod
    public void setup() {
        browserSetup();
    }

    @Test
    public void links() {

        driver.get("https://demoqa.com/links");

        driver.findElement(By.id("simpleLink")).click();

    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

}