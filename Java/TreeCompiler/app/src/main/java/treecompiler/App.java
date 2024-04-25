/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package treecompiler;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Tree's Stuff\\tree_compiler\\input.txt");
        Scanner scnr = new Scanner(fis);
        outputToFile(scnr);
    }

    public static void outputToFile(Scanner scanner) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Tree's Stuff\\tree_compiler\\output.txt");
        String data = "";
        while (scanner.hasNextLine()) {
            data = data + scanner.nextLine();
        }
        byte[] array = data.getBytes();
        fos.write(array);
        fos.flush();
        fos.close();
    }
}
