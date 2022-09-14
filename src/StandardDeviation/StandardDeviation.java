package StandardDeviation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandardDeviation {
    /**
     * This is a program that finds the Standard Deviation and Variance of an input data
     *
     * @author Brian Otieno Odhiambo
     * @param numbers are the set to double to accommodate both integers and floating point values
     * @return the variance and the standard deviation of the input data
     *
     */
    public void getStandardDeviation(List<Double> numbers){

        double sum = 0.0, stanDev = 0.0;
        int len = numbers.size();

        for(double index: numbers){
            sum += index;
        }

        double mean = sum / len;

        for(double secondIndex: numbers){
            stanDev += Math.pow((secondIndex - mean), 2);
        }

        double variance = stanDev/(len - 1);
        double standardDeviation = Math.sqrt(variance);

        System.out.println("The variance is: " + variance);
        System.out.println("The standard deviation is " + standardDeviation);
    }

    //method to prompt the user to input data
    public void getUserInput(){
        List<Double> answersList = new ArrayList<>();

        System.out.println("==================================");
        System.out.println("Welcome to Brian's Standard Deviation/ Variance Calculator");
        System.out.println("===================================");
        System.out.println("Press 'Q' to QUIT");
        System.out.println("==================================");
        //Efficient way to close resources is by wrapping them inside a try parenthesis
        try(Scanner scanner = new Scanner(System.in)){
            while(true){
                try{
                    System.out.println("Enter a number");
                    double response = scanner.nextDouble();
                    answersList.add(response);

                }catch (Exception exception){
                    System.out.println("Please use numbers only");
                    getStandardDeviation(answersList);
                    System.exit(0);
                }
            }
        }
    }
}
