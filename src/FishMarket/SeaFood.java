package FishMarket;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SeaFood {
    static List<String> seafood = Arrays.asList("Fish", "Shrimp", "Scallop" , "Crab");
    public void constructSeaFood(){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
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
                stringBuilder.append(i);
                stringBuilder.append(',');
                stringBuilder.append(seafood.get(random.nextInt(seafood.size())) + '\t');
                stringBuilder.append(',');
                stringBuilder.append(random.nextInt(10)/10.0 + '\t');
                stringBuilder.append(',');
                stringBuilder.append(random.nextInt(100)/100.0 + '\t');
                stringBuilder.append('\n');
            }
            bufferedWriter.write(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        SeaFood seaFood = new SeaFood();
        seaFood.constructSeaFood();
    }
}
