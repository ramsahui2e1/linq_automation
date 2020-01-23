package get.data;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import databse.ApiRequest;
import staticData.LoadData;
public class GetListingData {
  @Test
  public void f() {
  }
  @BeforeTest
  @Parameters({"accessType","linqId","mobile","fileName"})
  public void fetch_get_listing_data(String accessType,int linqId,String mobile,String fileName) throws FileNotFoundException {
	 if(accessType.equals("file")) {
        LoadData.ListingDataByFile(fileName);
	 }
	 else if(accessType.equals("api")) {
		 LoadData.listingForm=ApiRequest.getListing(linqId,mobile);
	 }
	  Assert.assertEquals(0,LoadData.listingForm.getStatus());
  }
}
