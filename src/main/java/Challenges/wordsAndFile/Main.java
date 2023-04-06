package Challenges.wordsAndFile;

import java.io.IOException;
import java.nio.file.Path;



public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println(FileAndWords.paroleInRima(Path.of("src/main/java/Challenges/wordsAndFile/PS.txt")));

    }
}
