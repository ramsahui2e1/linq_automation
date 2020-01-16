package staticData;

import org.openqa.selenium.WebDriver;

public class Cookies {
	private static String appId;
	private static String authorization;
	private static String mobileNo;
	private static int linstId;
	public static String getAppId() {
		return appId;
	}
	public static  void setAppId(String appId) {
		Cookies.appId = appId;
	}
	public static String getAuthorization() {
		return authorization;
	}
	public static void setAuthorization(String authorization) {
		Cookies.authorization = authorization;
	}
	public static String getMobileNo() {
		return mobileNo;
	}
	public static void setMobileNo(String mobileNo) {
		Cookies.mobileNo = mobileNo;
	}
	public static int getLinstId() {
		return linstId;
	}
	public static void setLinstId(int linqId) {
		Cookies.linstId = linqId;
	}
	public static void loadCokkies(WebDriver driver) {
		try {
		   appId=driver.manage().getCookieNamed("appId").getValue();
		}catch(Exception ex) {
		   appId=null;
		}
		
		try {
		    mobileNo=driver.manage().getCookieNamed("mobile").getValue();
		}catch(Exception ex) {
			mobileNo=null;
		}
		
		try {
		     authorization=driver.manage().getCookieNamed("token").getValue();
		}catch(Exception ex) {
		     authorization=	"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjIwMTE2NCIsInN1YmplY3QiOiJMSU5RIiwidmVyc2lvbiI6IjEiLCJ0eXBlIjoiU0lHTklOIiwiZGF0YSI6ImMwY2IyNjUwZTUyMjZiOGIyNDE1Y2EwMmI1NTVkYmJiNjMyZDc1MDg4OWExYmYyYjI4N2Y2Zjk2ZGRhNTJhNDIiLCJuYmYiOjE1NDU4ODcxNTYsImV4cCI6MTU0NTg5NDM1NiwiaWF0IjoxNTQ1ODg3MTU2fQ.suK1OE8q_HzXdzIX3Ib_Yc3ADPgoFywiQqEj62L_xzc";
		}
	}

}
