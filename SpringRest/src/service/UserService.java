package service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springrest.SpringRestApp.model.User;

@Component
public class UserService {
	private static List<User> users=new ArrayList<>();
	static {
		users.add(new User("adarsh","123456"));
		users.add(new User("ankit","12345"));
		users.add(new User("adi","1234"));
		users.add(new User("rahul","12345678"));
		users.add(new User("arya","654321"));
	}
	public static List<User> getUsers(){
		return users;
	}
	public static void setUsers(List<User> users) {
		UserService.users=users;
	}
	public String toValidate(String user1,String password1) {
		for (User user : users) {
			if(user1.equals(user.getUsername())){
				if(password1.equals(user.getPassword()))
					return "User is Valid";
			}
			else {
				return "User not Valid";
			}
		}
		return "Not a Valid Function";
		
	}
	@Override
	public String toString() {
		return "UserService []";
	}
}
