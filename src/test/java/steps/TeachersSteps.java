package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.TeachersPage;
import utilities.ApplicationFlow;
import utilities.Driver;
import java.util.List;

public class TeachersSteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    TeachersPage teachersPage = new TeachersPage();

    @Then("user navigates to teachers tab")
    public void user_navigates_to_teachers_tab() {
        homePage.teachersTab.click();
        ApplicationFlow.pause(3000);

        String expectedUrl = "codewise.studymate.us/admin/teachers";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));
    }

    @Then("verify user changes the number of results per page to")
    public void verify_user_changes_the_number_of_results_per_page_to(io.cucumber.datatable.DataTable dataTable) {

        List<Integer> numbersOfResults = dataTable.asList(Integer.class); //10,5,3


        for (Integer number : numbersOfResults){
            teachersPage.numberInput.sendKeys(Keys.chord(Keys.COMMAND, "a"));
            teachersPage.numberInput.sendKeys(number.toString() + Keys.ENTER);

            ApplicationFlow.pause(3000);

            Assert.assertTrue("ERROR: The number of teachers did not match the expected number",
                    teachersPage.listOfTeachers.size() == number);
        }
    }






}
