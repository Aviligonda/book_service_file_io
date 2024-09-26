package bookstrore;

import java.util.Scanner;

public class BookServiceSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of books ");
        int row = scanner.nextInt();
        int col = 15;
        int books ;
        int bookId ;
        String bookTitle;
        String bookAuthor ;
        String isbn ;
        String publisher ;
        String publishingDate ;
        String language ;
        int pageCount ;
        String reviews ;
        String synopsis ;
        int bookQuantity;
        double bookPrice ;
        String genre ;
        double bookWeight ;
        String bookLocation;
        System.out.println("Enter 1 to 14 numbers");
        int bookUpdate = scanner.nextInt();
            switch (bookUpdate){
                case 1 :
                    System.out.println("Enter Book Id");
                    bookId = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Enter Book Title");
                    bookTitle = scanner.next();
                    break;
                case 3:
                    System.out.println("Enter Book Author");
                    bookAuthor = scanner.next();
                    break;
                case 4:
                    System.out.println("Enter Book ISBN(International Standard Book Number)");
                    isbn = scanner.next();
                    break;
                case 5:
                    System.out.println("Enter Book publisher");
                    publisher = scanner.next();
                    break;
                case 6:
                    System.out.println("Enter Book publishingDate");
                    publishingDate = scanner.next();
                    break;
                case 7:
                    System.out.println("Enter Book language");
                    language = scanner.next();
                    break;
                case 8:
                    System.out.println("Enter Book PageCount");
                    pageCount = scanner.nextInt();
                    break;
                case 9:
                    System.out.println("Enter Book Reviews");
                    reviews = scanner.next();
                    break;
                case 10:
                    System.out.println("Enter Book synopsis");
                    synopsis = scanner.next();
                    break;
                case 11:
                    System.out.println("Enter Book Quantity");
                    bookQuantity = scanner.nextInt();
                    break;
                case 12:
                    System.out.println("Enter Book price");
                    bookPrice = scanner.nextDouble();
                    break;
                case 13:
                    System.out.println("Enter Book Genre");
                    genre = scanner.next();
                    break;
                case 14:
                    System.out.println("Enter Book Weight");
                    bookWeight = scanner.nextDouble();
                    break;
                case 15:
                    System.out.println("Enter Book Location");
                    bookLocation = scanner.nextLine();
                    break;
                default:
                    System.out.println("You Choose wrong number");

            }
    }
}
