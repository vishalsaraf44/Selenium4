import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.html5.LocalStorage;
import org.testng.annotations.Test;

public class MyFirst {

    @Test
    public void main() throws Exception
    {
        DriverFactory driverFactory = new DriverFactory();
        ChromeDriver driver= (ChromeDriver)driverFactory.makeBrowser();
        driver.get("https://www.google.com");
        System.out.println("ABC");
        driver.manage().window().maximize();
driver.equals(driver);
Thread.sleep(1000);
LocalStorage ls= driver.getLocalStorage();
DevTools devTools= driver.getDevTools();
driver.
        driver.quit();
    }
}
