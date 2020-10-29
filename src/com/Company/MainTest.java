package com.Company;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.ConsoleHandler;
public class MainTest {
    public WebDriver driver;

    @Before
    public void SetDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexandrina\\Desktop\\utm\\anu_4\\CS\\lab5CS\\chromedriver_win32 (1)\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test
    public void TestSearch() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Computer");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
        Assertions.assertTrue(driver.findElements(By.id("nav-logo-sprites")).size() != 0);
    }
    @After
    public void closedriver() {
        driver.close();
    }

}