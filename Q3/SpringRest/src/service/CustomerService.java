package service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.SpringRestApp.Repository.CustomerRepo;
import com.springrest.SpringRestApp.model.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo customerRepo;
	public static List<Customer> cust=new ArrayList<>();
	void createCustomer() {
		customerRepo.save(new Customer(101,"Adarsh",21,"Male"));
		customerRepo.save(new Customer(102,"Ankit",22,"Male"));
		customerRepo.save(new Customer(103,"Parth",21,"Male"));
		customerRepo.save(new Customer(104,"Aman",22,"Male"));
		customerRepo.save(new Customer(105,"Muskan",21,"Female"));
	}
	//Getting Customer
	public List<Customer> getAll(){
		createCustomer();
		return customerRepo.findAll();
	}
	//Adding a Customer
	public void addCustomer(Customer c) {
		customerRepo.save(c);
	}
	//Deleting all Customer
	public void deleteAllCustomer() {
		customerRepo.deleteAll();
	}
	//Updating a customer
	public void updateCustomer(Customer cust,int id) {
		if(id==cust.getCustomerId()) {
			customerRepo.save(cust);
		}
	}
}
