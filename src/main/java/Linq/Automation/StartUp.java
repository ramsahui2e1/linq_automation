package Linq.Automation;


import staticData.Cookies;
import staticData.GlobleData;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StartUp {
	@Test
	 public void testSteup() {
		
	}
	 @BeforeMethod
	 @Parameters({"webdriver"})
    public void beforeClass(String webdriver) {
	  @SuppressWarnings("unused")
	  GlobleData obj =new GlobleData(webdriver);
	  Cookies.loadCokkies(GlobleData.getChormeDriver());
	  Assert.assertNotNull(GlobleData.getChormeDriver());
	  Assert.assertNotNull(GlobleData.getDBcon());
	  Assert.assertNotNull(GlobleData.getProps());
	  Assert.assertNotNull(GlobleData.getServer());
  }

}
