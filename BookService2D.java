package bookstrore;

import java.util.Scanner;

public class BookService2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of books ");
        int row = scanner.nextInt();
        int col = 15;
        String[][] book = new String[row][col];
        //Enter Book Details by using keyboard through console 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("Enter Book Id");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book Title");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book Author");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book ISBN(International Standard Book Number)");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book publisher");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book publishingDate");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book language");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book PageCount");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book Reviews");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book synopsis");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book Quantity");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book price");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book Genre");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book Weight");
                book[i][j] = scanner.next();
                j += 1;
                System.out.println("Enter Book Location");
                book[i][j] = scanner.next();
            }
        }
        // printing All Book Details
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Book[" + i + "][" + j + "] = " + book[i][j]);
            }
        }

    }
}
