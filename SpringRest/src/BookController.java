import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BookController {
	 @GetMapping("/")
	    public String Hello(){
	        return "Hello Adarsh";
	    }
	    @ResponseBody
	    @RequestMapping(value="/books", method=RequestMethod.GET)
	    @GetMapping("/books")
	    public List<Book> getAllBooks(){
	        return Arrays.asList(new Book(1l, "Physics", "Adarsh"),
	        		new Book(2l,"Chemistry","Ankit"));
	    }
	    @ResponseBody
	    @RequestMapping(value="/books/{name}", method=RequestMethod.GET)
	    public Book getBook(@PathVariable("name") String name) {
	    	Book book=new Book(3l, "eco", "aditya");
	    	book.setName(name);
	    	book.setAuthor("Aditya");
	    	return book;
	    }
	    @RequestMapping(value="/books/{name}", method=RequestMethod.PUT)
	    public boolean updateBook(@PathVariable("name") String author, @RequestBody Book book) {
	    	System.out.println("Author name:"+author);
	    	System.out.println("Author name:"+book.getName()+" Book id:"+book.getId());
	    	return true;
	    }
}
