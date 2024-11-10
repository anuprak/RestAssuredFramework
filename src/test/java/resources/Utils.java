package resources;

//import cucumber.Options.TestContext;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
//import stepDefinitions.BaseSteps;

public class Utils //extends BaseSteps
{

//	public Utils(TestContext testContext) {
//		super(testContext);
//	}

	public RequestSpecification getRequestSpecification() {
		
		// How can I use getBaseUri() method from BaseSteps here?
		
		RequestSpecification baseRequest = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addQueryParam("key", "qaclick123")
				.setContentType(ContentType.JSON).build();
		
		return baseRequest;
	}

}
