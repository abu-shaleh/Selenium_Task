package testcase;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.ReadXLSdata;


public class TestLogin extends BaseTest {
    @BeforeTest
    public void startReport(){
        initializeReport();
    }
    @Test(dataProviderClass = ReadXLSdata.class,dataProvider = "loginData")
    public static void LoginTest( String username, String password) throws InterruptedException {
        //Login Functionalities Test Case
            driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys(username);
            Thread.sleep(2000);
            driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys(password);
            Thread.sleep(2000);
            driver.findElement(By.xpath(loc.getProperty("proceed_button"))).click();
            Thread.sleep(2000);
    }
}

