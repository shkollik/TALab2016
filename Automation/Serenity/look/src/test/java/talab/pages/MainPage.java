package talab.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by Vladyslav_Shkola on 11/17/2016.
 */
@DefaultUrl("https://ecsd001006a8.epam.com/CWPTEST/")
public class MainPage extends PageObject {
    @FindBy(xpath="//button[@class='form-login__epam-login__button']")
    private WebElementFacade signInButton;

    public void signIn() {
        signInButton.click();
    }
}
