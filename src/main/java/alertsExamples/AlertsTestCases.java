package alertsExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class AlertsTestCases {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();

        sleep(2);

        Alert alert = driver.switchTo().alert();

        String text = alert.getText(); // fetching the text from alert

        System.out.println("Alert Text: "+text);

        sleep(3);

        alert.accept(); // click OK or accepting alert

    }
}
