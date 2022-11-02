package Graphs;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Smoother {
    // Smoother
    public static void smoothTheGraph() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("SmoothedGraph.csv"))){
            StringBuilder stringBuilder = new StringBuilder();
            //y = mx + c
            //m = 2
            int m = 2;
            int y = 0;
            int z = 0;
            int p = 0;
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
                stringBuilder.append(",");
                y = (m * (j - 2)) + 1;
                z = (m * (j + 2)) + 1;
                p = ((y + z) / 3) + 1;
                stringBuilder.append(p);
                stringBuilder.append("\n");
            }
            stringBuilder.append(",");
            bufferedWriter.write(stringBuilder.toString());
        }catch(Exception ex){
            System.out.println("Something wrong here");
        }
    }
}
