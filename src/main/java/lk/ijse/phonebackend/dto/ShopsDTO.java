package lk.ijse.phonebackend.dto;

public class ShopsDTO {

    private String pname;
    private String sname;
    private String place;
	public ShopsDTO(String pname, String sname, String place) {
		this.pname = pname;
		this.sname = sname;
		this.place = place;
	}
	public ShopsDTO() {
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "ShopsDTO [pname=" + pname + ", sname=" + sname + ", place=" + place + "]";
	}
    
    
}
