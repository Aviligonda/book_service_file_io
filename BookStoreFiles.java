package bookstrore;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BookStoreFiles {
    public static void main(String[] args) {
        String[][] bookRecords = new String[2][12];
        bookRecords[0][0] = "Aaa";
        bookRecords[0][1] = "Bbb";
        bookRecords[0][2] = "Ccc";
        bookRecords[0][3] = "Ddd";
        bookRecords[0][4] = "Eee";
        bookRecords[0][5] = "Fff";
        bookRecords[0][6] = "Ggg";
        bookRecords[0][7] = "Hhh";
        bookRecords[0][8] = "Iii";
        bookRecords[0][9] = "Jjj";
        bookRecords[0][10] = "Kkk";
        bookRecords[0][11] = "Lll";

        bookRecords[1][0] = "Mmm";
        bookRecords[1][1] = "Nnn";
        bookRecords[1][2] = "Ooo";
        bookRecords[1][3] = "Ppp";
        bookRecords[1][4] = "Qqq";
        bookRecords[1][5] = "Rrr";
        bookRecords[1][6] = "Sss";
        bookRecords[1][7] = "Ttt";
        bookRecords[1][8] = "Uuu";
        bookRecords[1][9] = "Vvv";
        bookRecords[1][10] = "Www";
        bookRecords[1][11] = "Xxx";
        try {
            // Check the location of a file in the system or not

            File file = new File("BookRecords.txt");

            /* Write the data into text file by using file writer
             if using true in file (like FileWriter(file, true) ) it will not delete existing
             data add to the that data or append the data */
            FileWriter writer = new FileWriter(file);
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 12; j++) {
                    writer.write(bookRecords[i][j] + " ");
                }
                writer.write("\n");
            }
            writer.close(); // close file writer class

            // Read the file by using file reader
            FileReader fileReader = new FileReader(file);
            int i;
            while ((i=fileReader.read())!=-1){
                System.out.print((char)i);
            }
            fileReader.close(); // close the file reader class
            System.out.println("Data Upload Successfully");
        } catch (Exception e) {
            System.out.println("Exception Occurred");
        }


    }
}
