package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;

public class ButtonTest extends BasePage {

    @BeforeMethod
    public void setup() {
        browserSetup();
    }

    @Test
    public void buttons() {

        driver.get("https://demoqa.com/buttons");

        Actions actions = new Actions(driver);

        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));

        actions.doubleClick(doubleClick).perform();

        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));

        actions.contextClick(rightClick).perform();

        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));

        clickMe.click();

    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

}