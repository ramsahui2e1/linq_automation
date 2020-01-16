package staticData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverElement {
   public static WebElement getCurrentCard(WebDriver driver) {
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   List<WebElement> tempCard=   driver.findElements(By.xpath("//div[contains(@class,'demo__card') and not(contains(@class,'below'))]"));
	   ArrayList<WebElement> card = new ArrayList<WebElement>();
       for(int i=0;i<tempCard.size();i++) {
	    	 WebElement tcard=tempCard.get(i);
	    	 if(tcard.getAttribute("card_id")!=null) {
	    		 card.add(tcard);
	    	 }
          }
       if(card.size()>0)
         return card.get(card.size()-1);
       else 
    	  return null;
   }
   public static HashMap<String,Integer> getHeightWidth(WebDriver driver){
	   WebElement ele=driver.findElement(By.tagName("body"));
	   HashMap<String,Integer> dim=new HashMap<String,Integer>();
	   int width= Integer.parseInt(ele.getCssValue("width").replaceAll("px",""));
	   int height=  Integer.parseInt(ele.getCssValue("height").replaceAll("px",""));
	   dim.put("width", width);
	   dim.put("height", height);
	   return dim;
   }
}
