package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoctorsTests {


    WebDriver driver;

    @BeforeMethod
    public void SetUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

//        driver.get("https://demoqa.com/frames");

        driver.navigate().to("https://www.google.co.in/");
    }

    @Test
    public void SomeTest(){

        driver.findElement(By.partialLinkText("മലയാളം")).click();

//        driver.findElement(By.cssSelector("input#firstName")); //id
//
//        driver.findElements(By.cssSelector("div.practice-form-wrapper")); //class name

        //parent
            // "//input[@Value='Male']/parent::div"
        //child
            // "//div[@id='userNumber-wrapper']/child::div[1]/label"

        //div[@id='userName-wrapper']/following-sibling::div[last()-2]

        //siblings -- locators at same level
            //following-sibling
            //preceding-sibling
        //div[@id='dateOfBirth-wrapper']/preceding-sibling::div

        //contains
    }
}
