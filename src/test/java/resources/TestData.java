package resources;

import java.util.ArrayList;
import java.util.List;

import pojoSerialize.AddPlaceLocations;
import pojoSerialize.AddPlaceRequestModel;

public class TestData {
	
	public AddPlaceRequestModel addPlacePayload() {
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
	
	return addRequest;
	}

}