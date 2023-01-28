package modalDialogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModalDialogExamples {

    WebDriver driver;

    @BeforeMethod
    public void SetUp() {

        String chrome_driver_path = "D:\\qababu\\SeleniumTrainingProject\\wed_drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chrome_driver_path);

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/modal-dialogs");
    }

    @Test
    public void SmallModal(){

        driver.findElement(By.id("showSmallModal")).click();

        WebElement small_modal = driver.findElement(By.className("modal-body"));

        System.out.println("Small Modal Text: "+small_modal.getText());

        driver.findElement(By.id("closeSmallModal")).click();

    }

    @Test
    public void LargeModal(){

        driver.findElement(By.id("showLargeModal")).click();

        WebElement small_modal = driver.findElement(By.className("modal-body"));

        System.out.println("Large Modal Text: "+small_modal.getText());

        driver.findElement(By.id("closeLargeModal")).click();

    }

    @Test
    public void LargeModal1(){

        driver.findElement(By.id("showLargeModal")).click();

        WebElement small_modal = driver.findElement(By.className("modal-body"));

        System.out.println("Large Modal Text: "+small_modal.getText());

        driver.findElement(By.id("closeLargeModal")).click();

    }

}
