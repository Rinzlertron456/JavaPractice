package Library;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book book=new Book("1984","Orwell",299.99);
        BookLibrary.addBook(book);
//        int n=sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            String title=sc.next();
//            String author=sc.next();
//            Double price=sc.nextDouble();
//            Book book=new Book(title,author,price);
//
//        }
        System.out.println();
        System.out.println();
    }
}

