package bookstrore;

import java.util.Scanner;

public class BookService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No of Books");
        int books = scanner.nextInt();
        int[] bookId = new int[books];
        String[] bookTitle = new String[books];
        String[] bookAuthor = new String[books];
        String[] isbn = new String[books];
        String[] publisher = new String[books];
        String[] publishingDate = new String[books];
        String[] language = new String[books];
        int[] pageCount = new int[books];
        String[] reviews = new String[books];
        String[] synopsis = new String[books];
        int[] bookQuantity = new int[books];
        double[] bookPrice = new double[books];
        String[] genre = new String[books];
        double[] bookWeight = new double[books];
        String[] bookLocation = new String[books];

        for (int i = 0; i < books; i++) {


            System.out.println("Enter Book Id");
            bookId[i] = scanner.nextInt();

            System.out.println("Enter Book Title");
            bookTitle[i] = scanner.next();

            System.out.println("Enter Book Author");
            bookAuthor[i] = scanner.next();

            System.out.println("Enter Book ISBN(International Standard Book Number)");
            isbn[i] = scanner.next();

            System.out.println("Enter Book publisher");
            publisher[i] = scanner.next();

            System.out.println("Enter Book publishingDate");
            publishingDate[i] = scanner.next();

            System.out.println("Enter Book language");
            language[i] = scanner.next();

            System.out.println("Enter Book PageCount");
            pageCount[i] = scanner.nextInt();

            System.out.println("Enter Book Reviews");
            reviews[i] = scanner.next();

            System.out.println("Enter Book synopsis");
            synopsis[i] = scanner.next();

            System.out.println("Enter Book Quantity");
            bookQuantity[i] = scanner.nextInt();

            System.out.println("Enter Book price");
            bookPrice[i] = scanner.nextDouble();

            System.out.println("Enter Book Genre");
            genre[i] = scanner.next();

            System.out.println("Enter Book Weight");
            bookWeight[i] = scanner.nextDouble();

            System.out.println("Enter Book Location");
            bookLocation[i] = scanner.nextLine();
        }
        System.out.println("-------------------------");
        for (int i = 0; i < books; i++) {
            System.out.println("Book Details");
            System.out.println("Book ID  :" + bookId[i]);
            System.out.println("Book Title  :" + bookTitle[i]);
            System.out.println("Book Author  :" + bookAuthor[i]);
            System.out.println("Book isbn  :" + isbn[i]);
            System.out.println("Book publisher  :" + publisher[i]);
            System.out.println("Book publishingDate  :" + publishingDate[i]);
            System.out.println("Book language  :" + language[i]);
            System.out.println("Book PageCount  :" + pageCount[i]);
            System.out.println("Book Reviews  :" + reviews[i]);
            System.out.println("Book synopsis  :" + synopsis[i]);
            System.out.println("Book quantity  :" + bookQuantity[i]);
            System.out.println("Book price  :" + bookPrice[i]);
            System.out.println("Book Genre  :" + genre[i]);
            System.out.println("Book Weight  :" + bookWeight[i]);
            System.out.println("Book Location  :" + bookLocation[i]);
            System.out.println("----------------------------------------------");
        }
    }
}
