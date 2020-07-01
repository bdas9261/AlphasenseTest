package resources;

import com.jayway.restassured.RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class utils {
	
	RequestSpecification req;
    public RequestSpecification requestSpecification() {
    	 RestAssured.baseURI="https://reqres.in";
    	 req=new RequestSpecBuilder().setBaseUri("https://reqres.in").setContentType(ContentType.JSON).build();
    	 return req;
    	 
    }
}
