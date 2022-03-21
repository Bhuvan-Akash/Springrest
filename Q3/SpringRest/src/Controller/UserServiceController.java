package Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRestApp.model.User;
import com.springrest.SpringRestApp.service.UserService;

@RestController
public class UserServiceController {
	@Autowired
	private UserService all_users;
	
	@GetMapping("/users")
	public UserService getAll_users() {
		return all_users;
	}
	@SuppressWarnings("static-access")
	@GetMapping("/allusers")
	public List<User> getUser(){
		return all_users.getUsers();
	}
	@PostMapping("/admin")
	public String toValidate(@RequestBody User NewUser) {
		return all_users.toValidate(NewUser.getUsername(), NewUser.getPassword());
	}
}
