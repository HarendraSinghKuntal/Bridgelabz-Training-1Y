import java.util.Scanner;
class FeeDiscountSc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fee Amount:");
        double fee = sc.nextDouble();
        System.out.println("Enter Discount Percent:");
        double DiscountPercent = sc.nextDouble();
        double Discount = (fee * DiscountPercent) / 100;
        double LastFees = fee - Discount;
        System.out.println("The Discount Amount is: " + Discount + "\n" +
                          "and the Last Fees is: " + LastFees);
        sc.close();
    }
}
