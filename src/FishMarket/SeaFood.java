package FishMarket;

import java.util.ArrayList;
public class SeaFood {
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
        fishMarket.getSeaFood();
    }
}
