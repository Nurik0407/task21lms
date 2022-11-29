import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try (FileWriter fileWriter = new FileWriter("symbols.txt");) {
            for (char i = 'a', j = 'A'; i <= 'z'; i++, j++) {
                fileWriter.write(j + " " + i + "\n");
            }
            for (int i = 0; i < 10; i++) {
                fileWriter.write(i + "\n");
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        try {
            FileReader fileReader = new FileReader("symbols.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
    }
}