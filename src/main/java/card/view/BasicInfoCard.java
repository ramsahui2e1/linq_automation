package card.view;

import org.testng.annotations.Test;
import models.AddressInfo;
import models.BasicInfo;
import staticData.GlobleData;
import staticData.LoadData;
import staticData.WebDriverElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners(Linq.Automation.ListenerTest.class)			
public class BasicInfoCard {
 //private String ShopSubCat = null;
 private BasicInfo basicInfo;
 private AddressInfo addressInfo;
 private WebDriver driver;
 private WebElement currentCard;
  @Test(priority=0)
  public void is_Basic_Card() {
	  String cardName=currentCard.getAttribute("card_id");
	  Assert.assertEquals("basic",cardName);
  }
  @Test(priority=1)
  public void b_name() {
	  List<WebElement> nam=currentCard.findElement(By.xpath("//div[contains(@class,'demo__basic__info')]")).findElements(By.tagName("p"));
	  Assert.assertEquals(basicInfo.getBusinessName(), nam.get(0).getText());
  }
  @Test(priority=2)
  public void b_subcat() {
	  List<WebElement> nam=currentCard.findElement(By.xpath("//div[contains(@class,'demo__basic__info')]")).findElements(By.tagName("p"));
	  List<WebElement> span=nam.get(1).findElements(By.tagName("span"));
	  String actualsubcat="";
	  String expectedSubCat="";
	  for(models.ShopSubCat cat : basicInfo.getShopSubCat()){
		  expectedSubCat+=cat.getSubCategory()+",";
	  }
	  for(WebElement s:span) {
		  actualsubcat+=s.getText();
	  }
	  expectedSubCat=expectedSubCat.substring(0, expectedSubCat.length()-1);
	  Assert.assertEquals(actualsubcat,expectedSubCat);
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
//	Dimension d = new Dimension(820,600);
//	//Resize the current window to the given dimension
//	driver.manage().window().setSize(d);
	driver.navigate().to("https://testease.linq.app/linq/"+linqId);
   // LoadData.listingForm=ApiRequest.getListing(linqId,"9031144771");
    basicInfo=LoadData.listingForm.getData().getBasicInfo();
    addressInfo=LoadData.listingForm.getData().getAddressInfo();
    currentCard=WebDriverElement.getCurrentCard(driver);
  }
  @AfterTest
  public void mouseMove() {
//	  HashMap<String,Integer> dim=WebDriverElement.getHeightWidth(driver);
//      int height=dim.get("height");
//      int width=dim.get("width");
//      try {
//		Robot obj=new Robot();
//		obj.mouseMove(width/2,height/2);
//		obj.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		obj.mouseMove(10, height/2);
//		obj.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//	} catch (AWTException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
      
  }

}
