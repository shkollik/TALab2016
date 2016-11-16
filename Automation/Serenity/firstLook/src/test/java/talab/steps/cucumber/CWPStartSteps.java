package talab.steps.cucumber;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import talab.steps.serenity.CWPStartStepsSerenity;

/**
 * Created by Vladyslav_Shkola on 11/16/2016.
 */
public class CWPStartSteps {
    @Steps
    CWPStartStepsSerenity start;

    @Given("the user is on the Workplaces home page")
    public void givenTheUserIsOnTheWorkplaceHomePage() {
        start.is_the_home_page();
    }

    @Given("the user signs in")
    public void whenTheUserSignsIn(){
        start.signIn();
    }
}
