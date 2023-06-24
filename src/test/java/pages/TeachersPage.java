package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TeachersPage {

    WebDriver driver;

    public TeachersPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div/input)[2]")
    public WebElement numberInput;

    @FindBy(xpath = "//tr/td[2]")
    public List<WebElement> listOfTeachers;
}
