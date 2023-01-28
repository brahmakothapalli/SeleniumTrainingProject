package Windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import static java.lang.Thread.sleep;

public class NewTab {

    public static void main(String[] args) throws InterruptedException {

        String chrome_driver_path = "D:\\qababu\\SeleniumTrainingProject\\wed_drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chrome_driver_path);

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//button[@id='tabButton']")).click();

        sleep(3000);

        Set<String> childWindows = driver.getWindowHandles();

        System.out.println("After : "+childWindows.size());

        for(String s : childWindows){

            if (!parentWindow.equalsIgnoreCase(s)){

                driver.switchTo().window(s); //control switched to child window

                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        driver.close();
    }
}
