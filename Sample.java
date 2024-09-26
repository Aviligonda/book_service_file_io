package bookstrore;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] properties = {"bookId", "bookName", "bookAuthor"};
        String[][] books = new String[2][3];
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                books[i][j] = scanner.next();
//            }
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println(properties[j] + " = " + books[i][j]);
//            }
//            System.out.println();
//        }

        try {
            FileWriter fileWriter = new FileWriter("sample.txt");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("Enter the " + properties[j]);
                    books[i][j] = scanner.next();
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(properties[j] + " = " + books[i][j]);
                    fileWriter.write(properties[j] + " = " + books[i][j] + "\n");
                }
                System.out.println();
                fileWriter.write("\n");

            }
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

