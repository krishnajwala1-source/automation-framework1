package api;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;


import io.restassured.RestAssured;
import io.restassured.response.Response;


public class TestAPI extends BaseAPI {


	UserAPI userAPI = new UserAPI();
	
	@Test
	public void testGetUsers() {

	    RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

	    Response response = userAPI.getUsers();

	    System.out.println("Status Code: " + response.getStatusCode());

	    AssertJUnit.assertEquals(response.getStatusCode(), 200);
	}
}
