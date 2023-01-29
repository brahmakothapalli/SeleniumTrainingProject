package dropdownExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;

public class DropdownScenarios {

    WebDriver driver;

    @BeforeMethod
    public void SetUp() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

//        driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");

//        driver.get("https://demoqa.com/automation-practice-form");

        driver.get("https://www.google.com/");
    }


    @Test
    public void DropdownWithSelectClass() throws InterruptedException {

        WebElement dropdown = driver.findElement(By.name("country")); //

        Select select_dropdown = new Select(dropdown);

        select_dropdown.selectByIndex(4);

        sleep(5000);

        select_dropdown.selectByValue("CHILE");

        sleep(5000);

        select_dropdown.selectByVisibleText("CANADA");

    }


    @Test
    public void DropdownWithoutSelectClass(){

        // Bootstrap or Non-select dropdowns

        // Identify the dropdown
        WebElement dropdown = driver.findElement(By.xpath("//div[@id='state']/div/div[2]"));

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].scrollIntoView();", dropdown);

        dropdown.click();

        // get all the options

        List<WebElement> options = driver.findElements(By.xpath("//div[contains(@id, 'react-select-3-option')]"));

        // loop through the options to select required option

        for (WebElement ele : options){

            String state = ele.getText();

            if (state.equals("Haryana")){

                ele.click();

                break;
            }
        }

    }


    @Test
    public void GoogleSearch(){

        // Bootstrap or Non-select dropdowns

        // Identify the dropdown
        WebElement search_box = driver.findElement(By.name("q"));

        search_box.sendKeys("Selenium 4");

        // get all the options

        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='erkvQe']/li//div[@role='option']/div[1]/span"));

        // loop through the options to select required option

        for (WebElement ele : options){

            String state = ele.getText();

            System.out.println(state);

        }

    }



}
