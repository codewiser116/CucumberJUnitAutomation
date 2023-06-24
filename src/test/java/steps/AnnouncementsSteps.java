package steps;

import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.AnnouncementsPage;
import pages.HomePage;
import utilities.Driver;

import java.util.List;

public class AnnouncementsSteps {

    WebDriver driver = Driver.getDriver();

    HomePage homePage = new HomePage();
    AnnouncementsPage announcementsPage = new AnnouncementsPage();

    final static Logger logger = Logger.getLogger(AnnouncementsSteps.class);

    @Then("user navigates to announcements tab")
    public void user_navigates_to_announcements_tab() {
        homePage.announcementsTab.click();
        logger.info("user clicked on announcements tab");

    }

    @Then("verify in announcements page user changes the number of results per page to")
    public void verify_in_announcements_page_user_changes_the_number_of_results_per_page_to(io.cucumber.datatable.DataTable dataTable) {
        List<Integer> numberOfResults = dataTable.asList(Integer.class);
        for (Integer number : numberOfResults) {
            announcementsPage.announcementsNumberBox.sendKeys(Keys.chord(Keys.COMMAND + "a"));
            announcementsPage.announcementsNumberBox.sendKeys(number.toString() + Keys.RETURN);

            Assert.assertEquals((int) number, announcementsPage.listOfAnnouncements.size());
        }

    }
}
