package stepDefinitions;

import io.cucumber.java.en.When;
import cucumber.Options.TestContext;
import enums.Context;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojoDeserialize.*;


public class WhenStepDefinitions extends BaseSteps {
	
	public WhenStepDefinitions(TestContext testContext) {
		super(testContext);
	}

	@When("User {string} this location")
	public void user_this_location(String string) {
		
		RequestSpecification request = (RequestSpecification) getScenarioContext().getContext(Context.ADD_PLACE_REQUEST);
		
		Response response = request.when().log()
		.all().post("/maps/api/place/add/json").then().log().all().extract().response();//.as(AddPlaceResponseModel.class);
		
		//getScenarioContext().setContext(Context.ADD_PLACE_RESPONSE, response);
		
		getScenarioContext().setContext(Context.RESPONSE, response);
}
	
}
