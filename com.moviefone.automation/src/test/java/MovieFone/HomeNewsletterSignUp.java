package MovieFone;

import org.testng.annotations.Test;

import pages.HomePage;

public class HomeNewsletterSignUp extends TestCaseBase{
	
	HomePage home;

	@Test
	public void Search(){
		home = new HomePage(driver);
		home.closeInterceptModal();
		home.enterEmail("emilio.valqui@gmail.com");
	}
}