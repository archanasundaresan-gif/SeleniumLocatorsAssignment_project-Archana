package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;

public class CheckBoxTest extends BasePage {

    @BeforeMethod
    public void setup() {
        browserSetup();
    }

    @Test
    public void checkBox() throws InterruptedException {

        driver.get("https://demoqa.com/checkbox");

        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,300)");

        Thread.sleep(2000);

        WebElement expand =
                driver.findElement(By.cssSelector("button[title='Expand all']"));

        js.executeScript("arguments[0].click();", expand);

        Thread.sleep(2000);

        WebElement home =
                driver.findElement(By.xpath("//label[@for='tree-node-home']"));

        js.executeScript("arguments[0].click();", home);

        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}