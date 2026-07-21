package tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;

public class RadioButtonTest extends BasePage {

    @BeforeMethod
    public void setup() {
        browserSetup();
    }

    @Test
    public void radioButton() {

        driver.get("https://demoqa.com/radio-button");

        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();

    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

}