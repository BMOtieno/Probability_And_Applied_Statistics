package Distributions;

import java.text.DecimalFormat;

public class Poisson {
    /**
     * p(y)=λ^y/y! e^(-λ)
     */
    public static int factorial(int n){
        if(n < 1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }

    public static void operation(int a, double b){

        double lambda = a / b;

        double roundedOff = Math.round(lambda * Math.pow(10, 6)) / Math.pow(10, 6);

        //in the case of the text book exercise 3.128 y = 0

        int y = 0;

        double numerator = Math.pow(roundedOff, 0);
        double secondNumerator = Math.exp(roundedOff * -1);
        double denominator = factorial(y);

        double init = (numerator * secondNumerator) / denominator;
        double finalAnswer = 1 - init;

        System.out.println("The result by Poisson Distribution: ");
        System.out.format("%.4f", finalAnswer);

    }
}
