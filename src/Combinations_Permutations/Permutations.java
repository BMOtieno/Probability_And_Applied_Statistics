package Combinations_Permutations;

public class Permutations {
    /**
     * Program that finds the number of ways to choose a sample of r elements
     * from a set of n distinct objects where order does not matter
     *
     * @param number numerical input
     * @return the factorial of the input
     * @author Brian Otieno Odhiambo
     */
    public static long getPermutations(int number) {
        //Using recursion to get the factorial of number
        if(number == 0) return 1;
        return number * getPermutations(number - 1);
    }
    //static method that prints the result
    public static void result(int n, int r) {
        int difference = n - r;
        long answer = getPermutations(n) / getPermutations(difference);
        System.out.println("The permutation result is " + answer);
    }
}
