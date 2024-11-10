package stepDefinitions;

import static org.junit.Assert.*;

import cucumber.Options.TestContext;
import enums.Context;
import io.cucumber.java.en.Then;
import pojoDeserialize.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ThenStepDefinitions extends BaseSteps {

	public ThenStepDefinitions(TestContext testContext) {
		super(testContext);
	}

	@Then("The location is successfully added with status code {string}")
	public void the_location_is_successfully_added_with_status_code(String responseCode) {
		Response response = (Response) getScenarioContext().getContext(Context.RESPONSE);
		// Assertions in JUnit - use "assertEquals"
		assertEquals(response.getStatusCode(), Integer.parseInt(responseCode));
	}

	@Then("the {string} in the response body is {string}")
	public void the_in_the_response_body_is(String key, String value) {
		Response response = (Response) getScenarioContext().getContext(Context.RESPONSE);
		String stringResponse = response.asString();
		JsonPath js = new JsonPath(stringResponse);
		assertEquals(js.get(key).toString(), value);
	}
}
