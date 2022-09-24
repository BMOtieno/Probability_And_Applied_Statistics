package Combinations_Permutations;
/**
 * Program that finds the number of possible combinations that can be obtained
 * by taking a sample of items from a large set.
 *
 * @author Brian Otieno Odhiambo.
 */
public class Combinations {
    /**
     * @param number numerical input
     * @return the factorial of number
     */
    public static long getCombinations(int number) {
        //Using recursion to get the factorial of number
        if(number == 0) return 1;
        return number * getCombinations(number - 1);
    }
    //static method that prints the output
    public static void result(int n, int r) {
        int difference = n- r;
        System.out.println("The combination result is " +(getCombinations(n))/((getCombinations(difference))*(getCombinations(r))));
    }
}
