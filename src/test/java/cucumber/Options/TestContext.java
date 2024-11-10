package cucumber.Options;

public class TestContext {
		private ScenarioContext scenarioContext;
		private String baseUri;
		
		public TestContext() {
			scenarioContext = new ScenarioContext();
			baseUri = "https://rahulshettyacademy.com";
		}

		public ScenarioContext getScenarioContext() {
			return scenarioContext;
		}

		public String getBaseUri() {
			return baseUri;
		}
}
