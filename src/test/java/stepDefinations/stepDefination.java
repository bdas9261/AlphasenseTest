package stepDefinations;

import java.util.Properties;





import Requestpojo.Creteuser;
import Requestpojo.addUser;
import Utils.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.utils;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*; 


public class stepDefination extends  utils{
	
	Properties prop;
	addUser ur=new addUser();
	Creteuser user = new Creteuser();
    public static RequestSpecification reqs;
    ResponseSpecification ress ;
    Response res;
    JsonPath jp;
    String response;
	@Given("Add createuser Api request payload")
	public void add_createuser_Api_request_payload() {
		 ress = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON)
				.build();
		reqs=given().spec(requestSpecification()).body(ur.addUser());

	}

	@When("user Calls the {string} with Post HTTP Request")
	public void user_Calls_the_with_Post_HTTP_Request(String string) {
         res=reqs.when().post("/api/users").then().spec(ress).extract().response();
	}

	@Then("the api call got sucess with status code {int}")
	public void the_api_call_got_sucess_with_status_code(Integer int1) {
       assertEquals(res.getStatusCode(), 200);
	}

	@Then("{name} in response body is {Test2}")
	public void name_in_response_body_is_Test2(String Expectedname,String Expectedvalue) {
		String response=res.asString();
           jp=new JsonPath(response);
           
           assertEquals(jp.get(Expectedname).toString(),Expectedvalue);
         
          
	}

	@Then("{job} in response body is {se}")
	public void ob_in_response_body_is_se(String Expectedjob,String Expectedvalue) {
		jp=new JsonPath(response);
        
        assertEquals(jp.get(Expectedjob).toString(),Expectedvalue);
        
       
	}
}
