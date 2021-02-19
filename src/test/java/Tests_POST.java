import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Tests_POST {
	
	@Test
	public void test_1_post() {
		/* post is used to create a resorce at server. thats why we provide body. we can use MAP below liabraries
		gson
		jackson
		Json
		Simple Json
		*/
		
//		Map<String , Object> map = new HashMap();
//		map.put("name", "Aparna");
//		map.put("job", "SDET");
//		
//		System.out.println(map);
		
		//to convert into JSON object
		JSONObject request = new JSONObject(); 
		request.put("name", "Aparna");
		request.put("job", "SDET");
		// serialization not happening for your JSON 
		System.out.println(request);
		//System.out.println(((Object) request).toJSONString());
		
		
		given().
		 header("Content-Type" , "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201);
	}
}
