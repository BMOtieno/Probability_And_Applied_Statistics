package Mean_Median_Mode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Median {
    /**
     * A program that calculates the median of numbers
     *
     * @param arrayOfNumbers stores the numbers that their median will be determined
     * @return the median of the numbers that are in the arrayOfNumbers
     * @author Brian Otieno Odhiambo
     */
    public static void getMedian(List<Double> arrayOfNumbers){

        double resultOfOddLength = 0.0;
        double resultOfEvenLength = 0.0;
        int count = arrayOfNumbers.size();

        System.out.println("Your numbers are: " + arrayOfNumbers);
        //for instance that the size is odd
        if(count % 2 == 1){
            resultOfOddLength = arrayOfNumbers.get(count/2);
            System.out.println("The median is: " + resultOfOddLength);
            System.out.println("==================================");
            //for instance that the size is even
        }else if(count % 2 == 0){
            resultOfEvenLength = (arrayOfNumbers.get(count/2) + arrayOfNumbers.get((count/2)-1))/2;
            System.out.println("The median is: " + resultOfEvenLength);
            System.out.println("==================================");
        }
    }

    public void getUserInput(){
        List<Double> numbers = new ArrayList<>();
        System.out.println("====================================");
        System.out.println("Welcome to Brian's median calculator");
        System.out.println("====================================");
        System.out.println("Press 'Q' TO QUIT");
        System.out.println("=====================================");

        try(Scanner scanner = new Scanner(System.in)){
            while(true){
                try{
                    //Get input from the user
                    System.out.println("Enter your number");
                    double numberEntered = scanner.nextDouble();
                    numbers.add(numberEntered);
                }catch(Exception exception){
                    System.out.println("Please type in only numbers");
                    getMedian(numbers);
                    System.exit(0);
                }
            }
        }
    }
}
