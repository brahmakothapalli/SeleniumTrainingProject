package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class AlertsTestCases_2 {

    public static void main(String[] args) throws InterruptedException {

        String chrome_driver_path = "D:\\qababu\\SeleniumTrainingProject\\wed_drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chrome_driver_path);

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("timerAlertButton")).click();

        sleep(5000);

        Alert alert = driver.switchTo().alert();

        String text = alert.getText(); // fetching the text from alert

        System.out.println("Alert Text: "+text);

//        sleep(3);

        alert.accept(); // click OK or accepting alert




    }
}