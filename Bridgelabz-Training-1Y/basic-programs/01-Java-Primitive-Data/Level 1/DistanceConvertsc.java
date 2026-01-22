import java.util.Scanner;
class DistanceConvertsc {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance");
		double DistinFeet= sc.nextDouble();
		double yards = DistinFeet/3;
		double miles = yards/1760;
		System.out.println("Distance in feet is:" + DistinFeet + "\n" +
		"Distance in yards is:" + yards + "and in miles is:" + miles);
		sc.close();
	}
}