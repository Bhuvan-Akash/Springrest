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

import com.springrest.SpringRestApp.model.Customer;
import com.springrest.SpringRestApp.service.CustomerService;

@RestController
public class CustomerController {
	Autowired
	private CustomerService customerService;
	
	//Get all customer
	    @GetMapping("/customer")
		public List<Customer> getAllCustomer(){
			return customerService.getAll();
		}
		//Adding a customer
		@PostMapping("/addCustomer")
		public void addCustomer(@RequestBody Customer cust) {
			customerService.addCustomer(cust);
		}
		//Update a Customer
		@PutMapping("/customer/{id}")
		public void updateCustomer(@RequestBody Customer c,@PathVariable int id) {
			customerService.updateCustomer(c, id);
		}
		
		//Delete all Customer
		@DeleteMapping("/deleteCustomer")
		public void deleteAllOrder() {
			customerService.deleteAllCustomer();
		}
}
