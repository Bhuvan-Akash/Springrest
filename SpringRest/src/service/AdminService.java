package service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.SpringRestApp.Repository.AdminRepo;
import com.springrest.SpringRestApp.model.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminRepo adminRepo;
	public static List<Admin> admins=new ArrayList<>();
	void createAdmin() {
		adminRepo.save(new Admin(101,"Adarsh",15000));
		adminRepo.save(new Admin(102,"Ankit",19500));
		adminRepo.save(new Admin(103,"Parth",17500));
		adminRepo.save(new Admin(104,"Aman",18000));
	}
	//Getting Admin
	public List<Admin> getAll(){
		createAdmin();
		return adminRepo.findAll();
	}
	//Adding an Admin
	public void addAdmin(Admin a) {
		adminRepo.save(a);
	}
	//Deleting an Admin
	public void deleteAllAdmin() {
		adminRepo.deleteAll();
	}
	//Updating an admin
	public void updateAdmin(Admin admn,int id) {
		if(id==admn.getAdminID()) {
			adminRepo.save(admn);
		}
	}
	
}
