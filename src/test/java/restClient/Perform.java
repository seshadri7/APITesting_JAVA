package restClient;

import java.util.Map;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import supportingFiles.Headers;

public class Perform {
	
public static Response response;

public static String URI="https://reqres.in/api/users/2";
	
	public static void getMethod(String URI,Map<String,String> headers) {
		
		response = RestAssured.given()
				    .baseUri(URI)
				    .headers(headers)
				    .contentType(ContentType.JSON)
				    .when().log().all()
				    .get();
		
		System.out.println("\n\nResponse\n--------------------------\n");
		System.out.println("API Response Status Code -->> "+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
     public static void getMethod(String URI,Map<String,String> headers,Map<String,String> params) {
		
		response = RestAssured.given()
				    .baseUri(URI)
				    .headers(headers)
				    .contentType(ContentType.JSON)
				    .params(params)
				    .when().log().all()
				    .get();
		
		System.out.println("\n\nResponse\n--------------------------\n");
		System.out.println("API Response Status Code -->> "+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
	
	
	public static void main(String[] args) {
		getMethod(URI, Headers.defaultHeaders());
	}
	

}
