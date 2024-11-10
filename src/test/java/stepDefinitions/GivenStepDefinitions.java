package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import cucumber.Options.TestContext;
import enums.Context;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojoSerialize.AddPlaceLocations;
import pojoSerialize.AddPlaceRequestModel;

public class GivenStepDefinitions extends BaseSteps {
	
	public GivenStepDefinitions(TestContext testContext) {
		super(testContext);
	}

	@Given("User has location data to upload")
	public void user_has_location_data_to_upload() {

		String baseUri = "https://rahulshettyacademy.com";

		AddPlaceRequestModel addRequest = new AddPlaceRequestModel();
		addRequest.setAccuracy(50);
		addRequest.setAddress("201 abc Road");
		addRequest.setLanguage("English");
		addRequest.setName("Anusha");
		addRequest.setPhone_number("123-456-7890");
		addRequest.setWebsite("https://TryingSerializing.com");
		
		List<String> ls =new ArrayList<String>();
		ls.add("shoe park");
		ls.add("Dont know");
		
		addRequest.setTypes(ls);
	

		AddPlaceLocations locationData =new AddPlaceLocations();
		locationData.setLat(-38.234);
		locationData.setLng(33.456);

		addRequest.setLocation(locationData);
		
		RequestSpecification baseRequest = new RequestSpecBuilder().setBaseUri(baseUri)
				.setContentType(ContentType.JSON).build();

		RequestSpecification addPlaceRequest = given().log().all().spec(baseRequest).queryParam("key", "qaclick123").body(addRequest);
		
		getScenarioContext().setContext(Context.ADD_PLACE_REQUEST, addPlaceRequest);
	}

}
