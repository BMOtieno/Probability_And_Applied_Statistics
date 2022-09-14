package Mean_Median_Mode;

import java.util.*;

public class Mode {
    /**
     * A program that calculates the mode of numbers
     *
     * @param arrayOfNumbers stores the numbers that their most common integer will be determined
     * @return the mode of the numbers that are in the arrayOfNumbers
     * @author Brian Otieno Odhiambo
     */
    public static void getMode(List<Double> arrayOfNumbers){
        //Creating HashMap object with the numbers as keys and their occurrences as values
        HashMap<Double, Integer> elementCountMap = new HashMap<Double, Integer>();
        //Inserting all the numbers of the arrayOfNumbers into elementCountMap
        for (double i : arrayOfNumbers)
        {
            if (elementCountMap.containsKey(i))
            {
                //If an element is present, incrementing its count by 1
                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else
            {
                //If an element is not present, put that element with 1 as its value
                elementCountMap.put(i, 1);
            }
        }

        double element = 0.0;
        int frequency = 1;
        //Iterating through elementCountMap to get the most common number and its frequency
        Set<Map.Entry<Double, Integer>> entrySet = elementCountMap.entrySet();

        for (Map.Entry<Double, Integer> entry : entrySet)
        {
            if(entry.getValue() > frequency)
            {
                element = entry.getKey();
                frequency = entry.getValue();
            }
        }
        //Printing the most common number in the list and its frequency
        if(frequency > 1)
        {
            System.out.println("Your numbers are : " + arrayOfNumbers);
            System.out.println("The mode is : "+ element);
            System.out.println("Number of appearance : "+ frequency);
            System.out.println("==================================");
        }
        else
        {
            System.out.println("Your numbers are : "+ arrayOfNumbers);
            System.out.println("Most common number not present.");
            System.out.println("=================================");
        }
    }

    //method to prompt the user to enter data
    public void getUserInput(){
        List<Double> answersList = new ArrayList<>();

        System.out.println("==================================");
        System.out.println("Welcome to Brian's Mode Calculator");
        System.out.println("If multiple numbers are equally common, the first one will be picked");
        System.out.println("===================================");
        System.out.println("Press 'Q' to QUIT");
        System.out.println("==================================");

        try(Scanner scanner = new Scanner(System.in)){
            while(true){
                try{
                    System.out.println("Enter a number");
                    double response = scanner.nextDouble();
                    answersList.add(response);

                }catch (Exception exception){
                    System.out.println("Please use numbers only");
                    getMode(answersList);
                    System.exit(0);
                }
            }
        }
    }
}
