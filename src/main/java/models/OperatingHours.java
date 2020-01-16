package models;

public class OperatingHours {
	  private String day;
	  private boolean  isOpen;
	  private String openingHour;
	  private String closingHour;
		public String getDay() {
			return day;
		}
		public void setDay(String day) {
			this.day = day;
		}
		public boolean isOpen() {
			return isOpen;
		}
		public void setOpen(boolean isOpen) {
			this.isOpen = isOpen;
		}
		public String getOpeningHour() {
			return openingHour;
		}
		public void setOpeningHour(String openingHour) {
			this.openingHour = openingHour;
		}
		public String getClosingHour() {
			return closingHour;
		}
		public void setClosingHour(String closingHour) {
			this.closingHour = closingHour;
		}
}
