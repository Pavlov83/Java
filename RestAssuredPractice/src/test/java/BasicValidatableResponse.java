import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.emptyString;

public class BasicValidatableResponse {

    public static final String BASE_URL = "http://api.github.com";

    @Test
    public void basicValidatableResponse(){
        RestAssured.get(BASE_URL)
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                   .contentType(ContentType.JSON)
                .and().assertThat()
                .header("x-rate-limit","60");
    }

//    @Test
//    public void simpleHamcrestMatchers(){
//        RestAssured.get(BASE_URL)
//                .then()
//                .statusCode(200)
//                .statusCode(Matchers.lessThan(300)
//
//
//                        .header("cache-control",
//                                Matchers.containsStringIgnoringCase("max-age-60"))
//                        .time(Matchers.lessThan(2L),TimeUint.SECONDS)
//                        .header("etag",Matchers.notNullValue())
//                        .header("etag",Matchers.is(emptyString());
//    }
}
