import java.util.Scanner;
class SquareSide{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Perimeter of Square:");
		double P = sc.nextDouble();
		double side = P/4;
		System.out.println("The Length of the side is" + side + "\n"+
		"and perimeter is" + P);
		sc.close();
	}
}