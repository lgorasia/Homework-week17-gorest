package in.co.gorest.customerinfo;

import in.co.gorest.model.EmployeeMojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CustomerPatchTest extends TestBase {
    @Test
    public void updateStudent() {
        EmployeeMojo employeeMojo = new EmployeeMojo();
        employeeMojo.setName("Allasaniii Peddana");
        employeeMojo.setGender("female");

        employeeMojo.setEmail("Allasani_Peddanaa@gmail.com");
        employeeMojo.setStatus("active");

        Response response =
                given()
                        .header("Content-Type","application/json")
                        .header("Authorization", "Bearer 5a08acd60a4f9f76dd28e583fa505a76eeaa98e3da1658ee53c924cac7b1d8d1")
                        .body(employeeMojo)
                        .when()
                        .patch("/users/3829");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
