package Mean_Median_Mode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mean {
    /**
     * A program that calculates the mean of numbers
     *
     * @param arrayOfNumbers stores the numbers that their average will be calculated
     * @return the average of the numbers that are in the arrayOfNumbers
     * @author Brian Otieno Odhiambo
     */

    //method to get the mean of the user input
    public static void getMean(List<Double> arrayOfNumbers)
    {
        double sum = 0.0;
        int count = arrayOfNumbers.size();
        System.out.println("Your numbers are: " + arrayOfNumbers);

        for(int i = 0; i < count; i++){
            sum += arrayOfNumbers.get(i);
        }
        System.out.println("The average is: " + sum/count);
        System.out.println("===========================");
    }
    //method to get the user input
    public void getUserInput(){
        List<Double> answersList = new ArrayList<>();

        System.out.println("==================================");
        System.out.println("Welcome to Brian's Mean Calculator");
        System.out.println("===================================");
        System.out.println("Press 'Q' to QUIT");
        System.out.println("==================================");

        //Efficient way to close resources by wrapping the scanner instance inside a try parenthesis
        try(Scanner scanner = new  Scanner(System.in)){
            while(true){
                try{
                    System.out.println("Enter a number");
                    double response = scanner.nextDouble();
                    answersList.add(response);

                }catch (Exception exception){
                    System.out.println("Please use numbers only");
                    getMean(answersList);
                    System.exit(0);
                }
            }
        }
    }
}

