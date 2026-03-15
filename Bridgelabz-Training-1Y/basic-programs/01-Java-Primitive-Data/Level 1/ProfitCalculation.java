class ProfitCalculation {
    public static void main(String[] args) {
        int CP = 129;
        int SP = 191;
        int Profit = SP - CP;
        double ProfitPercentage = (Profit * 100.0) / CP;
        System.out.println("The Profit is INR " + Profit +
                " and the Profit Percentage is " + ProfitPercentage + "%");
    }
}
