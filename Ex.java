package bookstrore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("Books.txt");
        // by using file reader class  to read the data
        int i;
        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
            // using scanner class to read the data
            Scanner read = new Scanner(reader);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                System.out.println(data);
                reader.close();

            }
        }
    }
}

