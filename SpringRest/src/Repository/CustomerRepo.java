package Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.springrest.SpringRestApp.model.Customer;
public interface CustomerRepo extends MongoRepository<Customer, String>{

}
