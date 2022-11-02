package Graphs;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Plotter {
    // Plotter
    public static void lineGraph() {
        // use buffered writer to write data into the csv file
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("LineGraph.csv"))){
            StringBuilder stringBuilder = new StringBuilder();
            int m = 2;
            int y = 0;
            stringBuilder.append("Index X");
            stringBuilder.append(",");
            stringBuilder.append("Index Y");
            stringBuilder.append("\n");
            for(int i = 0; i < 20; i++){
                stringBuilder.append(i);
                stringBuilder.append("\n");
            }
            stringBuilder.append("\t");
            for(int j = 0; j < 20; j++){
                //y = mx + c ---> y = 2x + 1
                stringBuilder.append(",");
                y = (m * j) + 1;
                stringBuilder.append(y);
                stringBuilder.append("\n");
            }
            stringBuilder.append(",");
            bufferedWriter.write(stringBuilder.toString());
        }catch(Exception ex){
            System.out.println("Something wrong here");
        }
    }
}
