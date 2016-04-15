package MovieFone;

import org.testng.annotations.Test;

import pages.HomePage;

public class HomeNewsTest extends TestCaseBase{

	HomePage home;

	@Test
	public void Search(){
		home = new HomePage(driver);
		home.closeInterceptModal();  
		home.selectCarousel("News");
		home.clickMoreNewsButton();
	}
}