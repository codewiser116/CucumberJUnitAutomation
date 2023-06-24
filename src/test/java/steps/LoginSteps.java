package steps;

import io.cucumber.java.en.*;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;
import utilities.PasswordEncryptorDecryptor;

public class LoginSteps {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();

    final static Logger logger = Logger.getLogger(LoginSteps.class);


    public static void main(String[] args) {
        logger.info("test log in main method");
    }



    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get(Config.getValue("studyMateLoginUrl"));
        Assert.assertEquals("StudyMate", driver.getTitle());
        logger.info("User:  " + Config.getValue("email") + " is on Login page");
    }


    @When("user enters email {string}")
    public void user_enters_email(String email) {
        loginPage.emailInput.sendKeys(email);
        logger.info("User entered email: " + Config.getValue("email"));
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.passwordInput.sendKeys(password);
        logger.info("User: " + Config.getValue("email") + " entered password");
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
        logger.info("User clicked on login button");
    }

    @Then("user must be logged in")
    public void user_must_be_logged_in() {
        logger.info("Waiting for 3 seconds");
        ApplicationFlow.pause(3000);
        String expectedUrl = "https://codewise.studymate.us/admin/analytics";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
        logger.info("Verified the Login page URL");
        logger.warn("This is my warn message");
        logger.error("Oops, error happened!");
    }

    @When("user enters correct email")
    public void user_enters_correct_email() {
        loginPage.emailInput.sendKeys(Config.getValue("email"));

    }
    @When("user enters correct password")
    public void user_enters_correct_password() {
        loginPage.passwordInput.sendKeys(PasswordEncryptorDecryptor.decryptPassword(Config.getValue("password")));
    }


}
