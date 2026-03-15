import java.util.Scanner;
class KmToMiles08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance in Kms:");
        double kms = sc.nextDouble();
        double miles = kms*1.6;
        System.out.println("The Total Miles is: " + miles);
        sc.close();
    }
}
