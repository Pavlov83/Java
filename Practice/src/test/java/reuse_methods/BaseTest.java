package reuse_methods;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BaseTest {

    public static Response get() {
        given()
                .baseUri("http://localhost:3000")
                .when()
                .get("/posts")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200)
                .body("posts[0].name", equalTo("Selenium with Java"));

    }
}
