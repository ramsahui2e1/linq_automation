package models;

public class ShopSubCat {
  private int id;
  private int brand_cat_id;
  private String subCategory;
  private Boolean isProduct;
  private Boolean isService;
  private Boolean isPublic;
  private int imgCount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBrand_cat_id() {
		return brand_cat_id;
	}
	public void setBrand_cat_id(int brand_cat_id) {
		this.brand_cat_id = brand_cat_id;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public Boolean getIsProduct() {
		return isProduct;
	}
	public void setIsProduct(Boolean isProduct) {
		this.isProduct = isProduct;
	}
	public Boolean getIsService() {
		return isService;
	}
	public void setIsService(Boolean isService) {
		this.isService = isService;
	}
	public Boolean getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}
	public int getImgCount() {
		return imgCount;
	}
	public void setImgCount(int imgCount) {
		this.imgCount = imgCount;
	}
}
