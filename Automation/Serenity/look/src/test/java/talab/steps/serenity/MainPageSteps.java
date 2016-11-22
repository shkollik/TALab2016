package talab.steps.serenity;

import net.thucydides.core.annotations.Step;
import talab.pages.MainPage;

/**
 * Created by Vladyslav_Shkola on 11/17/2016.
 */
public class MainPageSteps {
    MainPage mainPage;

    @Step
    public void is_the_home_page() {
        mainPage.open();
    }

    @Step
    public void is_signin_in(){
        mainPage.signIn();
    }
}
