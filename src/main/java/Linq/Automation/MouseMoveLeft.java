package Linq.Automation;

import org.testng.annotations.Test;

import staticData.GlobleData;
import staticData.WebDriverElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

public class MouseMoveLeft {
  WebDriver driver;
  WebElement currentCard;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
//	  try {
//		Robot mouseEvent =new Robot();
//		driver.findElement(By.id("mobile"));
// 		mouseEvent.mouseMove(x, y);
//	} catch (AWTException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

	// WebElement chi=currentCard.findElement(By.xpath(""));
	
	  try {
		Robot mouseEvent =new Robot();
		mouseEvent.keyPress(KeyEvent.VK_CONTROL);
		mouseEvent.keyPress(KeyEvent.VK_SHIFT);
		mouseEvent.keyPress(KeyEvent.VK_I);
		mouseEvent.keyRelease(KeyEvent.VK_CONTROL);
		mouseEvent.keyRelease(KeyEvent.VK_SHIFT);
		mouseEvent.keyRelease(KeyEvent.VK_I);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mouseEvent.keyPress(KeyEvent.VK_CONTROL);
		mouseEvent.keyPress(KeyEvent.VK_SHIFT);
		mouseEvent.keyPress(KeyEvent.VK_M);
		mouseEvent.keyRelease(KeyEvent.VK_CONTROL);
		mouseEvent.keyRelease(KeyEvent.VK_SHIFT);
		mouseEvent.keyRelease(KeyEvent.VK_M);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver=GlobleData.getChormeDriver();
		 driver.navigate().to(GlobleData.getServer()+"/linq/6690");
		 currentCard=WebDriverElement.getCurrentCard(driver);
		 HashMap<String,Integer> dim=WebDriverElement.getHeightWidth(driver);
		int width=dim.get("width");
		int height=dim.get("height");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		int tempWidth=width/2;	
		mouseEvent.mouseMove((width/2),(height)/2);
		mouseEvent.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		while(tempWidth>1) {
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		mouseEvent.mouseMove(tempWidth,(height)/2);
//		tempWidth-=10;
//		}
		mouseEvent.mouseMove(0,(height)/2);
		mouseEvent.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		}
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     System.out.println("Current Card="+currentCard.getAttribute("card_id"));
  }

}
