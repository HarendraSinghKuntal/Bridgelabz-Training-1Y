import java.util.Scanner;
class DistanceConvertsc{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance in feet:");
		double DistInFeet = sc.nextDouble();
		double yards = DistInFeet/3;
		double miles = yards/1760;
		System.out.println("Distance in feet is:" + DistInFeet + "\n"+ 
		"Distance in yards is:" + yards + "and in miles is:" +miles);
		sc.close();
	}
}