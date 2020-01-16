package models;

import java.util.List;

public class MenuInfo {
    private Boolean isMenu ;
    private int contentType ;
    private List<Long> photoIds ;
    private String url ;
    private Boolean isRenderable ;
	public Boolean getIsMenu() {
		return isMenu;
	}
	public void setIsMenu(Boolean isMenu) {
		this.isMenu = isMenu;
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
	public Boolean getIsRenderable() {
		return isRenderable;
	}
	public void setIsRenderable(Boolean isRenderable) {
		this.isRenderable = isRenderable;
	}
	public int getContentType() {
		return contentType;
	}
	public void setContentType(int contentType) {
		this.contentType = contentType;
	}
	
    
}
