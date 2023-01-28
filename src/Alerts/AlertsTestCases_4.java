package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class AlertsTestCases_4 {

    public static void main(String[] args) throws InterruptedException {

        String chrome_driver_path = "D:\\qababu\\SeleniumTrainingProject\\wed_drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chrome_driver_path);

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("promtButton")).click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("Learning Selenium");

        alert.accept(); // click OK or accepting

//        alert.dismiss();

    }
}
