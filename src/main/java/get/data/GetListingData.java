package get.data;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import databse.ApiRequest;
import staticData.ListingData;
public class GetListingData {
  @Test
  public void f() {
  }
  @BeforeTest
  @Parameters({"linqId","mobile"})
  public void fetch_get_listing_data(int linqId,String mobile) {
	  ListingData.listingForm=ApiRequest.getListing(linqId,mobile);
	  Assert.assertEquals(0,ListingData.listingForm.getStatus());
  }
}
