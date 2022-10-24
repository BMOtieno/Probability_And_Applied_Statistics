package Graphs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PlotGraphs {
    public static void output(){
        String fileName = "Graphing.csv";
        PrintWriter outputStream = null;

        // Try-Catch block for csv file
        try {
            outputStream = new PrintWriter(new FileOutputStream(fileName, true));
        }
        catch(FileNotFoundException e) {
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }

        ArrayList<Double> yValue = new ArrayList<>();
        ArrayList<Double> xValue = new ArrayList<>();
        ArrayList<Double> ySalted = new ArrayList<>();

        int xBegin = -10; // Parameters for x values
        int xEnd = 10;

        for (double i = xBegin; i <= xEnd; i += .5) { // x values

            yValue.add(Plotter.function(i));
            xValue.add(i);

            outputStream.println((i) + "," + Plotter.function(i));

        }
        outputStream.println();

        for (int i = 0; i < yValue.size(); i++) { // Salt the data

            ySalted.add(Salter.salt(yValue.get(i)));

            outputStream.println(xValue.get(i) + "," + ySalted.get(i));

        }
        System.out.println();

        outputStream.println();

        int xArea = 10; // Area size

        Smoother.smooth(yValue, xArea); // Smooth the data

        for (int i = 0; i < xValue.size(); i++) {

            outputStream.println((xValue.get(i)) + "," + yValue.get(i));
        }
        System.out.println();

        Smoother.smooth(yValue, xArea); // Smooth the data again for more accuracy/precision

        for (int i = 0; i < xValue.size(); i++) {

            outputStream.println((xValue.get(i)) + "," + yValue.get(i));
        }
        outputStream.println();

        outputStream.close(); // Close PrintWriter

    }

    }

