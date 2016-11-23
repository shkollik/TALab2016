package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Shkolik on 23.11.2016.
 */
public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "UserName")
    public WebElement txtUserName;

    @FindBy(name = "Password")
    public WebElement txtPasswordName;

    @FindBy(name = "Login")
    public WebElement btnLogin;

    @FindBy(xpath = "html/body/h1")
    public WebElement header;

    public void login(String userName, String password){
        txtUserName.sendKeys(userName);
        txtPasswordName.sendKeys(password);
    }

    public void clickLogin(){
        btnLogin.submit();
    }

}
