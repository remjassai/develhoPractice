package Challenges.CP2two;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class cptwo {
    public static void main(String[] args) throws IOException {
        System.out.println(loadingLines("src/main/resources/cpTwoLoadingLines.txt"));
        System.out.println(prossesLines(loadingLines("src/main/resources/CPtwom.txt")));
        writeLines("src/main/resources/checkPointTwo.txt", prossesLines(loadingLines("src/main/resources/CPtwom.txt")));
    }

    public static List<String> loadingLines(String filePath)throws IOException {

        /*
        String testo = Files.readString(path);
        ArrayList<String> lines = new ArrayList<>(List.of(testo.split("\n")));
        return lines;
         */
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        List<String> lines = new ArrayList<>();
        while (br.ready()) {
            lines.add(br.readLine());
        }
        br.close();

        return Files.lines(new File(filePath).toPath()).toList();

    }
    //I've changed it to a TreeMap just for fun...order paranoid? :D
    public static TreeMap<String,Integer> prossesLines(List<String> lines) {
        TreeMap<String,Integer> process = new TreeMap<>();
        for(String line : lines){
            if (line.length() == 0) continue;
            if (!line.contains("$")){
                System.out.println("Errore di sistema! No $ found.");
            }else {
                String[] lineDivided = line.split("\\$");
                String firstPartOfTheLine = lineDivided[0].trim();
                int secondPartOfTheLine = lineDivided[1].trim().split(" ").length;
                process.put(firstPartOfTheLine, secondPartOfTheLine);
            }

        }
        return process;
    }

    public static void writeLines(String filePath, TreeMap<String,Integer> lines) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(writer);
        for (String word : lines.keySet()) {
            String line = word.toUpperCase()+" - "+lines.get(word)  +"\n";
            bw.write(line);
        }
        bw.flush();
        bw.close();
    }
}
