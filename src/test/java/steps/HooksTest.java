package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class HooksTest {

    final static Logger logger = Logger.getLogger(HooksTest.class);

    @Before
    public static void beforeScenario(Scenario scenario){
        logger.info(scenario + " is starting");
    }

    @After
    public static void afterScenario(Scenario scenario){

        if (scenario.isFailed()){
            logger.error(scenario + " failed!");
            byte [] screenshot =
                    ((TakesScreenshot)(Driver.getDriver())).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }else{
            logger.info(scenario + " passed!");
        }

        Driver.quit();
    }
}
