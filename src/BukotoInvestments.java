public class BukotoInvestments {

    public static void main(String[] args) {
        double principal = 10000.0;
        double interestRate = 0.075;
        int investmentPeriod = 6;
        double totalInvestment = principal;

        // Using While Loop
        int month = 1;
        System.out.println();
        while (month <= investmentPeriod) {
            double interestEarned = principal * interestRate / 12;
            totalInvestment += interestEarned;
            System.out.printf("Month %d: Total Investment = %.2f\n", month, totalInvestment);
            month++;
        }


        // Using For Loop
//        for (int month = 1; month <= investmentPeriod; month++) {
//            double interestEarned = principal * interestRate / 12;
//            totalInvestment += interestEarned;
//            System.out.printf("Month %d: Total Investment = %.2f\n", month, totalInvestment);
//        }
    }
}


