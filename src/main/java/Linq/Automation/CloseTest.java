package Linq.Automation;

import org.testng.annotations.Test;

import staticData.GlobleData;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class CloseTest {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  GlobleData.setChormeDriver(null);
	  GlobleData.setDBcon(null);
	  GlobleData.setInputData(null);
	  GlobleData.setProps(null);
	  GlobleData.setServer(null);
	  Assert.assertNull(GlobleData.getChormeDriver());
	  Assert.assertNull(GlobleData.getDBcon());
	  Assert.assertNull(GlobleData.getInputData());
	  Assert.assertNull(GlobleData.getProps());
	  Assert.assertNull(GlobleData.getServer());
  }

}
