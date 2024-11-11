package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

//import cucumber.Options.TestContext;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
//import stepDefinitions.BaseSteps;

public class Utils //extends BaseSteps
{

//	public Utils(TestContext testContext) {
//		super(testContext);
//	}

	public RequestSpecification getRequestSpecification() throws IOException {
		
		// How can I use getBaseUri() method from BaseSteps here?
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt")); // Creating a file where all the request details will be logged
		RequestSpecification baseRequest = new RequestSpecBuilder().setBaseUri(getGlobalBaseUri("baseUri"))
				.addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(log)) //Logs all request details
				.addFilter(ResponseLoggingFilter.logResponseTo(log)) //Logs all response details
				.setContentType(ContentType.JSON).build();
		
		return baseRequest;
	}
	
	public String getGlobalBaseUri(String key) throws IOException {
		Properties prop = new Properties();//Its a Java class that can be used to access any file with.properties extension (Global file)
		FileInputStream inputStream = new FileInputStream("");// Provide the path to golobal.properties file here
		prop.load(inputStream);
		return prop.getProperty(key);
	}
}
