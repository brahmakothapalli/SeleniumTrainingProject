package modalDialogs;

import io.github.bonigarcia.wdm.WebDriverManager;
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
        WebDriverManager.chromedriver().setup();

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
