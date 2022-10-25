package Distributions;

public class Geometric {
    /**
     * Program that uses Geometric Distribution to solve the probability of a particular problem
     *
     * @param q floating point value to determine the probability of failure
     * @param p floating point value to determine the probability of success
     * @author Brian Otieno Odhiambo
     */
    public static void calculate(double q, double p){
        int difference = 5 - 1;
        double probabilityOfFailure = Math.pow(q, difference);
        double result = probabilityOfFailure * p;
        System.out.println("The result by Geometric Distribution: ");
        System.out.format("%.4f", result);
    }
}
