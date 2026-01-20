import java.util.Scanner;
class TotalPrice {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quantity:");
		double a = sc.nextDouble();
		System.out.println("Enter Unit Price:");
		double b = sc.nextDouble();
		double TP = a * b;
		System.out.println("The Total price is : INR" + TP + "\n" + 
		"Unit price is: INR" + b + "\n" + "Quantity Of Product is:"+a);
		sc.close();
	}
}