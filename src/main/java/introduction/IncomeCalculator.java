package introduction;

import java.util.Arrays;

public class IncomeCalculator {

       //Please provide implementation to return the best possible income assuming that only one buy and one sell transaction is possible
        public double calculateBestIncome(double[] dailyPrices) {
            double max = -9999;
            for(int i=0; i<dailyPrices.length; i++) {
                for(int j=i+1; j<dailyPrices.length; j++) {
                    double difference = dailyPrices[j] - dailyPrices[i];
                    if(difference>max) {
                        max = difference;
                    }
                }
            }
            return max;
        }


        public static void main(String []args) {
           IncomeCalculator incomeCalculator = new IncomeCalculator();
            double[] dailyPrices = {1200.00, 100.00, 120.0, 100.0, 120.0, 500.0};

           System.out.println("Best income: " + incomeCalculator.calculateBestIncome(dailyPrices));
        }

}
