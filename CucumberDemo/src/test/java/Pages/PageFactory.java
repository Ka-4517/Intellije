package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private LoginPage homePage;

    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage getHomePage()
    {
        if(homePage == null)
        {
            homePage = new LoginPage(driver);
        }
        return homePage;
    }
}
