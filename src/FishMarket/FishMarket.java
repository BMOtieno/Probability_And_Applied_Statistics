package FishMarket;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class FishMarket {
    /**
     * Program that randomly generates seafood, assigns weight randomly and exports
     * the data to a CSV file
     *
     * @author Brian Otieno Odhiambo
     */
    static List<String> seafood = SeaFood.collectionOfSeaFood();
    public void getSeaFood(){
        Random random = new Random();
        double fishPrice = (random.nextInt(5)) / 5.0;
        double shrimpPrice = random.nextInt(10) / 10.0;
        double scallopPrice = random.nextInt(100) / 100.0;
        double crabPrice = random.nextInt(50) / 50.0;

        StringBuilder stringBuilder = new StringBuilder();
        //stored in a try parentheses to efficiently close resources
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FishMarket.csv"))){
            stringBuilder.append("Index");
            stringBuilder.append(',');
            stringBuilder.append("Type");
            stringBuilder.append(',');
            stringBuilder.append("Weight");
            stringBuilder.append(',');
            stringBuilder.append("Price");
            stringBuilder.append('\n');

            for(int i = 1; i < 301; i++){
                String selectedFood = seafood.get(random.nextInt(seafood.size()));
                //Generate Random Weight
                double weight = (random.nextInt() % 15) / 10.0;

                stringBuilder.append(i);
                stringBuilder.append(',');
                stringBuilder.append(selectedFood + '\t');
                //so that fish is caught more, and less scallop and crabs
                if(weight > 9.0) stringBuilder.append("Fish");
                stringBuilder.append(',');
                stringBuilder.append(weight + '\t');
                stringBuilder.append(',');
                    //to ensure that the price per lb stay the same with each of the seafood types
                    if(selectedFood.equals("Fish")) stringBuilder.append(fishPrice + '\t');
                    if(selectedFood.equals("Shrimp")) stringBuilder.append(shrimpPrice + '\t');
                    if(selectedFood.equals("Scallop")) stringBuilder.append(scallopPrice + '\t');
                    if(selectedFood.equals("Crab")) stringBuilder.append(crabPrice + '\t');
                stringBuilder.append('\n');
            }
            bufferedWriter.write(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
