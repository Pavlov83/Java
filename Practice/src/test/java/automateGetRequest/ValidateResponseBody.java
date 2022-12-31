package automateGetRequest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class ValidateResponseBody {

    @Test
    public void validateBody(){
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
