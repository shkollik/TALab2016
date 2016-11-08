package talab;

import org.testng.Assert;
import org.testng.annotations.Test;
import talab.pages.CreateRepoPage;
import talab.pages.LoginPage;
import talab.steps.Steps;

/**
 * Created by Shkolik on 06.11.2016.
 */
public class ThirdTest {
    private final String login = "shkollik";
    private final String pass = "Vados307";
    LoginPage page = new LoginPage();
    CreateRepoPage page2 = new CreateRepoPage();

    @Test
    public void testLogin() {
        page.openPage();
        page.logIn(login, pass);

        Assert.assertEquals(page.getLoggedInUserName(), page.loginName);
    }

    @Test(dependsOnMethods = {"testLogin"})
    public void testCreatRepo(){
        page2.createRepo();

        Assert.assertEquals(page2.getNameOfJustCreatedRepo(), page2.repoName);

    }


}