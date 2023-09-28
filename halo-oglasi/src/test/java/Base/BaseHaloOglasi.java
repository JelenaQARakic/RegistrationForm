package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseHaloOglasi {

    public static WebDriver driver;
    public static WebDriverWait wdwait;
    Duration waitTime = Duration.ofSeconds(5);


    @Before

    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver,waitTime);
        driver.get("https://www.halooglasi.com");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        //driver.close();
        //driver.quit();

    }
}
