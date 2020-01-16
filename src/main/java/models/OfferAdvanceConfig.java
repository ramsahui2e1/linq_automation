package models;

import java.util.List;

public class OfferAdvanceConfig {
    private String startDate ;
    private String endDate ;
    private List<Boolean> highLight ;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public List<Boolean> getHighLight() {
		return highLight;
	}
	public void setHighLight(List<Boolean> highLight) {
		this.highLight = highLight;
	}
    
}
