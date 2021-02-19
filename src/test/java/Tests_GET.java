import org.hamcrest.Matchers;
import org.hamcrest.collection.HasItemInArray;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.hasItems;

public class Tests_GET {
	@Test
	public void test_1() {
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[1]", Matchers.equalTo(8))
		.body("data.first_name", hasItems("Michael","Lindsay"));	
	}
}
