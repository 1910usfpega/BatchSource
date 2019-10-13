package group.examples.complexNumber;

public class ComplexNumber {
	
	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public static void main(String[] args) {
		
		ComplexNumber com = new ComplexNumber(3.0, 8.6);
		ComplexNumber num = new ComplexNumber(10.6, -8.5);
		ComplexNumber newNum = new ComplexNumber(0,0);
		
		newNum = com.add(num);
		System.out.println(newNum.toString());
		newNum = com.subtract(num);
		System.out.println(newNum.toString());
		
		
		
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void add(double real, double i) {
		this.real += real;
		this.imaginary += i;
	}
	
	public void subtract(double real, double i) {
		this.real -= real;
		this.imaginary -= i;
	}
	
	public ComplexNumber add(ComplexNumber n) {
		this.real += n.real;
		this.imaginary += n.imaginary;
		return this;
	}
	
	public ComplexNumber subtract(ComplexNumber n){
		this.real -= n.real;
		this.imaginary -= n.imaginary;
		return this;
	}

	@Override
	public String toString() {
		return "ComplexNumber [real=" + real + ", imaginary=" + imaginary + "]";
	}
	
	
	
}
