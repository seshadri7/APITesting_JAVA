package utils;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class JsonReader {
	
	public static String JsonFile1 = "./src/test/resources/responseJson/json3.json";
	
	

	public static JsonElement getJson1() {
		JsonParser jsonParser = new JsonParser();
		JsonElement jsonElement = null;
		try {
			FileReader fileReader = new FileReader(JsonFile1);// Json1 filePath
			jsonElement = jsonParser.parse(fileReader);
		} catch (Exception e) {
			System.out.println("File not found");
		}
		return jsonElement;
	}
	
	public static void comparejson() {
		JsonElement Json1 = getJson1();
		
		Gson g = new Gson();
		
		Type mapType = new TypeToken<Map<String, Object>>() {
		}.getType();

		Map<String, Object> firstMap = g.fromJson(Json1, mapType);
		
		
		
		System.out.println(firstMap.keySet());
		
	}
	
	public static void main(String[] args) {
		
		comparejson();
	
		
	}

}
