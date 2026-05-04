package api;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import io.restassured.response.Response;
import utils.TestListener;

public class TestAPI extends BaseAPI {
	
	
	  UserAPI userAPI = new UserAPI();

	  
	  @Test
	  public void testWithBearerToken() {
	      Response response = userAPI.getUsersWithToken();

	      AssertJUnit.assertEquals(response.getStatusCode(), 200);
	  }
	
	  /*  @Test
	    public void testGetUsers() {
	    	    	
	    	test.info("Sending GET request to /users");
	    	Response response = userAPI.getUsers();
	    	test.info("Response received");   

	        System.out.println("Status Code: " + response.getStatusCode());
	        System.out.println("Response Body: " + response.getBody().asString());

	        Assert.assertEquals(response.getStatusCode(), 200);
	    }*/
	  
	  @Test
	  public void testGetUsers() {
	      TestListener.test.info("Sending GET request to /users");

	      Response response = userAPI.getUsers();

	      TestListener.test.info("Status Code: " + response.getStatusCode());

	      AssertJUnit.assertEquals(response.getStatusCode(), 200);
	  }
	    
	    @Test
	    public void testCreateUser() {
	    	
	    	TestListener.test.info("Sending POST request to /users");
	    	Response response = userAPI.createUser();
	    	  int statusCode = response.getStatusCode();
	    	TestListener.test.info("Status Code: " + statusCode);
	        

	        System.out.println("Status Code: " + statusCode);
	        System.out.println("Response Body: " + response.getBody().asString());

	        AssertJUnit.assertTrue(statusCode == 200 || statusCode == 201);
	    }
	    
	    @Test
	    public void testUpdateUserPUT() {
	    	
	    	TestListener.test.info("Sending UPDATE request to /users");
	    	 Response response = userAPI.updateUserPUT();
	    	 TestListener.test.info("Status Code: " + response.getStatusCode());
	        
	       

	        AssertJUnit.assertEquals(response.getStatusCode(), 200);
	    }
	    
	    @Test
	    public void testUpdateUserPATCH() {
	    	
	    	TestListener.test.info("Sending PATCH request to /users");
	    	 Response response = userAPI.updateUserPATCH();
	    	 TestListener.test.info("Status Code: " + response.getStatusCode());
	       

	        AssertJUnit.assertEquals(response.getStatusCode(), 200);
	    }

}