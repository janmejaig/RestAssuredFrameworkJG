package jiraIssueApi;

import org.testng.annotations.Test;

import apiConfig.ApiPath;
import apiConfig.ApiPath.apiPath2;
import apiConfig.headersConfig;
import baseTest.baseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

//extends baseTest

public class createJiraTicket extends baseTest  {
	String payload = "{\n" + 
			"  \n" + 
			"  \"fields\": {\n" + 
			"  	\n" + 
			"  	\"summary\":\"issue from rest API JJ222\",\n" + 
			"        \"issuetype\": {\n" + 
			"      \"id\": \"10007\"\n" + 
			"    },\n" + 
			"    \"project\":{\n" + 
			"      \"id\": \"10005\"\n" + 
			"    }\n" + 
			"    \n" + 
			"  }\n" + 
			"  \n" + 
			"}";

	@Test
	public void createNewTicket() {
		
		
	
		headersConfig header = new headersConfig();
		RestAssured.baseURI= "https://janmejai.atlassian.net";
		Response response =
				RestAssured
				
				.given()
				//.with()
				
				//.header("Content-Type", "application/json")
				.headers(header.defaultHeaders())
			//	.header("accept", "application/json")
				.auth().preemptive()
				.basic("gupta.janmejai@gmail.com", "Avajhk7Wwz75bBJX6UGN0F1A")
				.body(payload)
				 .log().body()
				.when()
			//	.post("https://janmejai.atlassian.net/rest/api/3/issue")         

				.post(ApiPath.apiPath2.Create_New_Ticket)
				.then().log().all().assertThat().statusCode(201)
				.extract().response();
		
	System.out.println(	response.getBody().asString());
	System.out.println(	response.getStatusCode());

				//.post("https://janmejai.atlassian.net/rest/api/3/issue")         
		// .then().assertThat().statusCode(201).log().all()
			//	.extract().response().asString();
	
				
	}
	

}
