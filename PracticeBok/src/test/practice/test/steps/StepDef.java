package practice.test.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class StepDef {

    @Before()
    public static void BeforeScanrio(Scenario SC) {
        System.out.println("scanario before ::: " + SC.getName());
    }

    @After()
    public static void AfterScario(Scenario SC) {
        System.out.println("scanario after ::: " + SC.getName() + "status " + SC.getStatus());
    }


    @Given("Username and password as credentials")
    public static void Username_and_password_as_credentials(DataTable data) {
        List<String> elist = data.asList();
        System.out.println("username entered " + elist.get(0));
        System.out.println("Password entered " + elist.get(1));
    }

    @When("user click on the login button")
    public static void user_click_on_the_login_button() {
        System.out.println("Login Button entered");
    }

    @Then("user able to login the successfully")
    public static void user_able_to_login_the_successfully() {
        System.out.println("Success Login");
    }

    @Then("user unable to login should through an error")
    public static void user_unable_to_login_should_through_an_error() {
        System.out.println("Fail Login");
    }



    @Given("login Username {string} and {string} password as credentials")
    public void loginUsernameUnameAndPassPasswordAsCredentials(String uuu, String ppp) {
        System.out.println("username entered "+ uuu);
        System.out.println("Password entered " + ppp);
    }

    @Given("User able to see the app")
    public void userAbleToSeeTheApp() {
        System.out.println("checked luanch by backgroud");
    }
}
