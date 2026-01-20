import java.util.Scanner;
class BasicCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value:");
		double a = sc.nextDouble();
		System.out.println("Enter Second value:");
		double b = sc.nextDouble();
		double Add = a+b;
		double Sub = a-b;
		double Multi = a*b;
		double Div = a/b;
		double Mod = a%b;
		System.out.println("Addition is:" + Add + "\n" +
		"Subtraction is:" + Sub + "\n" + 
		"Multiplication is:" + Multi + "\n" + 
		"Division is:" + Div + "\n" + 
		"Modulus is:" + Mod);
		sc.close();
	}
}