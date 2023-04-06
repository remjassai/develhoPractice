package Challenges.Vale;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class OperazioniFile {

    public static void sciviMappaSuFile(String fileName, Map<String,Integer> frequenza)throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for(Map.Entry<String,Integer> entry : frequenza.entrySet()){
            bw.write(entry.getKey().toUpperCase()+ " - " + entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
}
