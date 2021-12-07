package driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {

    private static volatile WebDriver driver;

    private SingletonDriver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            synchronized (SingletonDriver.class) {
                if (driver == null) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                }
            }
        }
        return driver;
    }
}
