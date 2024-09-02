package Library;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book book1=new Book("1984","Orwell",299.99);
        Book book2=new Book("The_Great_Gatsby_F.", "Scott_Fitzgerald", 10.99);
        Book book3=new Book ("To_Kill_a_Mockingbird", "Harper_Lee", 7.99);
        BookLibrary bl=new BookLibrary();
        bl.addBook(book1);
        bl.addBook(book2);
        bl.addBook(book3);
        String author=sc.next();
        System.out.println(bl.getBooksByAuthor(author));
        System.out.println(bl.getTotalValue());
    }
}

