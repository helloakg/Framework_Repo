package module2;

import org.testng.annotations.Test;

public class contactModuleTest {

	@Test(groups = {"smoke"})
	
	public void CreateContactTest() {
		
		String BROWSER_NAME = System.getProperty("browser","default_browser");
		String URL = System.getProperty("url","default_url");
		String USERNAME = System.getProperty("username","default_user");
		String PASSWORD = System.getProperty("password","default_password");
		
		System.out.println(BROWSER_NAME+"_"+URL+"_"+USERNAME+"_"+PASSWORD);
		
		System.out.println("--Smoke: Executing Create Contact---");
		System.out.println("--Open Browser---");
		System.out.println("--Create Contact---");
		System.out.println("--Close Browser---");
		System.out.println("--Ending Create Contact---\n");

	}

	@Test(groups={"regression"})
	public void DeleteOrgTest() {
		String BROWSER_NAME = System.getProperty("browser","default_browser");
		String URL = System.getProperty("url","default_url");
		String USERNAME = System.getProperty("username","default_user");
		String PASSWORD = System.getProperty("password","default_password");
		
		System.out.println(BROWSER_NAME+"_"+URL+"_"+USERNAME+"_"+PASSWORD);
		
		System.out.println("--Regression: Executing delete Contact---");
		System.out.println("--Open Browser---");
		System.out.println("--Delete Contact---");
		System.out.println("--Close Browser---");
		System.out.println("--Ending delete contact---\n");
		//Assert.fail();

	}

}
