package be;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PracticeFirstTest {

  @Test
    public void TestExample(){
      RestAssured.get("https://api.github.com")
                 .then()
                 .statusCode(200);
  }
}
