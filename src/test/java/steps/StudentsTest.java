package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.StudentsPage;
import utilities.Driver;

public class StudentsTest {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    StudentsPage studentsPage = new StudentsPage();

    @Then("user navigates to students tab")
    public void user_navigates_to_students_tab() {
        homePage.studentsTab.click();
    }

    @Then("user clicks on add student button")
    public void user_clicks_on_add_student_button() {
        studentsPage.addStudentButton.click();
    }
    @Then("user adds student info {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_adds_student_info(String firstName, String lastName, String phone, String email, String group, String studyFormat) {

    }
    @Then("user clicks on add button")
    public void user_clicks_on_add_button() {

    }
    @Then("verify student with {string}, {string}, {string}, {string}, {string}, {string} was created")
    public void verify_student_with_was_created(String string, String string2, String string3, String string4, String string5, String string6) {

    }
    @Then("user deletes student with {string}")
    public void user_deletes_student_with(String string) {

    }
    @Then("verify student with {string}, {string}, {string}, {string}, {string}, {string} was deleted")
    public void verify_student_with_was_deleted(String string, String string2, String string3, String string4, String string5, String string6) {

    }
}
