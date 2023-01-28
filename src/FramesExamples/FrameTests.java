package FramesExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTests {


    WebDriver driver;

    @BeforeMethod
    public void SetUp() {

        String chrome_driver_path = "D:\\qababu\\SeleniumTrainingProject\\wed_drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chrome_driver_path);

        driver = new ChromeDriver();

        driver.manage().window().maximize();

//        driver.get("https://demoqa.com/frames");

        driver.navigate().to("https://demoqa.com/nestedframes");
    }

    @Test
    public void SingleFrame(){

        driver.switchTo().frame("frame2");

//        driver.switchTo().frame(1); //first switch to the frame

        WebElement we = driver.findElement(By.id("sampleHeading"));

        System.out.println("Txt : "+ we.getText());

    }

    @Test
    public void NestedFramesExample(){

        driver.switchTo().frame("frame1"); // switching to parent window using Id

        WebElement parent_frame = driver.findElement(By.xpath("/html/body"));

        System.out.println("Parent Txt : "+ parent_frame.getText());

        driver.switchTo().frame(0); //switching to child window using index

        WebElement child_frame_element = driver.findElement(By.xpath("/html/body/p"));

        System.out.println("Child Txt : "+ child_frame_element.getText());

    }

}
