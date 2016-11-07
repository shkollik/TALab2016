package talab.pages;

import junit.framework.Assert;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import talab.utils.Driver;

/**
 * Created by Shkolik on 06.11.2016.
 */
public class CreateRepoPage {
    private WebDriver driver;
    private static final int NUMBER_OF_SYMBOLS_FOR_LOGIN = 5;
    private static final int NUMBER_OF_SYMBOLS_FOR_DESCRRIPTION = 10;
    public String repoName;

    public CreateRepoPage() {
        PageFactory.initElements(Driver.driver, this);
    }

    @FindBy(linkText = "New repository")
    private WebElement newRepo;

    @FindBy(id = "repository_name")
    private WebElement repoNameField;

    @FindBy(id = "repository_description")
    private WebElement repoDescription;

    @FindBy(id = "repository_auto_init")
    private WebElement checkReadMe;

    @FindBy(xpath = "//div[@class='with-permission-fields']/button[@type='submit']")
    private WebElement createRepo;

    @FindBy(xpath = "//div[@class='container repohead-details-container']//strong[@itemprop='name']/a")
    private WebElement justCreatedRepo;


    public void createRepo() {
        newRepo.click();
        repoName = RandomStringUtils.randomAlphanumeric(NUMBER_OF_SYMBOLS_FOR_LOGIN);
        repoNameField.sendKeys(repoName);
        repoDescription.sendKeys(RandomStringUtils.randomAlphanumeric(NUMBER_OF_SYMBOLS_FOR_DESCRRIPTION));
        checkReadMe.click();
        createRepo.click();

    }

    public String getNameOfJustCreatedRepo(){
        return justCreatedRepo.getText();
    }

}
