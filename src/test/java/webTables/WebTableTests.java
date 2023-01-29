package webTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class WebTableTests {

    WebDriver driver;

    @BeforeMethod
    public void SetUp() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // driver by default 500 ms
        //we1
        //we2

       // we4 -- 30 secs -- excplicit
    }

    @Test
    public void WebTableTest(){

        WebElement web_table = driver.findElement(By.className("dataTable"));

//        System.out.println(web_table.getText());

        List<WebElement> table_rows = web_table.findElements(By.tagName("tr"));

        System.out.println("No of rows in a table: "+table_rows.size());

        List<WebElement> table_header = web_table.findElements(By.xpath("//table/thead/tr/th"));

        System.out.println("No of columns :: "+table_header.size());


        for (WebElement row : table_rows){

            List<WebElement> table_cells = row.findElements(By.xpath("/td[0]"));

            for(WebElement cell : table_cells){

                String row_text = cell.getText().trim();

                if (Objects.equals(row_text, "Blue Dart Expres")){
                    cell.findElement(By.tagName("a")).click();
                    System.out.println("Clicked on the blue dart link ");
                    break;
                }
            }

//            System.out.println("Table Cells count :: "+table_cells.size());
        }



        // reading the column header names
        /*for (WebElement ele : table_header) {

            System.out.println(ele.getText()); //columns names

        }*/

        // reading the row data one by one
//        System.out.println("\n ***** Row data ****** \n");
        /*        for (WebElement row : table_rows) {

            System.out.println("\n");
            System.out.println(row.getText());

        }*/

        // accessing 5th row data
        // System.out.println(table_rows.get(5).getText());

        // clicking on link in a cell

        // you identified the ele1 -- text/button or link
        // another ele2 clicked -- the page or DOM structer was refreshed or changed
        // act on ele1--- act on -- we get Stale Element Ref Exception





    }
}
