package Test;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;
import Requestpojo.Creteuser;
import Utils.Base;
import Utils.RestUtils;

public class Test1 extends Base {
	Creteuser user=new Creteuser();
	Properties prop;
    
       

@Test
public void testCarSerialization() {
          user.setname("Test4"); 
          user.setjob("TL");
    Creteuser cu=  given().
    contentType(ContentType.JSON).
        body(user).
    when().
        post("https://reqres.in/api/users").
    then().extract().response().as(Creteuser.class);
    //System.out.println(cu.asString());
    Assert.assertEquals(user.getname(), "Test4");
    System.out.println(user.getname());
}
}
