package supportingFiles;

import java.util.HashMap;
import java.util.Map;

public class Headers {
	
	public static Map<String,String> defaultHeaders() {
		Map<String,String> headers = new HashMap<String,String>();
		headers.put("content-type", "application/json");
		
		return headers;
	}

}
