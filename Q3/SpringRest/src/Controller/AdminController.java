package Controller;
 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRestApp.model.Admin;
import com.springrest.SpringRestApp.service.AdminService;

@RestController
public class AdminController {

}
@Autowired
private AdminService adminService;
//Get all admin
@GetMapping("/admin")
public List<Admin> getAllAdmin(){
	return adminService.getAll();
}
//place an admin
@PostMapping("/placeAdmin")
public void addAdmin(@RequestBody Admin admn) {
	adminService.addAdmin(admn);
}
//Update an admin
@PutMapping("/admin/{id}")
public void updateAdmin(@RequestBody Admin a,@PathVariable int id) {
	adminService.updateAdmin(a, id);
}

//Delete an order
@DeleteMapping("/deleteadmin")
public void deleteAllOrder() {
	adminService.deleteAllAdmin();
}