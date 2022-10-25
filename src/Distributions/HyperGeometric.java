package Distributions;

public class HyperGeometric {
    /**
     * Program that uses HyperGeometric Distribution to solve the probability of a particular problem
     *
     * @param number that will go through the recursive method to perform the operation of calculating the combinations
     * @return the factorial of the input integer
     * @author Brian Otieno Odhiambo
     */
    public static long getCombinations(int number) {
        //Using recursion to get the factorial of number
        if(number == 0) return 1;
        return number * getCombinations(number - 1);
    }

    public static void output(int M, int K){
         int N = 10;
         int n = 3;

         int difference = M - K;
         int diff1 = N - M;
         int diff2 = n - K;
         int diff3 = diff1 - diff2;
         int diff4 = N - n;

         double firstCombo = (getCombinations(M))/((getCombinations(difference))*(getCombinations(K)));
         double secondComb0 = (getCombinations(diff1))/((getCombinations(diff3))*(getCombinations(diff2)));
         double thirdCombo = (getCombinations(N))/((getCombinations(diff4))*(getCombinations(n)));

         double solution = (firstCombo * secondComb0) / thirdCombo;

        System.out.println("The result by HyperGeometric Distribution: ");
        System.out.format("%.4f", solution);



    }
}
