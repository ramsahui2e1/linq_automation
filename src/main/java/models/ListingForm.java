package models;


public class ListingForm {
    private int brand_id ;
    private int listingId ;
    private String ownerMobile ;
    private BasicInfo basicInfo ;
    private AddressInfo addressInfo ;
    private PaymentInfo paymentInfo ;
    private SocialInfo socialInfo ;
    private ImageInfo imageInfo ;
    private FacilitiesInfo facilitiesInfo ;
    private SpecialInfo specialInfo ;
    private ExternalLinksInfo externalLinksInfo ;
    private MenuInfo menuInfo ;
    private OrderInfo orderInfo ;
    private OfferInfo offerInfo ;
    private CatalogueInfo catalogueInfo ;
    private String addedTime ;
    private String modifiedTime ;
    
	public String getAddedTime() {
		return addedTime;
	}
	public void setAddedTime(String addedTime) {
		this.addedTime = addedTime;
	}
	public String getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public int getListingId() {
		return listingId;
	}
	public void setListingId(int listingId) {
		this.listingId = listingId;
	}
	public String getOwnerMobile() {
		return ownerMobile;
	}
	public void setOwnerMobile(String ownerMobile) {
		this.ownerMobile = ownerMobile;
	}
	public BasicInfo getBasicInfo() {
		return basicInfo;
	}
	public void setBasicInfo(BasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}
	public AddressInfo getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public SocialInfo getSocialInfo() {
		return socialInfo;
	}
	public void setSocialInfo(SocialInfo socialInfo) {
		this.socialInfo = socialInfo;
	}
	public ImageInfo getImageInfo() {
		return imageInfo;
	}
	public void setImageInfo(ImageInfo imageInfo) {
		this.imageInfo = imageInfo;
	}
	public FacilitiesInfo getFacilitiesInfo() {
		return facilitiesInfo;
	}
	public void setFacilitiesInfo(FacilitiesInfo facilitiesInfo) {
		this.facilitiesInfo = facilitiesInfo;
	}
	public SpecialInfo getSpecialInfo() {
		return specialInfo;
	}
	public void setSpecialInfo(SpecialInfo specialInfo) {
		this.specialInfo = specialInfo;
	}
	public ExternalLinksInfo getExternalLinksInfo() {
		return externalLinksInfo;
	}
	public void setExternalLinksInfo(ExternalLinksInfo externalLinksInfo) {
		this.externalLinksInfo = externalLinksInfo;
	}
	public MenuInfo getMenuInfo() {
		return menuInfo;
	}
	public void setMenuInfo(MenuInfo menuInfo) {
		this.menuInfo = menuInfo;
	}
	public OrderInfo getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}
	public OfferInfo getOfferInfo() {
		return offerInfo;
	}
	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}
	public CatalogueInfo getCatalogueInfo() {
		return catalogueInfo;
	}
	public void setCatalogueInfo(CatalogueInfo catalogueInfo) {
		this.catalogueInfo = catalogueInfo;
	}
    
}
