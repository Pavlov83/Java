import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PeekAndPrintDemo{


    public final String BASE_URL = "https://api.github.com//";

    @Test
    public void prettyPeek(){
        RestAssured.get(BASE_URL).peek();
    }

    @Test
    public void prettyPrint(){
        RestAssured.get(BASE_URL).prettyPrint();
    }


}
