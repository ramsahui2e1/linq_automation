package models;

public class ExternalLink {
    private String label ;
    private String url ;
    private Boolean isRenderable ;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
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
}
