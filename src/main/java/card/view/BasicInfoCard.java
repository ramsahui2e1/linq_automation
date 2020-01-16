package card.view;

import org.testng.annotations.Test;

import databse.ApiRequest;
import models.AddressInfo;
import models.BasicInfo;
import staticData.GlobleData;
import staticData.ListingData;
import staticData.WebDriverElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BasicInfoCard {
 private static final String ShopSubCat = null;
private BasicInfo basicInfo;
private AddressInfo addressInfo;
 private WebDriver driver;
 private WebElement currentCard;
  @Test(priority=0)
  public void is_Basic_Card() {
	  String cardName=currentCard.getAttribute("card_id");
	  Assert.assertEquals("basic", cardName);
  }
  @Test(priority=1)
  public void b_name() {
	  List<WebElement> nam=currentCard.findElement(By.xpath("//div[contains(@class,'demo__basic__info')]")).findElements(By.tagName("p"));
	  Assert.assertEquals(basicInfo.getBusinessName(), nam.get(0).getText());
  }
  @Test(priority=2)
  public void b_subcat() {
	  List<WebElement> nam=currentCard.findElement(By.xpath("//div[contains(@class,'demo__basic__info')]")).findElements(By.tagName("p"));
	  String subcat="";
	  for(models.ShopSubCat cat : basicInfo.getShopSubCat()){
		  subcat+=cat.getSubCategory()+",";
	  }
	 // subcat=subcat.substring(0, subcat.length()-1);
	  Assert.assertEquals(subcat, nam.get(1).getText());
  }
  @Test(priority=3)
  public void b_address() {
	  List<WebElement> nam=currentCard.findElement(By.xpath("//div[contains(@class,'demo__basic__info')]")).findElements(By.tagName("p"));
	  Assert.assertEquals(addressInfo.getMarketPlace(), nam.get(2).getText());

  }
//  @Test(priority=4)
//  public void b_time() {
//	  String cardName=currentCard.getAttribute("card_id");
//	  Assert.assertEquals("basic", cardName);
//  }
  @BeforeTest
  @Parameters({"linqId"})
  public void beforeMethod(int linqId) {
	driver=GlobleData.getChormeDriver();
	driver.navigate().to("https://testease.linq.app/linq/6690");
    ListingData.listingForm=ApiRequest.getListing(linqId,"9031144771");
    basicInfo=ListingData.listingForm.getData().getBasicInfo();
    addressInfo=ListingData.listingForm.getData().getAddressInfo();
    currentCard=WebDriverElement.getCurrentCard(driver);
  }
  @AfterTest
  public void mouseMove() {
	  HashMap<String,Integer> dim=WebDriverElement.getHeightWidth(driver);
      int height=dim.get("height");
      int width=dim.get("width");
      try {
		Robot obj=new Robot();
		obj.mouseMove(width/2,height/2);
		obj.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		obj.mouseMove(10, height/2);
		obj.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
  }

}
