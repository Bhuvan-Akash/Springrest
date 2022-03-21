package service;
import org.springframework.stereotype.Component;

import com.springrest.SpringRestApp.model.Calculator;


@Component
public class CalculatorService {
	Calculator calculator;
	static {
		CalculatorService cal=new CalculatorService();
	}
	public Calculator createValues() {
		Calculator calc=new Calculator(2,3);
		return calc;
	}
	public int add(Calculator value) {
		createValues();
		return value.getNum1() + value.getNum2();
	}
	public int sub(Calculator value) {
		createValues();
		return value.getNum1() - value.getNum2();
	}
	public int mul(Calculator value) {
		createValues();
		return value.getNum1() * value.getNum2();
	}
	public int div(Calculator value) {
		createValues();
		return value.getNum1() / value.getNum2();
	}
}
