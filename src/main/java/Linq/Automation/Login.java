package Linq.Automation;

import org.testng.annotations.Test;

import models.LoginVerification;
import staticData.GlobleData;

import java.sql.Connection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners(Linq.Automation.ListenerTest.class)			
public class Login {
	 private  WebDriver driver;
	 private Connection con;
	 WebElement mob;
	 WebElement otp;
	 WebElement senOtpButton;
	 WebElement verifyOtp;
	 LoginVerification login;
	  @BeforeTest
	  @Parameters({"webdriver"})
	  public void beforeTest(String webdriver) {
		  driver=GlobleData.getChormeDriver("");
		  con=GlobleData.getDBcon();
		  login=GlobleData.getInputData().getLogin();
		  driver.navigate().to(GlobleData.getServer()+"/signin?returnTo=%2Fmylinqs%23LoginDone");   
	      mob=driver.findElement(By.id("mobile"));
	      senOtpButton= driver.findElement(By.xpath("//button[text()='RECEIVE OTP']"));
	  }
  @Test(priority=0)
	 public void digit1_mobileNo() {
		 mob.clear();
	     mob.sendKeys(login.getMobileVerification().getDigit1());
	     Assert.assertEquals("true", senOtpButton.getAttribute("disabled"));
	 }
  @Test(priority=1)
	 public void digit2_mobileNo() {
		 mob.clear();
	     mob.sendKeys(login.getMobileVerification().getDigit2());
	     Assert.assertEquals("true", senOtpButton.getAttribute("disabled"));
	 }  @Test(priority=2)
	 public void digit3_mobileNo() {
		 mob.clear();
	     mob.sendKeys(login.getMobileVerification().getDigit3());
	     Assert.assertEquals("true", senOtpButton.getAttribute("disabled"));
	 }  @Test(priority=3)
	 public void digit4_mobileNo() {
		 mob.clear();
	     mob.sendKeys(login.getMobileVerification().getDigit4());
	     Assert.assertEquals("true", senOtpButton.getAttribute("disabled"));
	 }  @Test(priority=4)
	 public void digit5_mobileNo() {
		 mob.clear();
	     mob.sendKeys(login.getMobileVerification().getDigit5());
	     Assert.assertEquals("true", senOtpButton.getAttribute("disabled"));
	 }  @Test(priority=5)
	 public void digit6_mobileNo() {
		 mob.clear();
	     mob.sendKeys(login.getMobileVerification().getDigit6());
	     Assert.assertEquals("true", senOtpButton.getAttribute("disabled"));
	 }  @Test(priority=6)
	 public void digit7_mobileNo() {
		 mob.clear();
	     mob.sendKeys(login.getMobileVerification().getDigit7());
	     Assert.assertEquals("true", senOtpButton.getAttribute("disabled"));
	 }
	  @Test(priority=7)
		 public void digit8_mobileNo() {
			 mob.clear();
		     mob.sendKeys(login.getMobileVerification().getDigit8());
		     Assert.assertEquals("true", senOtpButton.getAttribute("disabled"));
		 }  @Test(priority=8)
		 public void digit9_mobileNo() {
			 mob.clear();
		     mob.sendKeys(login.getMobileVerification().getDigit9());
		     Assert.assertEquals("true", senOtpButton.getAttribute("disabled"));
		 }  @Test(priority=9)
		 public void digit12_mobileNo() {
			 mob.clear();
		     mob.sendKeys(login.getMobileVerification().getDigit12());
		     Assert.assertEquals(login.getMobileVerification().getDigit12().substring(0,10), mob.getAttribute("value"));
		     Assert.assertEquals(null, senOtpButton.getAttribute("disabled"));
		 }  @Test(priority=10)
		 public void digit10_mobileNo() {
			 mob.clear();
		     mob.sendKeys(login.getMobileVerification().getDigit10());
		     Assert.assertEquals(null, senOtpButton.getAttribute("disabled"));
		 }
		 @Test(priority=11)
		 public void char_mobileNo() {
			 mob.clear();
		     mob.sendKeys(login.getMobileVerification().getTextData());
		     Assert.assertEquals("",mob.getAttribute("value"));
		     Assert.assertEquals(null, senOtpButton.getAttribute("disabled"));
		 }
		 @Test(priority=50)
		 public void submit_otp() {
			 mob.clear();
		     mob.sendKeys(login.getMobileNo()); 
		     senOtpButton.click();
		 }
	 @Test(priority=1000)
	 public void otp_panel_exist() {
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      otp=driver.findElement(By.id("otp"));
	      verifyOtp= driver.findElement(By.xpath("//button[text()='SUBMIT']"));

	 }
	 @Test(priority=1001)
	 public void digit1_otp() {
		 otp.clear();
		 otp.sendKeys(login.getOtpVerification().getDigit1());
	     Assert.assertEquals("true", verifyOtp.getAttribute("disabled"));
	 }
	 @Test(priority=1002)
	 public void digit2_otp() {
		 otp.clear();
		 otp.sendKeys(login.getOtpVerification().getDigit2());
	     Assert.assertEquals("true", verifyOtp.getAttribute("disabled"));
	 }
	 @Test(priority=1003)
	 public void digit3_otp() {
		 otp.clear();
		 otp.sendKeys(login.getOtpVerification().getDigit3());
	     Assert.assertEquals("true", verifyOtp.getAttribute("disabled"));
	 }
	 @Test(priority=1004)
	 public void digit4_otp() {
		 otp.clear();
		 otp.sendKeys(login.getOtpVerification().getDigit4());
	     Assert.assertEquals(null, verifyOtp.getAttribute("disabled"));
	 }
	 @Test(priority=1005)
	 public void char_otp() {
		 otp.clear();
		 otp.sendKeys(login.getOtpVerification().getTextData());
	     Assert.assertEquals("",otp.getAttribute("value"));
	     Assert.assertEquals("true", verifyOtp.getAttribute("disabled"));
	 }
}
