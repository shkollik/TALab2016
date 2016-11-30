package steps;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import transformation.EmailTransform;
import transformation.SalaryCountTransform;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shkolik on 23.11.2016.
 */
public class LoginStep extends BaseUtil{

    public static final String URL = "http://executeautomation.com/demosite/Login.html";
    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        base.driver.get(URL);

    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {

    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {

    }

    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
/*        System.out.println(data.get(0).get(0));
        System.out.println(data.get(0).get(1));*/

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

//        for(User user : users){
//            System.out.println("User Name is " + user.getUserName());
//            System.out.println("Password is " + user.getPassword() );
//        }


    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUserNameAndPassword(String userName, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Username is " + userName);
        System.out.println("Password is " + password);
     }

    @And("^I enter the users email address as Email:([^\"]*)$")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) throws Throwable {
        System.out.println("The email is " + email );

    }

    @And("^I verify the count of my salary digitsfor UAH (\\d+)$")
    public void iVerifyTheCountOfMySalaryDigitsforUAH(@Transform(SalaryCountTransform.class) int salary) throws Throwable {
        System.out.println("My salary digits is " + salary);
    }

    public class User{
        private String userName;
        private String password;

        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }
    }
}
