package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
    protected PageFactory pageFactory;
    WebDriver driver;

    public void setup()
    {

        ChromeOptions chromeOptions = new ChromeOptions();

        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
//        System.setProperty("webdriver.http.factory", "jdk-http-client");
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com/");
        pageFactory = new PageFactory(driver);
    }
}
