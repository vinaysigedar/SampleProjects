package sdet.RestAssured;

import static org.testng.AssertJUnit.assertTrue;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * Unit test for simple Doclet.
 */
public class DocletTest
{
	String loginAPI="users/sign_in";
	String loginJsonBody="{\"email\":\"jogidemo321@gmail.com\",\"password\":\"builder123\"}";
    @Test
    public void testLoginAPI() {
    	RestAssured.baseURI="https://api-staging-builder.engineer.ai/";
    	Response response=RestAssured.given().contentType("application/json").body(loginJsonBody).when().post(loginAPI);
    	System.out.println(response.statusCode());
    	System.out.println(response.getHeaders());
    	System.out.println(response.getBody().asString());
    }
    
}
