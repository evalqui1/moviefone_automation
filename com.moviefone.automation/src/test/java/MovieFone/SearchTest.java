package MovieFone;

import org.testng.annotations.Test;

import pages.HomePage;

public class SearchTest extends TestCaseBase{

	HomePage home;
	
	@Test
	public void Search(){
		home = new HomePage(driver);
		home.closeInterceptModal();
		home.enterSearchTerm("Brooklyn Nine Nine");
		home.clickSearchIcon();
	}
}