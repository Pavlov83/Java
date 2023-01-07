package utils;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

import static io.restassured.RestAssured.given;

public class HTTPClient {

    public ServiceApp app;

    public HTTPClient(){

    }

   public  HTTPClient(ServiceApp app) {
        this.app = app;
    }




    public Response get(String endpointURL) {
        RequestSpecification given = given();
        Response authorizationResponse;
        authorizationResponse = given.urlEncodingEnabled(true).log().all().when().get(endpointURL);

        return authorizationResponse;
    }
}
