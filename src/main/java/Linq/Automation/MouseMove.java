package Linq.Automation;

import org.testng.annotations.Test;

import staticData.MousePointer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class MouseMove {
  @Test
  public void f() {
  }
  @BeforeMethod
  @Parameters({"move"})
  public void beforeMethod(String move) throws AWTException {
	  Robot obj=new Robot();
       obj.delay(1000);
	  if(move.equals("left")) {
		  obj.mouseMove(MousePointer.getX()+50, MousePointer.getY());
		  obj.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		  obj.delay(1000);
		  obj.mouseMove(MousePointer.getX()-50, MousePointer.getY()); 
		  obj.delay(1000);
		  obj.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	  }
	  else if(move.equals("right")) {
		  obj.mouseMove(MousePointer.getX()-70, MousePointer.getY()-10);
		  obj.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		  obj.delay(1000);
		  obj.mouseMove(MousePointer.getX()+100, MousePointer.getY()-10); 
		  obj.delay(1000);
		  obj.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	  }
	  else if(move.equals("up")) {
		  obj.mouseMove(MousePointer.getX(), MousePointer.getY()+50);
		  obj.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		  obj.delay(1000);
		  obj.mouseMove(MousePointer.getX(), MousePointer.getY()-50); 
		  obj.delay(1000);
		  obj.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	  }
	  else if(move.equals("down")) {
		  obj.mouseMove(MousePointer.getX(), MousePointer.getY()-50);
		  obj.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		  obj.delay(1000);
		  obj.mouseMove(MousePointer.getX(), MousePointer.getY()+50); 
		  obj.delay(1000);
		  obj.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	  }
  }

}
