package api.utils;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiUtils {

//Static method can be called directly without creating an object
public static RequestSpecification getRequestSpec() {
return given()
.header("Content-Type","application/json")
.log().all();  // Logs the entire request for debugging
}

// Common verification method to reuse across all tests
public static void verifyStatus(Response response,int expectedStatus) {
Assert.assertEquals(response.statusCode(), expectedStatus,
"Status code mismatch! Expected: " + expectedStatus + " but got: " + response.statusCode());


}

}
