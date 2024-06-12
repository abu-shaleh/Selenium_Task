package testcase;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class CheckOut extends BaseTest {
    @Test()
    public static void CheckoutTest() throws InterruptedException {
        //Login Functionalities Test Case
        driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath(loc.getProperty("proceed_button"))).click();
        Thread.sleep(1000);
        // driver.findElement(By.xpath(loc.getProperty("filter"))).click();
        // Adding one item to Cart
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        Thread.sleep(1000);
        // Scrolling
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        //Adding another item to cart
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
        Thread.sleep(1000);
        //Scroll Up
        js.executeScript("window.scrollBy(500,0)");
        //Adding another item to cart
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
        Thread.sleep(1000);
        // Navigate to the Cart Page
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(1000);
        // Navigate to the Cart Page
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(1000);
        // Scroll Down to check the Items
        js.executeScript("window.scrollBy(0,500)");
        // Click on Checkout Button
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        Thread.sleep(1000);
        // Checkout: Your Information
        //First Name
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Mr.");
        Thread.sleep(1000);
        //Last Name
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Megamind");
        Thread.sleep(1000);
        // Zip
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("Test1234");
        Thread.sleep(1000);
        // Click to Continue
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        Thread.sleep(1000);
        // Scroll Down
        js.executeScript("window.scrollBy(0,1000)");
        // Finish
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
        Thread.sleep(1000);
    }
}
