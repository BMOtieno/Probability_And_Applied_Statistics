package SetOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sets {
    /**
     * A program that to determine the union, intersect and complement of two input arrays
     * @param <T> Generic input data to accommodate any primitive data type or object eg Integers, Strings etc
     * @return output of a given operation
     * @author Brian Otieno Odhiambo.
     *
     * **/
    //static method to find the union of two lists
    public static<T> void union(List<T> input, List<T> inputTwo){

        List<T> output = new ArrayList<>();

        output.addAll(input);
        output.addAll(inputTwo);
        //using Stream API to ensure there are no repeating data inputs once the union operation is done
        output = output.stream().distinct().collect(Collectors.toList());

        System.out.println("Union: " + output);
    }
    //static method to find the intersection of two lists
    public static<T> void intersect(List<T> input, List<T> inputTwo){

        input.retainAll(inputTwo);

        System.out.println("Intersect: " + input);
    }
    //static method to find the complement of two lists
    public static<T> void complement(List<T> sequence, List<T> sequenceTwo){

        sequence.removeAll(sequenceTwo);

        System.out.println("Complement: " + sequence);
    }
    // void method for the user to place the input data for a specific operation
    public void result(){
        //test data
        List<String> inputDataOne = new ArrayList<>();
        List<String> inputDataTwo = new ArrayList<>();

        inputDataOne.add("Monday");
        inputDataOne.add("Tuesday");
        inputDataOne.add("Wednesday");

        inputDataTwo.add("Monday");
        inputDataTwo.add("Thursday");
        inputDataTwo.add("Tuesday");

        List<Integer> inputDataThree = new ArrayList<>();
        List<Integer> inputDataFour = new ArrayList<>();

        inputDataThree.add(2);
        inputDataThree.add(4);
        inputDataThree.add(6);
        inputDataThree.add(8);
        inputDataThree.add(10);
        inputDataThree.add(12);

        inputDataFour.add(4);
        inputDataFour.add(6);
        inputDataFour.add(8);

        System.out.println("==================================");
        System.out.println("Welcome to Brian's Set Operations Program");
        System.out.println("For accuracy make sure you return to the main menu after " +
                "every operation");
        System.out.println("Here are the available options: " +
                "\n1. Union" +
                "\n2. Intersect" +
                "\n3. Complement " +
                "\nPlease select which operation you would like to use");
        System.out.println("===================================");
        System.out.println("Press any letter key to return to the main menu");
        System.out.println("==================================");
        //Efficient way to close resources is by wrapping them inside a try parenthesis
        try(Scanner scanner = new Scanner(System.in)){
            while(true){
                try{
                    System.out.println("Enter a number");
                    int response = Integer.parseInt(scanner.next());

                    switch (response){
                        case 1:
                            union(inputDataOne, inputDataTwo);
                            break;
                        case 2:
                            intersect(inputDataOne, inputDataTwo);
                            break;
                        case 3:
                            complement(inputDataOne, inputDataTwo);
                            break;
                        default:
                            System.out.println("Please type either option 1., 2. or 3.");
                    }
                }catch (Exception exception){
                    System.out.println("Return to the main menu?");
                    System.out.println("Press Y for yes or N for no");
                    String input = scanner.next();
                    if(input.equalsIgnoreCase("y")){
                        result();
                    }else{
                        System.out.println("Good bye");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
