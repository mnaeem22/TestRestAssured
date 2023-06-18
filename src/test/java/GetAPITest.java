import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetAPITest {

    @Test
    void getAPITest(){

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Response : " +response.asString());
        System.out.println("Status Code: " +response.getStatusCode());
        System.out.println("Body:" +response.getBody().asString());
        System.out.println("Header: "+response.getHeader("content-type"));
        int statusCode = response.getStatusCode();
        Assertions.assertEquals(statusCode,200);

    }

}
