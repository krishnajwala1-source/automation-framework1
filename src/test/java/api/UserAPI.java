package api;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class UserAPI {
	
	
	
	public Response getUsers() {
	    return given()
	            .when()
	            .get("/users");
	}
}


	
	
	/*public Response getUsersWithToken() {
	    return given()
	            .header("Authorization", "Bearer dummy_token_123")
	            .when()
	            .get("/users");
	}
	
		    public Response getUsers() {
	        return given()
	        	    .when()
	                .get("/users");
	    }
		    
		    
		    
		    public Response createUser() {
		        return given()
		                .header("Content-Type", "application/json")
		                .body("{\"name\":\"Krishna\",\"job\":\"QA\"}")
		                .when()
		                .post("/users");
		    }
		    
		    public Response updateUserPUT() {
		        String body = "{ \"name\": \"Updated\", \"job\": \"Senior QA\" }";

		        return given()
		                .header("Content-Type", "application/json")
		                .body(body)
		                .when()
		                .put("/users/2");
		    }
		    
		    public Response updateUserPATCH() {
		        String body = "{ \"job\": \"Lead QA\" }";

		        return given()
		                .header("Content-Type", "application/json")
		                .body(body)
		                .when()
		                .patch("/users/2");
		    }
	}
*/

