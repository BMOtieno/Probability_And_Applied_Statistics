package Graphs;

import java.util.ArrayList;

public class Smoother {
    // Smoother
    public static void smooth(ArrayList<Double> yValue, int xArea) {

        for (int i = 0; i < yValue.size(); i++) { // Loop through y values
            double value = yValue.get(i);
            int count = 1; // Set count at 1
            for (int j = 1; j <= xArea; j++) {
                if (i - j >= 0) {
                    value += yValue.get(i - j);
                    count++;
                } // End if
                if (i + j < yValue.size()) {
                    value += yValue.get(i + j);
                    count++;
                } // End if
            } // End inner for

            value = value / count; // Average y values
            yValue.set(i, value); // Replace with average
        } // End outer for

    } // End Smoother

}
