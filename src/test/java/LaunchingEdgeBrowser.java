import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class LaunchingEdgeBrowser {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

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
