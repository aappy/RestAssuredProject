import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Tests_PATCH {

		@Test
		public void test_1_patch() {

			JSONObject request = new JSONObject(); 
			request.put("name", "Aparna");
			request.put("job", "SDET");
			System.out.println(request);			
			
			given()
			.header("Content-Type" , "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toString())
			.when()
			.patch("https://reqres.in/api/users/2")
			.then()
			.statusCode(200)
			.log().all();
		}
}
