package models;

import java.util.HashMap;

public class FacilitiesInfo {
    private Boolean homeDelivery ;
    private Boolean khata ;
    private Boolean lateNight ;
    private Boolean tfour ;
    private Boolean expressDelivery ;
    private HashMap<String, String> facilityList ;
	public Boolean getHomeDelivery() {
		return homeDelivery;
	}
	public void setHomeDelivery(Boolean homeDelivery) {
		this.homeDelivery = homeDelivery;
	}
	public Boolean getKhata() {
		return khata;
	}
	public void setKhata(Boolean khata) {
		this.khata = khata;
	}
	public Boolean getLateNight() {
		return lateNight;
	}
	public void setLateNight(Boolean lateNight) {
		this.lateNight = lateNight;
	}
	public Boolean getTfour() {
		return tfour;
	}
	public void setTfour(Boolean tfour) {
		this.tfour = tfour;
	}
	public Boolean getExpressDelivery() {
		return expressDelivery;
	}
	public void setExpressDelivery(Boolean expressDelivery) {
		this.expressDelivery = expressDelivery;
	}
	public HashMap<String, String> getFacilityList() {
		return facilityList;
	}
	public void setFacilityList(HashMap<String, String> facilityList) {
		this.facilityList = facilityList;
	}
    
}
