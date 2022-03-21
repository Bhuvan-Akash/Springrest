package Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.springrest.SpringRestApp.model.Admin;
public interface AdminRepo extends MongoRepository<Admin,String > {

}
