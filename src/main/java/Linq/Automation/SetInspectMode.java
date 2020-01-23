package Linq.Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import staticData.MousePointer;

public class SetInspectMode {
  @Test
  public void test1() {
	  
  }
  @BeforeMethod
  @Parameters({"inspectMode","modeType"})
  public void beforeMethod(boolean inspectMode,String modeType) {
    try {
		Robot obj=new Robot();
		obj.keyPress(KeyEvent.VK_F11);
		obj.keyRelease(KeyEvent.VK_F11);
		obj.delay(100);
		if(inspectMode) {
			obj.keyPress(KeyEvent.VK_CONTROL);
			obj.keyPress(KeyEvent.VK_SHIFT);
			obj.keyPress(KeyEvent.VK_I);
			obj.delay(500);
			obj.keyRelease(KeyEvent.VK_CONTROL);
			obj.keyRelease(KeyEvent.VK_SHIFT);
			obj.keyRelease(KeyEvent.VK_I);
			obj.delay(500);
			obj.keyPress(KeyEvent.VK_CONTROL);
			obj.keyPress(KeyEvent.VK_SHIFT);
			obj.keyPress(KeyEvent.VK_M);
			obj.delay(500);
			obj.keyRelease(KeyEvent.VK_CONTROL);
			obj.keyRelease(KeyEvent.VK_SHIFT);
			obj.keyRelease(KeyEvent.VK_M);
		}
		else {
			
		}
		if(inspectMode && modeType.equals("galaxy") ) {
			obj.mouseMove(320,50);
			obj.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			obj.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			obj.delay(120);
			obj.mouseMove(350, 120);
			obj.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			obj.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			MousePointer.setX(400);
			MousePointer.setY(400);
		}
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

}
