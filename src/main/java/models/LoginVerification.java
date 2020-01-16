package models;

public class LoginVerification {
     private MobileNoVerification mobileVerification;
     private String mobileNo;
     private OtpVerification otpVerification;
	public MobileNoVerification getMobileVerification() {
		return mobileVerification;
	}
	public void setMobileVerification(MobileNoVerification mobileVerification) {
		this.mobileVerification = mobileVerification;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public OtpVerification getOtpVerification() {
		return otpVerification;
	}
	public void setOtpVerification(OtpVerification otpVerification) {
		this.otpVerification = otpVerification;
	}
     
}
