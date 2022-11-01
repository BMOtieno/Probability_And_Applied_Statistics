package Graphs;

import java.io.BufferedWriter;
import java.io.FileWriter;
public class Salter {
    // Salter
    public static void getSaltedGraph(){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("SaltedGraph.csv"))){
            StringBuilder stringBuilder = new StringBuilder();
            int m = 2;
            int y = 0;
            int z = 0;
            stringBuilder.append("index x");
            stringBuilder.append(",");
            stringBuilder.append("index y");
            stringBuilder.append("\n");
            for(int i = 0; i < 20; i++){
                stringBuilder.append(i);
                stringBuilder.append("\n");
            }
            stringBuilder.append("\t");
            for(int j = 0; j < 10; j++){
                stringBuilder.append(",");
                y = (m * (j - 2)) + 1;
                stringBuilder.append(y);
                stringBuilder.append("\n");
                stringBuilder.append(",");
                z = (m * (j + 2)) + 1;
                stringBuilder.append(z);
                stringBuilder.append("\n");
            }
            stringBuilder.append(",");
            bufferedWriter.write(stringBuilder.toString());
        }catch(Exception ex){
            System.out.println("Something wrong here");
        }
    }
}
