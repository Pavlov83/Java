package tests;


import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.HTTPClient;

public class ExampleTest extends HTTPClient {

    @Test
    public void firstTest(){
        app.practiceApiOne().getSimpleEndpoint();
    }
}
