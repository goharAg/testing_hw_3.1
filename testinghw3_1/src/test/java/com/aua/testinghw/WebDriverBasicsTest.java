package com.aua.testinghw;

import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.Test;  



public class WebDriverBasicsTest
{
    public static WebDriver driver;
    public static String baseUrl = "https://www.shutterstock.com/";
    
    @BeforeClass
    public static void initWebDriver(){
       System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void WebDriverTest(){
        driver.get("https://www.shutterstock.com/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.className("mui-1pucve2-select"));

    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
