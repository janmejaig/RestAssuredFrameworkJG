package baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import utilis.extentReportListner;
import utilis.fileandEnv;


public class baseTest extends extentReportListner{

	@BeforeClass
	public void baseTest() {
		
		//System.out.println(fileandEnv.endAndFile().get("Serverurl"));
		
		//RestAssured.baseURI = "https://janmejai.atlassian.net";
		
		RestAssured.baseURI = fileandEnv.endAndFile().get("Serverurl");
	    //RestAssured
//	    .given()
//	    .auth().preemptive().basic(fileandEnv.endAndFile().get("Username"), ("Password"));

		
		
	}}
	
	
	

