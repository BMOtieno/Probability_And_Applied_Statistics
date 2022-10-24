package Distributions;

public class Geometric {
    public static void calculate(double q, double p){
        int difference = 5 - 1;
        double probabilityOfFailure = Math.pow(q, difference);
        double result = probabilityOfFailure * p;
        System.out.println("The result by Geometric Distribution: ");
        System.out.format("%.4f", result);
    }
}
