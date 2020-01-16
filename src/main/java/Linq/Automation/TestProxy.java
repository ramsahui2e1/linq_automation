package Linq.Automation;

import org.testng.annotations.Test;

import databse.ApiRequest;
import staticData.Cookies;
import staticData.GlobleData;
import staticData.ListingData;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestProxy {
  @Test
  public void f() {
  }
  @BeforeMethod
  @Parameters({"webdriver","fileName","linqId"})
  public void beforeMethod(String webdriver,String fileName,int linqId) {
	  GlobleData obj =new GlobleData(webdriver);
	  obj.loadData(fileName);
	  WebDriver driver=GlobleData.getChormeDriver();
	  driver.navigate().to(GlobleData.getServer()+"/linq/6690");   
      Cookies.loadCokkies(GlobleData.getChormeDriver());
      Cookies.setLinstId(linqId);
      //ListingData.listingForm=ApiRequest.getListing(linqId);
      System.out.println( ListingData.listingForm.getData().getListingId());
     // System.out.println(ApiRequest.getListing(linqId));
      System.out.println(Cookies.getAppId());
      System.out.println(Cookies.getAuthorization());
      System.out.println(Cookies.getMobileNo());
  }

}
