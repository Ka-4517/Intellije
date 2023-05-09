package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void addCredentials()
    {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    }

    public void clickOnLoginButton()
    {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
}
