package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

import static java.lang.Thread.sleep;

public class NewTab_Version2 {

    //Annotations ... we will mark the methods as test cases or some others based on our req

    // @BeforeMethod .... It will be executed before each test in a class

    WebDriver driver;

    @BeforeMethod
    public void SetUp() {

        String chrome_driver_path = "D:\\qababu\\SeleniumTrainingProject\\wed_drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chrome_driver_path);

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");
    }

    @Test
    public void VerifyNewTabFunctionality() throws InterruptedException {

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//button[@id='tabButton']")).click();

        sleep(3000);

        Set<String> childWindows = driver.getWindowHandles();

        System.out.println("After : " + childWindows.size());

        for (String s : childWindows) {

            if (!parentWindow.equalsIgnoreCase(s)) {

                driver.switchTo().window(s); //control switched to child window

                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        driver.close();

    }

    @Test
    public void VerifyNewWindowFunctionality() throws InterruptedException {

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//button[@id='windowButton']")).click();

        sleep(3000);

        Set<String> childWindows = driver.getWindowHandles();

        System.out.println("After : " + childWindows.size());

        for (String s : childWindows) {

            if (!parentWindow.equalsIgnoreCase(s)) {

                driver.switchTo().window(s); //control switched to child window

                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);

        driver.close();

//        messageWindowButton

    }

    @Test
    public void VerifyMessageWindowFunctionality() throws InterruptedException {

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();

        sleep(3000);

        Set<String> childWindows = driver.getWindowHandles();

        System.out.println("After : " + childWindows.size());

        for (String s : childWindows) {

            if (!parentWindow.equalsIgnoreCase(s)) {

                driver.switchTo().window(s); //control switched to child window

                System.out.println("Switched to the child window");

                WebElement child_window_body = driver.findElement(By.xpath("/html/body/text()"));

                System.out.println("Found the body tag");

                String body_text = child_window_body.getText();

                System.out.println("Body Text: " + body_text);
//            }
            }

        }

    }
}
