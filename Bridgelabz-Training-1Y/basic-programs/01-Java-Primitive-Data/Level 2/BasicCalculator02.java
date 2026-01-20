import java.util.Scanner;
class BasicCalculator02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		double a = sc.nextDouble();
		System.out.println("Enter Second Number");
		double b = sc.nextDouble();
		double add = a+b;
		double sub = a-b;
		double multi = a*b;
		double div = a/b;
		System.out.println("Addition:" + add + "\n" + "Subtraction:" + sub + "\n" +
		"Multiplication:" + multi + "\n" + "Division:"+div);
		sc.close();
	}
}
		