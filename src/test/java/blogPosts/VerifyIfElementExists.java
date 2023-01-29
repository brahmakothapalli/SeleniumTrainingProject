package blogPosts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class VerifyIfElementExists {

    WebDriver driver;

    @Test
    public void verifyElementUsingIsDisplayedMethod() {
        boolean exist;
        try {
            WebDriverManager.edgedriver().setup();
            driver = new ChromeDriver();
            driver.navigate().to("https://www.google.com");
            driver.manage().window().maximize();
            exist = driver.findElement(By.name("q")).isDisplayed();
        } catch (Exception e) {
            System.out.println("Element not found and an is exception " + e.getMessage());
            exist = false;
        }
        Assert.assertTrue(exist);
    }

    @Test
    public void verifyElementByFindingIt() {
        boolean exist;
        try {
            WebDriverManager.edgedriver().setup();
            driver = new ChromeDriver();
            driver.navigate().to("https://www.google.com");
            driver.manage().window().maximize();
            driver.findElement(By.name("q"));
            exist = true;
        } catch (Exception e) {
            System.out.println("Element not found and an is exception " + e.getMessage());
            exist = false;
        }
        Assert.assertTrue(exist);
    }


    @Test
    public void verifyElementUsingElementsSize() {
        boolean exist = false;
        try {
            WebDriverManager.edgedriver().setup();
            driver = new ChromeDriver();
            driver.navigate().to("https://www.google.com");
            driver.manage().window().maximize();
            exist = driver.findElements(By.name("q")).size() != 0;
        } catch (Exception e) {
            System.out.println("Element not found and an is exception " + e.getMessage());
        }
        Assert.assertTrue(exist);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
