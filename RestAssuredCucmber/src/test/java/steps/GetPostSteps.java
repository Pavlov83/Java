package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class GetPostSteps {

    @Given("I perform GET operation for {string}")
    public void iPerformGETOperationFor(String arg0) {

    }

    @And("I perform GET for the post number {string}")
    public void iPerformGETForThePostNumber(String postNumber){

    }

    @Then("I should see the author name as {string}")
    public void iShouldSeeTheAuthorNameAs(String arg0) {
    }
}
