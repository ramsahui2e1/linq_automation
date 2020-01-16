package models;

public class GetListing {
  private int status;
  private String msg;
  private ListingForm data;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ListingForm getData() {
		return data;
	}
	public void setData(ListingForm data) {
		this.data = data;
	}
  
}
