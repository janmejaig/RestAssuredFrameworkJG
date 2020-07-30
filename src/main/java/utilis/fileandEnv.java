package utilis;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class fileandEnv {
	
	
	//getting data from the properties file as map object 
	
	public static Map<String,String> fileandenv = new HashMap<String,String>();
	public static Properties propmain = new Properties();
	public static Properties propPreset = new Properties();
	
	public static Map<String , String>endAndFile(){
		{

			String environment = System.getProperty("env");

			try {
				if (environment.equalsIgnoreCase("devEnvironment")) {

					FileInputStream fisDev = new FileInputStream(System.getProperty("user.dir") + "/inputs/devEnvironment.properties");
					propmain.load(fisDev);
					fileandenv.put("Serverurl", propmain.getProperty("Serverurl"));
					fileandenv.put("Username", propmain.getProperty("Username"));
					fileandenv.put("Password", propmain.getProperty("Password"));

//				} else if (environment.equalsIgnoreCase("qaEnvironment")) {
//					FileInputStream fisQA = new FileInputStream(System.getProperty("user.dir") + "/inputs/qaEnvironment.properties");
//					propmain.load(fisQA);
//					fileandenv.put("Serverurl", propmain.getProperty("Serverurl"));
//					fileandenv.put("Username", propmain.getProperty("Username"));
//					fileandenv.put("Password", propmain.getProperty("Password"));
//				} else if (environment.equalsIgnoreCase("stagingEnvironment")) {
//					FileInputStream fisStaging = new FileInputStream(System.getProperty("user.dir") + "/inputs/stagingEnvironment.propeties");
//					propmain.load(fisStaging);
//					fileandenv.put("Serverurl", propmain.getProperty("Serverurl"));
//					fileandenv.put("Username", propmain.getProperty("Username"));
//					fileandenv.put("Password", propmain.getProperty("Password"));
//				}
			}} catch (Exception e) {
				// TODO: handle exception
			}

			return fileandenv;

		}}

		public static Map<String, String> getConfigReader(){
		{
			if(fileandenv == null) {
				fileandenv = endAndFile();
			}
			
			
			return fileandenv;
			
		}

	
		

		
		
	}

	
	
	

}
