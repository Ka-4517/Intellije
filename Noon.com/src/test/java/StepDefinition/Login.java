package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver = new ChromeDriver();

    @Given("user is on logged page")
    public void user_is_on_logged_page() {
        driver.get("https://www.noon.com/");
    }
    @And("username and password enter")
    public void username_and_password_enter() throws InterruptedException {

        driver.findElement(By.id("dd_header_signInOrUp")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("emailInput")).sendKeys("karanautomation@gmail.com");
        driver.findElement(By.id("passwordInput")).sendKeys("4mayloveu");

    }
    @When("click on login button")
    public void click_on_login_button() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(1000);

    }
    @Then("user is on Home page")
    public void user_is_on_home_page() {
        System.out.println(driver.getCurrentUrl());
        System.out.println("Karan logged in");

    }
}
