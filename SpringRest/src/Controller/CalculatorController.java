package Controller;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRestApp.model.Calculator;
import com.springrest.SpringRestApp.service.CalculatorService;

@RestController
public class CalculatorController {
	@Autowired
	CalculatorService calculatorService;
	
	@GetMapping("/calculator")
	public String calculator() {
		return "Select 1 method";
	}
	@PostMapping("/calculator/add")
	public int calculator_add(@RequestBody Calculator value) {
		return calculatorService.add(value);
	}
	@PostMapping("/calculator/sub")
	public int calculator_sub(@RequestBody Calculator value) {
		return calculatorService.sub(value);
	}
	@PostMapping("/calculator/mul")
	public int calculator_mul(@RequestBody Calculator value) {
		return calculatorService.mul(value);
	}
	@PostMapping("/calculator/div")
	public int calculator_div(@RequestBody Calculator value) {
		return calculatorService.div(value);
	}
}
