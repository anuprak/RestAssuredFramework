package stepDefinitions;

import cucumber.Options.ScenarioContext;
import cucumber.Options.TestContext;

public class BaseSteps {
	private ScenarioContext scenarioContext;
	
	public BaseSteps(TestContext testContext) {
		scenarioContext = testContext.getScenarioContext();
	}
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}

}
