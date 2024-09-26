package bookstrore;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BookServiceThroughConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Using a 1D to store all the properties of book
        String[] bookProperties = {"bookId", "bookTitle", "bookAuthor", "isbn", "publisher",
                "publishingDate", "language", "pageCount", "reviews", "bookQuantity", "bookPrice",
                "bookWeight", "bookLocation"};

        System.out.println("Enter no of books");
        int row = scanner.nextInt();
        /* using to store the properties of books with values using 2D array
        in this line row is no bof book do want to enter bookProperties is attributes of the books */
        String[][] bookRecord = new String[row][bookProperties.length];

        // Using for loop to store all data into bookRecord variable
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < bookProperties.length; j++) {

                // it's show which value you enter to the bookProperties
                System.out.println("Enter the " + bookProperties[j]);

                //  save that value into bookRecord
                bookRecord[i][j] = scanner.next();
            }
            System.out.println("---------------------");
        }
        try {
            // locate the file in your there or not
            File file = new File("BookProperties.txt");

            // create the fileWriter class
            FileWriter writer = new FileWriter(file);

            // create the fileReader class
            FileReader fileReader = new FileReader(file);

            // to print the date by using this loops
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < bookProperties.length; j++) {

                    // write the data into a file
                    writer.write(bookProperties[j] + " = " + bookRecord[i][j] + "\n");
                }
                writer.write("--------------------\n");
            }
            writer.close(); // close the writer class

            // read the file through console
            int readFile;
            while ((readFile = fileReader.read()) != -1) {
                System.out.print((char) readFile);
            }
            fileReader.close();// close the reader class
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
