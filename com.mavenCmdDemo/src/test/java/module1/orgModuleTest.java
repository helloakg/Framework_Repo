package module1;

import org.testng.annotations.Test;

public class orgModuleTest {

	@Test(groups = {"smoke"})
	public void CreateOrgTest() {
		String BROWSER_NAME = System.getProperty("browser","default_browser");
		String URL = System.getProperty("url","default_url");
		String USERNAME = System.getProperty("username","default_user");
		String PASSWORD = System.getProperty("password","default_password");
		
		System.out.println(BROWSER_NAME+"_"+URL+"_"+USERNAME+"_"+PASSWORD);
		
		System.out.println("--smoke: Executing Create Org---");
		System.out.println("--Open Browser---");
		System.out.println("--Create Org---");
		System.out.println("--Close Browser---");
		System.out.println("--Ending Create Org---\n");

	}

	@Test(groups = {"regression"})
	public void DeleteOrgTest() {
		String BROWSER_NAME = System.getProperty("browser","default_browser");
		String URL = System.getProperty("url","default_url");
		String USERNAME = System.getProperty("username","default_user");
		String PASSWORD = System.getProperty("password","default_password");
		
		System.out.println(BROWSER_NAME+"_"+URL+"_"+USERNAME+"_"+PASSWORD);
		System.out.println("--Regression: Executing delete Org---");
		System.out.println("--Open Browser---");
		System.out.println("--Delete Org---");
		System.out.println("--Close Browser---");
		System.out.println("--Ending delete Org---\n");
		//Assert.fail();

	}

}
