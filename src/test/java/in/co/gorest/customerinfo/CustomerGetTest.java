package in.co.gorest.customerinfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class CustomerGetTest extends TestBase {

    @Test
    public void getAllCustomersInfo() {
        Response response = given()
                .when()
                .get("/users");
       response.then().statusCode(200);
        response.prettyPrint();

    }

}
