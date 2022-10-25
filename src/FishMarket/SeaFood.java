package FishMarket;

import java.util.ArrayList;
public class SeaFood {
    //method to store all the seafood
    public static ArrayList<String> collectionOfSeaFood(){
        ArrayList<String> seaFood = new ArrayList<>();
        seaFood.add("Fish");
        seaFood.add("Shrimp");
        seaFood.add("Scallop");
        seaFood.add("Crab");

        return seaFood;
    }
    public static void main(String[] args) {
        FishMarket fishMarket = new FishMarket();
        //call to the FishMarket class
        fishMarket.getSeaFood();
    }
}
