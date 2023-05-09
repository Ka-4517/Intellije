package StepDefination;

import Pages.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInDemoTest extends BaseClass {
    @Given("user is on logged page")
    public void user_is_on_logged_page() {
        setup();
    }
    @And("username and password enter")
    public void username_and_password_enter() {
        pageFactory.getHomePage().addCredentials();
    }
    @When("click on login button")
    public void click_on_login_button() {
        pageFactory.getHomePage().clickOnLoginButton();
    }
    @Then("user is on Home page")
    public void user_is_on_home_page() {
        System.out.println("user is on Home page");
    }
}