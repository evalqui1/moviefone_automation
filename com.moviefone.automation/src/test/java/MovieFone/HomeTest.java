package MovieFone;

import org.testng.annotations.Test;

import pages.HomePage;

public class HomeTest extends TestCaseBase{
	
	HomePage home;
	
	@Test
	public void Search(){
		home = new HomePage(driver);
		home.closeInterceptModal();
		home.clickRightArrow();
		home.enterSearchTerm("Brooklyn Nine Nine");
		home.selectCarousel("In Theaters");
		home.selectCarousel("Coming Soon");
		home.selectCarousel("On TV");
		home.selectCarousel("New on Netflix");
		home.selectCarousel("News");
	}

}
