import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ZipCodeController {
	@ResponseBody
	@RequestMapping(value="/zipcode",method=RequestMethod.GET)
	@GetMapping("/zipcode")
	public List<ZipCode> getZipCode(){
		return Arrays.asList(new ZipCode(99501,"AK","ANCHORAGE","US"),
				new ZipCode(99502,"BK","BROOKLYN","US"),
				new ZipCode(700054,"KOLKATA","WEST BENGAL","INDIA"));
		}
	@ResponseBody
    @RequestMapping(value="/zipcode/{pincode}", method=RequestMethod.GET)
    public ZipCode getZipCode(@PathVariable("pincode") long pincode) {
	     ZipCode zipcode=new ZipCode(99501, "AK","ANCHORAGE","US");
	     zipcode.setPincode(pincode);
	     return zipcode;
	     
	    
	}
}
