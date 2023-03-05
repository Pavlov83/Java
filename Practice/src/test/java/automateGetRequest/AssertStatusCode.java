package automateGetRequest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class AssertStatusCode {

    @Test
    public void getRequest(){
        given()
                .baseUri("http://localhost:3000")

                .when()
                .get("/posts")
                .then()
                .log()
                .all()
                .assertThat().statusCode(200);
    }

}
