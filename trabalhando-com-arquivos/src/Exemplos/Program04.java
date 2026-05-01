package Exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program04 {

    static void main() {

        String[] lines = new String[] { "Good morning", "Good Afternoon", "Good night"};

        String path = "C:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
