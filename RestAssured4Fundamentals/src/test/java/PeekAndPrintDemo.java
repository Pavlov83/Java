import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PeekAndPrintDemo{

        public  final String BASE_URL = "http://api.github.com/";

        @Test
        public void peek(){
                RestAssured.get(BASE_URL)
                        .peek();
        }

        @Test
        public void prettyPeek(){
                RestAssured.get(BASE_URL)
                        .prettyPeek();
        }

}
