package supportingFiles;

import java.util.HashMap;
import java.util.Map;

public class Params {
	
 public static Map<String,String> params(String string1,String string2) {
		Map<String,String> params = new HashMap<String,String>();
		params.put("orderid", string1);
		params.put("count", string2);
		
		return params;
	}

}
