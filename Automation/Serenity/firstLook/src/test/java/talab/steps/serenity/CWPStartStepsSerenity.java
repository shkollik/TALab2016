package talab.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import talab.pages.CWPStartPage;

/**
 * Created by Vladyslav_Shkola on 11/16/2016.
 */
public class CWPStartStepsSerenity extends ScenarioSteps {
    CWPStartPage startPage;

    @Step
    public void is_the_home_page() {
        startPage.open();
    }

    @Step
    public void signIn(){
        startPage.sign_in();

    }
}
