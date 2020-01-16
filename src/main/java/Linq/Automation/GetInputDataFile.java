package Linq.Automation;

import org.testng.annotations.Test;

import staticData.GlobleData;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class GetInputDataFile {
  @Test
  public void f() {
  }
  @BeforeMethod
  @Parameters({"fileName"})
  public void fetch_input_data_in_file(String fileName) {
	 GlobleData.loadData(fileName);
	 Assert.assertNotNull(GlobleData.getInputData());
  }

}
