import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class LaunchingEdgeBrowser {

    public static void main(String[] args) {

        String edge_driver_path = "D:\\qababu\\SeleniumTrainingProject\\wed_drivers\\msedgedriver.exe";

        System.setProperty("webdriver.edge.driver", edge_driver_path);

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com/");

        String current_url = driver.getCurrentUrl();

        System.out.println("Current URL: "+ current_url);

        Set<String> windows = driver.getWindowHandles();

        System.out.println("Windows Count: "+windows.size());

        driver.close();

    }
}
