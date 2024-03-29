import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;

import java.awt.image.RescaleOp;
import java.util.Map;

public class ValidatableResponse {

    public static final String BASE_URL = "https://api.github.com/rate_limit";

    @Test
    public void jsonPathReturnsMap(){
        Response response = RestAssured.get(BASE_URL);
        ResponseBody<?> bodyOnly = response.body();

        JsonPath jPath = bodyOnly.jsonPath();
        JsonPath jPath2 = response.body().jsonPath();

        Map<String,String> fullJson = jPath2.get();
        Map<String,String> subMap = jPath2.get("resources");
        Map<String,String> subMap2 = jPath2.get("resources.core");

        int value = jPath.get("resources.core.limit");
        int value2 = jPath.get("resources.graphql.limit");

        System.out.println(fullJson);
        System.out.println(subMap);
        System.out.println(subMap2);
        System.out.println(value);
        System.out.println(value2);

    }
}
