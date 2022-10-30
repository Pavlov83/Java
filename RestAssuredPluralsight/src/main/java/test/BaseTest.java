package test;

import io.restassured.RestAssured;
import org.testng.annotations.Test;


public class BaseTest{

    @Test
    public void simpleTest(){
        RestAssured.get("https://api.github.com")
                        .then()
                        .statusCode(200);
    }
}