
public class ComplexNumber {
	public double real, imaginary;
	
	public ComplexNumber(double real, double imaginary) {
		this.imaginary = imaginary;
		this.real = real;
	}
	public double getImaginary() {
		return imaginary;
	}
	public double getReal() {
		return real;
	}
	public static void add(double real, double imaginary) {
		 System.out.println(imaginary + real);
	}
	public static void add( ComplexNumber c) {
		System.out.println(c.real + c.imaginary);
	}
	public static void subtract(double real, double imaginary) {
		 System.out.println(imaginary - real);
	}
	public static void subtract(ComplexNumber c) {
		 System.out.println(c.imaginary-c.real);
	}
	public static void main(String[] args) {
		add(15, 1500);
		subtract(430, 1550);
		add(new ComplexNumber(26, 46));
		subtract(new ComplexNumber(40, 330));
	}
}
