class DiscountedFees {
    public static void main(String[] args) {
        double a = 125000;
        double DA = (a * 10) / 100;
        double ToPayFees = a - DA;
        System.out.println("Discounted Amount: " + DA + "\n" +
                           "Discounted Fees: " + ToPayFees);
    }
}
