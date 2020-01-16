package models;

import java.util.List;

public class SpecialInfo {
    private String famousFor ;
    private List<String> productsOffered ;
    private String story ;
	public String getFamousFor() {
		return famousFor;
	}
	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	public List<String> getProductsOffered() {
		return productsOffered;
	}
	public void setProductsOffered(List<String> productsOffered) {
		this.productsOffered = productsOffered;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
    
}
