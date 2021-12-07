package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.NavigationBarFragment;
import driver.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

    NavigationBarFragment navigationBarFragment = new NavigationBarFragment(
            SingletonDriver.getDriver());

    @FindBy(xpath = "//form[@id='signin-embedded-layout']//input[@id='ap_email']")
    private WebElement emailField;

    @FindBy(xpath = "form[@id='signin-embedded-layout']//input[@id='ap_password']")
    private WebElement passwordField;

    @FindBy(xpath = "/form[@id='signin-embedded-layout']//input[@id='signInSubmit']")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public NavigationBarFragment getNavigationBarFragment() {
        return navigationBarFragment;
    }
}
