import java.util.Scanner;
class HeightConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height in Cm:");
        double HC = sc.nextDouble();
        double Inches = HC / 2.54;
        double feet = Inches / 12;
        System.out.println("Your Height in Cm is: " + HC + "\n" +
                           "in feet is: " + feet + "\n" +
                           "in inches is: " + Inches);
        sc.close();
    }
}
