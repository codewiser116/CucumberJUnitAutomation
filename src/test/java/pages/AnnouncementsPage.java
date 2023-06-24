package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AnnouncementsPage {

    public AnnouncementsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "(//input)[5]")
    public WebElement announcementsNumberBox;

    @FindBy(xpath = "//div[text()='For whom']")
    public List<WebElement> listOfAnnouncements;

}
