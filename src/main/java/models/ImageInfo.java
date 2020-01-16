package models;

import java.util.List;

public class ImageInfo {
    private int contentType ;
    private List<Long> photoIds ;
    private List<String> captions ;
	private List<String> shopPhotos ;
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
	public List<String> getShopPhotos() {
		return shopPhotos;
	}
	public void setShopPhotos(List<String> shopPhotos) {
		this.shopPhotos = shopPhotos;
	}
	public List<String> getCaptions() {
		return captions;
	}
	public void setCaptions(List<String> captions) {
		this.captions = captions;
	}
	
}
