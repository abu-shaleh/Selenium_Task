package testcase;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.ReadXLSdata;

public class LogOut extends BaseTest {
    @Test()
    public static void LogoutTest() throws InterruptedException {
        //Login Functionalities Test Case
        driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath(loc.getProperty("proceed_button"))).click();
        Thread.sleep(1000);
        // Logout Funtionalities
        driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
        Thread.sleep(1000);
        // Session Check
        driver.navigate().back();
        Thread.sleep(1000);
    }
}
