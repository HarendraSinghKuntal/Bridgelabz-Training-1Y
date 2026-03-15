import java.util.Scanner;
class AreaOfTriangle02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base");
		double Base = sc.nextDouble();
		System.out.println("Enter Height");
		double Height = sc.nextDouble();
		double AreaInCm = Base*Height*1/2;
		double AreaInInches = AreaInCm/(2.54*2.54);
		System.out.println("Area in Cm:" + AreaInCm + "\n" + "Area in Inches:" +AreaInInches);
		sc.close();
	}
}
		