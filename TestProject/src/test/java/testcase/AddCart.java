package testcase;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.ReadXLSdata;


public class AddCart extends BaseTest{
   @Test()
    public static void CartTest() throws InterruptedException {
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
    }
    }
