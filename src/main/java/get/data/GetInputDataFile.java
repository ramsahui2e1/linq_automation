package get.data;

import org.testng.annotations.Test;

import staticData.LoadData;

import java.io.FileNotFoundException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class GetInputDataFile {
  @Test
  public void f() {
  }
  @BeforeMethod
  @Parameters({"fileName"})
  public void fetch_input_data_in_file(String fileName) throws FileNotFoundException {
   LoadData.InputDataByFile(fileName);
  }

}
