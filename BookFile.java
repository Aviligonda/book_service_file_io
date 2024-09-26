package bookstrore;

import javax.management.StringValueExp;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookFile {
    public static void main(String[] args) {
        String[][] bookRecords = new String[2][4];
        bookRecords[0][0] = "ABC";
        bookRecords[0][1] = "BCD";
        bookRecords[0][2] = "CDE";
        bookRecords[0][3] = "DEF";

        bookRecords[1][0] = "EFG";
        bookRecords[1][1] = "FGH";
        bookRecords[1][2] = "GHI";
        bookRecords[1][3] = "HIJ";
        try {
            File file = new File("Books.txt");
            FileWriter writer = new FileWriter(file);
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    writer.write(bookRecords[i][j]+" ");
                }
                writer.write("\n");
            }
            writer.close();
            FileReader reader = new FileReader(file);
            int i;
            while ((i = reader.read()) != -1) {
                System.out.println((char) i);
            }
            reader.close();
//            Scanner scanner =new Scanner(reader);
//            while (scanner.hasNextLine()){
//                String data = scanner.nextLine();
//                System.out.println(" "+data+"\n");
//            }
        } catch (Exception e) {
            System.out.println("Exception Occurred");
        }
        System.out.println("Data Upload Successfully");

    }
}
