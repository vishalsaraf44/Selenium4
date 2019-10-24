import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public WebDriver makeBrowser()
    {
       WebDriverManager.chromedriver().setup();
       return new ChromeDriver();
    }

}
