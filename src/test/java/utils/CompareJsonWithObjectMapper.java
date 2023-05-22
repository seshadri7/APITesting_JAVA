package utils;

import java.io.File;
import java.io.IOException;

import org.testng.asserts.SoftAssert;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompareJsonWithObjectMapper {
	public static String JsonFile1 = "./src/test/resources/responseJson/json3.json";
	public static String JsonFile2 = "./src/test/resources/responseJson/json4.json";

	public static void compareJson() throws IOException {

		ObjectMapper mapper = new ObjectMapper();

		JsonNode node1 = mapper.readTree(new File(JsonFile1));
		JsonNode node2 = mapper.readTree(new File(JsonFile2));

		SoftAssert softassert = new SoftAssert();

		softassert.assertEquals(node1, node2);

		softassert.assertAll("All payload keys");

	}

	public static void main(String[] args) throws IOException {
		compareJson();
	}

}
