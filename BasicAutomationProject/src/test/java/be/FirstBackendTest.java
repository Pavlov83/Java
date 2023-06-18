package be;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstBackendTest {

    SoftAssert softAssert = new SoftAssert();

      @Test
      public void firstBackendTest(){

          Response response = RestAssured.get("https://reqres.in/api/users?page=2");
          softAssert.assertEquals(response.getStatusCode(),"200");
      }

      @Test
      public void testPost(){
          Map<String,Object> myMap = new HashMap<String,Object>();
            myMap.put("name","Pavel");
            myMap.put("job","QA");

         // JsonObject request = new JsonObject(myMap);
      }

}
