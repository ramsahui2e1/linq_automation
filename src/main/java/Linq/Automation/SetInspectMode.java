package Linq.Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SetInspectMode {
  @Test
  public void test1() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
    try {
		Robot obj=new Robot();
		//inspect mode
		obj.keyPress(KeyEvent.VK_CONTROL);
		obj.keyPress(KeyEvent.VK_SHIFT);
		obj.keyPress(KeyEvent.VK_I);
		obj.delay(500);
		obj.keyRelease(KeyEvent.VK_CONTROL);
		obj.keyRelease(KeyEvent.VK_SHIFT);
		obj.keyRelease(KeyEvent.VK_I);
		obj.delay(500);
		//mobile mode
		obj.keyPress(KeyEvent.VK_CONTROL);
		obj.keyPress(KeyEvent.VK_SHIFT);
		obj.keyPress(KeyEvent.VK_M);
		obj.delay(500);
		obj.keyRelease(KeyEvent.VK_CONTROL);
		obj.keyRelease(KeyEvent.VK_SHIFT);
		obj.keyRelease(KeyEvent.VK_M);
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

}
