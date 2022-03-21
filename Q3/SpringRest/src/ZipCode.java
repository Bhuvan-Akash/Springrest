
public class ZipCode {
	long pincode;
	String state,city,country;
	public ZipCode(long pincode, String state, String city, String country) {
		this.pincode = pincode;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "ZipCode [pincode=" + pincode + ", state=" + state + ", city=" + city + ", country=" + country + "]";
	}

	
	
}
