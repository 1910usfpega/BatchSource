
public class interfacesExample implements NumericInterface{

	public void addition(Double num1, Double num2) {
		double result  = num1+num2;
		System.out.println("Addition\n"+result);
		
	}

	public void subtraction(Double num1, Double num2) {
		double result  = num1-num2;
		System.out.println("Subtraction\n"+result);
	}

	public void multiplication(Double num1, Double num2) {
		double result  = num1*num2;
		System.out.println("Multiplication\n"+result);		
	}

	public void division(Double num1, Double num2) {
		double result  = num1/num2;
		System.out.println("Division\n"+result);		
	}
	
}
