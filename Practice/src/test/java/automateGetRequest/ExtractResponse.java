package automateGetRequest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ExtractResponse {

    @Test
    public void extractResponse(){
        String extractedResponse = given()
                        .baseUri("http://localhost:3000")
                        .when()
                        .get("/posts")
                        .then()
                        .assertThat().statusCode(200).log().all()
                        .extract().response().path("[0].title");
        System.out.println("posts title is " + extractedResponse);

        assertThat(extractedResponse,equalTo("Selenium with Java"));
    }

    @Test
    public void validateBody(){
        given().baseUri("http://localhost:3000")
                .when()
                .get("/posts")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body("title",contains("Selenium with Java","Rest Assured",null,"Created from postman"));
    }
}
