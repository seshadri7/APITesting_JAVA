package utils;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PayloadKeys {

	public static String JsonFile1 = "./src/test/resources/responseJson/json2.json";

	public static void getPayloadKeys() throws IOException {

		ObjectMapper mapper = new ObjectMapper();

		String json = mapper.readTree(new File(JsonFile1)).toString();

		System.out.println("json-->" + json);

		Map<String, String> node = mapper.readValue(json, new TypeReference<Map<String, String>>() {
		});

		node.keySet().forEach(key -> {
			System.out.println("key: " + key);
			System.out.println("Value: " + node.get(key));
		});

	}

	public static void main(String[] args) throws IOException {
		getPayloadKeys();
	}

}
