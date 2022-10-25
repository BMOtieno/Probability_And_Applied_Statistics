package Distributions;

public class Binomial {
    /**
     * Program that uses Binomial Distribution to solve the probability of a particular problem
     *
     * @param number that will go through the recursive process to get it's factorial
     * @return factorial of the input integer
     * @author Brian Otieno Odhiambo
     */
    public static long getCombinations(int number) {
        //Using recursion to get the factorial of number
        if(number == 0) return 1;
        return number * getCombinations(number - 1);
    }
    //static method that prints the output
    public static void result(int n, int x) {
        int difference = n- x;
        //probability of success
        double p =0.8;
        //probability of failure
        double q = 0.2;
        //solve for the Binomial Distribution
        double combination = (getCombinations(n))/((getCombinations(difference))*(getCombinations(x)));
        double powerOfP = Math.pow(p,x);
        int subtractNX = n - x;
        double powerOfQ = Math.pow(q,subtractNX);
        double answer = combination * powerOfP * powerOfQ;
        System.out.println("The result by binomial distribution: ");
        System.out.format("%.4f", answer);
    }
}
