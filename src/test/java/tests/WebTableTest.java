package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;

public class WebTableTest extends BasePage {

    @BeforeMethod
    public void setup() {
        browserSetup();
    }

    @Test
    public void webTable() {

        driver.get("https://demoqa.com/webtables");//opening the website

        driver.findElement(By.id("addNewRecordButton")).click();

        driver.findElement(By.id("firstName")).sendKeys("Archana");

        driver.findElement(By.id("lastName")).sendKeys("MS");

        driver.findElement(By.id("userEmail")).sendKeys("archana@gmail.com");

        driver.findElement(By.id("age")).sendKeys("25");

        driver.findElement(By.id("salary")).sendKeys("50000");

        driver.findElement(By.id("department")).sendKeys("QA");

        driver.findElement(By.id("submit")).click();

        driver.findElement(By.id("searchBox")).sendKeys("Archana");

        Assert.assertTrue(driver.getPageSource().contains("Archana"));

    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

}