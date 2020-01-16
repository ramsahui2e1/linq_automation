package models;

import java.util.List;

public class BasicInfo {
  private String businessName;
  private String businessOwnerName;
  private List<ShopSubCat> shopSubCat;
  private String gstNumber;
  private String tempSubcat;
  private Boolean isActive;
  private List<OperatingHours> operatingHours;
//  private List<String> phoneNumbers;
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessOwnerName() {
		return businessOwnerName;
	}
	public void setBusinessOwnerName(String businessOwnerName) {
		this.businessOwnerName = businessOwnerName;
	}
	public List<ShopSubCat> getShopSubCat() {
		return shopSubCat;
	}
	public void setShopSubCat(List<ShopSubCat> shopSubCat) {
		this.shopSubCat = shopSubCat;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getTempSubcat() {
		return tempSubcat;
	}
	public void setTempSubcat(String tempSubcat) {
		this.tempSubcat = tempSubcat;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public List<OperatingHours> getOperatingHours() {
		return operatingHours;
	}
	public void setOperatingHours(List<OperatingHours> operatingHours) {
		this.operatingHours = operatingHours;
	}
//	public List<String> getPhoneNumbers() {
//		return phoneNumbers;
//	}
//	public void setPhoneNumbers(List<String> phoneNumbers) {
//		this.phoneNumbers = phoneNumbers;
//	}

}
