package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import cucumber.Options.TestContext;
import enums.Context;
import io.cucumber.java.en.Given;
import io.restassured.specification.RequestSpecification;
import resources.TestData;
import resources.Utils;

public class GivenStepDefinitions extends BaseSteps {
	
	public GivenStepDefinitions(TestContext testContext) {
		super(testContext);
	}

	@Given("User has location data to upload")
	public void user_has_location_data_to_upload() throws IOException {

		TestData data = new TestData();
		Utils baseRequest = new Utils();
		
		RequestSpecification addPlaceRequest = given().log().all()
				.spec(baseRequest.getRequestSpecification()).body(data.addPlaceStaticPayload());
		
		getScenarioContext().setContext(Context.ADD_PLACE_REQUEST, addPlaceRequest);
	}
	
	@Given("User adds location with the following {string}, {string} and {string}")
	public void user_adds_location_with_the_following_and(String name, String language, String address) throws IOException {
		TestData data = new TestData();
		Utils baseRequest = new Utils();
		
		RequestSpecification addPlaceRequest = given().log().all()
				.spec(baseRequest.getRequestSpecification()).body(data.addPlacePayload(name,language,address));
		
		getScenarioContext().setContext(Context.ADD_PLACE_REQUEST, addPlaceRequest);
	}

}
