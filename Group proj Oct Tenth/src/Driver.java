//Partner name: Stephen
public class Driver {
	public static void main(String[] args) {
		counter(5, 1,5,3,4,2,1);
		System.out.println(subtract(14, 13));
		System.out.println(subtract(14.3, 3.1));
		System.out.println(subtract(14, 31.3));
	}
	//Varargs
	public static void counter(int start, int ... s) {
		for (int i : s) {
			System.out.println(s[i]);
		}
	}
	//Boxing
	public static int subtract(int a , int b) {
		return a-b;
	}
	public static double subtract(double a, double b) {
		return a-b;
	}
	//Method Overloading
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "toString overloaded!";
	}
}
