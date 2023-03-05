package steps;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class BDDStyleMethod {

    public void SimpleGETPost(String postNumber){
        given().contentType(ContentType.JSON)
                .when()
                .get(String.format("http://localhost:3000/posts/%s",postNumber))
                .then()
                .body("author", is("pavel Pavlov"));
    }
}
