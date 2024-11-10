package cucumber.Options;

import java.util.HashMap;
import java.util.Map;

import enums.Context;

public class ScenarioContext {
	//Hashmap of context and objects we are saving
	private Map<String, Object> scenarioContext;

	public ScenarioContext() {
		scenarioContext = new HashMap<String, Object>();
	}

	public void setContext(Context key, Object value) {
		scenarioContext.put(key.toString(), value);
	}

	public Object getContext(Context key) {
		return scenarioContext.get(key.toString());
	}

	public Boolean tryGetKey(Context key) {
		return scenarioContext.containsKey(key.toString());
	}

}
