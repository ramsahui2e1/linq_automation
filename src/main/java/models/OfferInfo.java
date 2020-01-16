package models;

import java.util.List;

import org.json.JSONObject;

public class OfferInfo {
    private int contentType ;
    private List<Long> photoIds ;
    private String url ;
    private String text ;
    private Boolean isRenderable ;
    private Boolean isExpired ;
    private List<OfferAdvanceConfig> offerAdvanceConfigs;
    private List<JSONObject> attributes ;
    
	public List<JSONObject> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<JSONObject> attributes) {
		this.attributes = attributes;
	}
	public int getContentType() {
		return contentType;
	}
	public void setContentType(int contentType) {
		this.contentType = contentType;
	}
	public List<Long> getPhotoIds() {
		return photoIds;
	}
	public void setPhotoIds(List<Long> photoIds) {
		this.photoIds = photoIds;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Boolean getIsRenderable() {
		return isRenderable;
	}
	public void setIsRenderable(Boolean isRenderable) {
		this.isRenderable = isRenderable;
	}
	public Boolean getIsExpired() {
		return isExpired;
	}
	public void setIsExpired(Boolean isExpired) {
		this.isExpired = isExpired;
	}
	public List<OfferAdvanceConfig> getOfferAdvanceConfigs() {
		return offerAdvanceConfigs;
	}
	public void setOfferAdvanceConfigs(List<OfferAdvanceConfig> offerAdvanceConfigs) {
		this.offerAdvanceConfigs = offerAdvanceConfigs;
	}
    
    
}
