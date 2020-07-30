package apiConfig;

import java.util.HashMap;
import java.util.Map;

public class headersConfig {
	
	public Map<String ,String> defaultHeaders(){
		Map<String ,String> defaultHeaders = new HashMap<String ,String>(); //like wise we can define different set of headers 
		defaultHeaders.put("Content-Type", "application/json");
		return defaultHeaders;
		
	}

}
