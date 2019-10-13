public class ComplexNumber {
    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary =imaginary;
    }

    public void add(ComplexNumber cn) {
       add(cn.real, cn.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.imaginary -= imaginary;
        this.real -= real;
    }

    public void subtract(ComplexNumber cn) {
        subtract(cn.real, cn.imaginary);

    }
}
