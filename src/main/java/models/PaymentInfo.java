package models;

public class PaymentInfo {
    private Boolean ccDc ;
    private String mobikwikNumber ;
    private String paytmNumber ;
    private String phonepeNumber ;
    private String upi ;
	public Boolean getCcDc() {
		return ccDc;
	}
	public void setCcDc(Boolean ccDc) {
		this.ccDc = ccDc;
	}
	public String getMobikwikNumber() {
		return mobikwikNumber;
	}
	public void setMobikwikNumber(String mobikwikNumber) {
		this.mobikwikNumber = mobikwikNumber;
	}
	public String getPaytmNumber() {
		return paytmNumber;
	}
	public void setPaytmNumber(String paytmNumber) {
		this.paytmNumber = paytmNumber;
	}
	public String getPhonepeNumber() {
		return phonepeNumber;
	}
	public void setPhonepeNumber(String phonepeNumber) {
		this.phonepeNumber = phonepeNumber;
	}
	public String getUpi() {
		return upi;
	}
	public void setUpi(String upi) {
		this.upi = upi;
	}
}
