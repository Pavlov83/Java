import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BasicResponse {


    public static String BASE_URL = "https://api.github.com";

    @Test
    public void convenienceMethods(){
        Response response = RestAssured.get(BASE_URL);
        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals(response.getContentType(),"application/json; charset=utf-8");

    }

    @Test
    public void getBasicHeader(){
        Response response = RestAssured.get(BASE_URL);
        Assert.assertEquals(response.getHeader("server"),"GitHub.com");
       // Assert.assertEquals(response.getHeader("x-rate-limit"),"60");
    }

    //We can retrieve the measured response time

    @Test
    public void getTime(){
        Response response = RestAssured.get(BASE_URL);
        System.out.println(response.getTimeIn(TimeUnit.MILLISECONDS));
    }
}
