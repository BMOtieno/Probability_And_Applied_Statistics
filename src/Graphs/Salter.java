package Graphs;

import java.util.Random;
public class Salter {
    // Salter
    public static double salt(double y) {
        Random rand = new Random();
        double yValues = rand.nextDouble() * 2; // Random numbers from y values
        return y * yValues;
    } // End Salter
}
