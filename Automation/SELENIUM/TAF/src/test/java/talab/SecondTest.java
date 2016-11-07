package talab;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import talab.steps.Steps;

/**
 * Created by Shkolik on 05.11.2016.
 */
public class SecondTest {

    private static final String LOGIN = "shkollik";
    private static final String PASS = "Vados307";

    private Steps steps = new Steps();

    @BeforeClass
    public void setUp() {
        steps.inItBrowser();
    }

    @AfterClass
    public void tearDown() {
        steps.closeBrowser();
    }

    @Test
    public void testLoggedIn() {
        steps.login(LOGIN, PASS);

        Assert.assertEquals(steps.getLoggedInUserName(), LOGIN);
    }

    @Test(dependsOnMethods = {"testLoggedIn"})
    public void testCreateNewRepo() {
        steps.createRepo();

        Assert.assertEquals(steps.getJustCreatedRepoName(), steps.REPO_NAME);
    }
}


