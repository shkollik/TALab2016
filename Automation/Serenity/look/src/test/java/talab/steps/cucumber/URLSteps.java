package talab.steps.cucumber;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import talab.steps.serenity.MainPageSteps;

/**
 * Created by Vladyslav_Shkola on 11/17/2016.
 */
public class URLSteps {
    @Steps
    MainPageSteps steps;

    @Given("the user is on the Workplace home page")
    public void theUserIsOnTheWikionaryHomePage(){
        steps.is_the_home_page();
    }

    @Given("the user signs in")
    public void theUserSignsIn(){
        steps.is_signin_in();
    }

}
