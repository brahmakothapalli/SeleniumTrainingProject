package practiceForm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FormPage {


    @Test
    public void SetUp() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys("Brahma");

        driver.findElement(By.id("lastName")).sendKeys("Kothapalli");

        driver.findElement(By.id("userEmail")).sendKeys("brahma457@gmail.com");

        WebElement radio = driver.findElement(By.id("gender-radio-1"));

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();", radio);

        driver.findElement(By.id("dateOfBirthInput")).sendKeys("24 Jul 1989");

        WebElement checkbox = driver.findElement(By.id("hobbies-checkbox-1"));

        jse.executeScript("arguments[0].click();", checkbox);



    }
}
