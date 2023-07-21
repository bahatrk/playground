import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("./resource/bird.txt")) {
            try(BufferedReader in = new BufferedReader(fr)) {
                String line;
                while((line = in.readLine()) != null)
                {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}