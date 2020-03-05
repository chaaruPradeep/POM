package testcases.email;

import org.testng.annotations.Test;

import base.Page;
import pages.LandingPage;
import pages.MyProfilePage;

public class UploadPhotoTest {
	
	@Test
	public void uploadPhoto() {
		
		//LandingPage lp = new LandingPage();
		LandingPage lp = Page.topNav.gotoLandingPage();
		
		MyProfilePage mp = lp.gotoProfile();
		mp.uploadImage();
		Page.topNav.logOut();

	}

}
