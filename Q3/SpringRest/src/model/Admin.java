package model;

public class Admin {
	int adminID;
	String adminName;
	int adminSalary;
	public Admin(int adminID, String adminName, int adminSalary) {
		super();
		this.adminID = adminID;
		this.adminName = adminName;
		this.adminSalary = adminSalary;
	}
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public int getAdminSalary() {
		return adminSalary;
	}
	public void setAdminSalary(int adminSalary) {
		this.adminSalary = adminSalary;
	}
	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", adminName=" + adminName + ", adminSalary=" + adminSalary + "]";
	}
}
