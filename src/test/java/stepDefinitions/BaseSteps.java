package stepDefinitions;

import cucumber.Options.ScenarioContext;
import cucumber.Options.TestContext;

public class BaseSteps {
	private ScenarioContext scenarioContext;
	private String baseUri;
	
	public BaseSteps(TestContext testContext) {
		scenarioContext = testContext.getScenarioContext();
		baseUri = testContext.getBaseUri();
	}
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}

	public String getBaseUri() {
		return baseUri;
	}
}
