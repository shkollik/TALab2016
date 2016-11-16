package talab.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by Vladyslav_Shkola on 11/16/2016.
 */
@DefaultUrl("https://epuakyiw0699.kyiv.epam.com/CWPTEST")
public class CWPStartPage extends PageObject{

    @FindBy(xpath = "//button[@class='form-login__epam-login__button']")
    private WebElementFacade loginButton;

    public void sign_in() {
        loginButton.click();
    }


}
