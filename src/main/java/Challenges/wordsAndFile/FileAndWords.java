package Challenges.wordsAndFile;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileAndWords {


    public static void stampaParole(Path file) throws IOException {
        FileReader fr = new FileReader(file.toFile()); // the file.toFile() creates a file object starting from the path you gave
        BufferedReader br = new BufferedReader(fr);  //
        while (br.ready()) {
            String[] parole = br.readLine().split(" ");
            Arrays.stream(parole).forEach(System.out::println);
        }
        br.close();
        Files.lines(file).forEach(riga -> {
            Arrays.stream(riga.split(" ")).forEach(System.out::println);
        });
    }

    public static Map<String, Integer> occorrenzaParole(Path file) throws IOException {
        FileReader fr = new FileReader(file.toFile());
        BufferedReader br = new BufferedReader(fr);
        Map<String, Integer> countParole = new HashMap<>();
        while (br.ready()) {
            String[] parole = br.readLine().split(" ");
            for (String parola : parole) {
                if (!countParole.containsKey(parola)) {
                    countParole.put(parola, 1);
                } else {
                    countParole.put(parola, countParole.get(parola) + 1);
                }
            }
        }
        br.close();
        return countParole;
    }

    public static Map<String, Integer> occorrenzaParoleTesto(Path file) throws IOException {
        FileReader fr = new FileReader(file.toFile());
        BufferedReader br = new BufferedReader(fr);
        Map<String, Integer> countParole = new HashMap<>();
        while (br.ready()) {
            String[] parole = br.readLine().toLowerCase().split("\\W+");
            for (String parola : parole) {
                if (parola.length() == 0) continue;
                if (!countParole.containsKey(parola)) {
                    countParole.put(parola, 1);
                } else {
                    countParole.put(parola, countParole.get(parola) + 1);
                }
            }
        }
        br.close();
        return countParole;
    }

    public static Map<String, ArrayList<String>> paroleInRima(Path file) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(file.toFile()));
        Map<String, ArrayList<String>> rime = new HashMap<>();
        while (br.ready()) {
            String[] rima = br.readLine().toLowerCase().split("\\W+");
            for (String parola : rima) {
                if (parola.length() < 4) continue;
                //Controlla se l'ultimo carattere non è una vocale caso in cui ignora la parola
                char ultimo = parola.charAt(parola.length() - 1);
                if (!(ultimo == 'a' || ultimo == 'e' || ultimo == 'i' || ultimo == 'o' || ultimo == 'u')) continue;
                String dittongo;
                char terzultimo = parola.charAt(parola.length() - 3);
                if (terzultimo == 'a' || terzultimo == 'e' || terzultimo == 'i' || terzultimo == 'o' || terzultimo == 'u') {
                    dittongo = parola.substring(parola.length() - 3);
                } else {
                    char quartultimo = parola.charAt(parola.length() - 4);
                    if (!(quartultimo == 'a' || quartultimo == 'e' || quartultimo == 'i' || quartultimo == 'o' || quartultimo == 'u'))
                        continue;

                    dittongo = parola.substring(parola.length() - 4);
                }
                //
                ArrayList<String> paroleDittongo = rime.getOrDefault(dittongo, new ArrayList<>());
                if (!paroleDittongo.contains(parola)) {
                    paroleDittongo.add(parola);
                    rime.put(dittongo, paroleDittongo);
                }
            }
        }
            br.close();
        return rime;
    }
}
