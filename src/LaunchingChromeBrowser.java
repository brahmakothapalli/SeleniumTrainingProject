import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {

    public static void main(String[] args) {

        String chrome_driver_path = "D:\\qababu\\SeleniumTrainingProject\\wed_drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chrome_driver_path);

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        String title_app = driver.getTitle();

        System.out.println("Title : "+title_app);

//        WebElement search_box = driver.findElement(By.name("q"));

        WebElement search_box = driver.findElement(By.xpath("//input[@title='Search']"));

        search_box.sendKeys("ValueMomentum Hyderabad", Keys.ENTER);



//        driver.close();

    }
}
