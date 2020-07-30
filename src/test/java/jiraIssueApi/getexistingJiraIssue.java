package jiraIssueApi;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import apiConfig.ApiPath;
import baseTest.baseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import apiVerification.apiVerification;

public class getexistingJiraIssue extends baseTest{
	
	@Test
	public void getExistingIssueList() {
	//	test.log(LogStatus.INFO, "");
	//test.log(LogStatus.INFO, "My test is starting......");

		Response response = RestAssured
		.given()
		.auth().preemptive().basic("gupta.janmejai@gmail.com", "Avajhk7Wwz75bBJX6UGN0F1A")
		
		.when()
		.get(ApiPath.apiPath2.Get_Existing_Issue)
		.then().log().all().statusCode(200)
	.extract().response();
//apiVerification.apiVerification.responseCodeValiddation(response, 200);
apiVerification.responseCodeValiddation(response, 200);			
			
		
		apiVerification.responseTimeValidation(response);
		
	test.log(LogStatus.INFO,"my test is ended ");


//		System.out.println(response.getBody().asString());
//		System.out.println(response.getStatusCode());
//		
		
	}

}
